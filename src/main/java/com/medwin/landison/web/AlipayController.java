package com.medwin.landison.web;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.internal.util.StringUtils;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.medwin.landison.common.BaseResult;
import com.medwin.landison.config.AlipayConfig;
import com.medwin.landison.entity.LdsOrderEntity;
import com.medwin.landison.exception.SystemException;
import com.medwin.landison.kms.reservationservice.DataType;
import com.medwin.landison.kms.reservationservice.PayMentStatus;
import com.medwin.landison.service.LdsService;
import com.medwin.landison.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/**
 * Created by medwin on 2018/10/30.
 */
@Slf4j
@Controller
@RequestMapping("/alipay")
public class AlipayController {

    @Autowired
    private AlipayConfig alipayConfig;

    @Autowired
    private LdsService ldsService;

    @Autowired
    private UserService userService;

    @GetMapping("/pay")
    @ResponseBody
    private String pay(String orderId, String subject, String body) throws AlipayApiException, SystemException {

        LdsOrderEntity ldsOrderEntity = ldsService.getOrderByOrderId(orderId);
        if(ldsOrderEntity == null) {
            throw new SystemException("订单不存在");
        }
        if(!LdsOrderEntity.TYPE_PRE.equals(ldsOrderEntity.getReservationType())) {
            throw new SystemException("不是在线支付订单");
        }
        AlipayClient alipayClient = new DefaultAlipayClient(alipayConfig.getServer(), alipayConfig.getAppId(),
                alipayConfig.getPrivateKey(), alipayConfig.getFormat(), alipayConfig.getCharset(),
                alipayConfig.getPrivateKey(), alipayConfig.getSign());

        // 设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(alipayConfig.getReturnUrl());
        alipayRequest.setNotifyUrl(alipayConfig.getNotifyUrl());

        if(StringUtils.isEmpty(subject)){
            subject = "客房预订";
        }

        alipayRequest.setBizContent("{\"out_trade_no\":\"" + ldsOrderEntity.getOrderId() + "\","
                + "\"total_amount\":\"" + ldsOrderEntity.getTotalAmount() + "\","
                + "\"subject\":\"" + subject + "\","
                + "\"body\":\"" + body + "\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        log.info("alipay pay: {}", alipayRequest.getBizContent());

        String result = alipayClient.pageExecute(alipayRequest).getBody();
        log.info("alipay pay result: {}", result);

        return result;
    }

    @PostMapping("/notify")
    private String notify(HttpServletRequest request, String out_trade_no, String trade_no, String trade_status,
                          Double receipt_amount, String buyer_id){

        Map<String, String> map = new HashMap<String, String>();
        Map<String, String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext(); ) {
            String name = iter.next();
            String[] values = requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
                System.out.println(valueStr);
            }
            map.put(name, valueStr);
        }
        boolean signVerified = false;
        try {
            signVerified = AlipaySignature.rsaCheckV1(map, alipayConfig.getPublicKey(), alipayConfig.getCharset(),
                    alipayConfig.getSign());
        } catch (AlipayApiException e) {
            e.printStackTrace();
            return ("fail");// 验签发生异常,则直接返回失败
        }
        if (signVerified) {
            //处理你的业务逻辑，更细订单状态等
            if("TRADE_SUCCESS".equals(trade_status)){//订单成功
                userService.checkOrder(out_trade_no, receipt_amount, buyer_id, trade_no, PayMentStatus.PAID, "",
                        "AP", DataType.RESVROOM, PayMentStatus.PAID);
            }
            return ("success");
        } else {
            log.info("验证失败,不去更新状态");
            return ("fail");
        }
    }

    @GetMapping("/return")
    private String alipayReturn(Map<String, String> params, HttpServletRequest request, String out_trade_no,
                                String trade_no, String total_amount)
            throws AlipayApiException {

        Map<String, String> map = new HashMap<String, String>();
        Map<String, String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext(); ) {
            String name = iter.next();
            String[] values = requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
                System.out.println(valueStr);
            }
            map.put(name, valueStr);
        }
        boolean signVerified = false;
        try {
            signVerified = AlipaySignature.rsaCheckV1(map, alipayConfig.getPublicKey(), alipayConfig.getCharset(),
                    alipayConfig.getSign());
        } catch (AlipayApiException e) {
            e.printStackTrace();
            return ("fail");// 验签发生异常,则直接返回失败
        }
        if (signVerified) {
            return ("success");
        } else {
            log.info("验证失败,不去更新状态");
            return ("fail");
        }
    }

}
