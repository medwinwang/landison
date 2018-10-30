package com.medwin.landison.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.medwin.landison.common.MD5Util;
import com.medwin.landison.dao.OrderRepository;
import com.medwin.landison.dao.SmsRepository;
import com.medwin.landison.dao.UserRepository;
import com.medwin.landison.entity.LdsOrderEntity;
import com.medwin.landison.entity.LdsSmsLogEntity;
import com.medwin.landison.entity.LdsUserEntity;
import com.medwin.landison.service.LdsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

/**
 * Created by medwin on 2018/10/19.
 */
@Service
public class LdsServiceImpl implements LdsService {


    @Autowired
    private SmsRepository smsRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void addSmsLog(Integer userId, String content, int type) {

        LdsSmsLogEntity entity = new LdsSmsLogEntity();
        entity.setUserId(userId);
        entity.setContent(content);
        entity.setType(type);
        smsRepository.save(entity);
    }

    @Override
    public void addUser(String username, String password, String info) {

        LdsUserEntity entity = new LdsUserEntity();
        entity.setUsername(username);
        entity.setPassword(MD5Util.md5(password));
        entity.setInfo(info);
        entity.setLoginNum(0);
        userRepository.save(entity);
    }

    @Override
    public void loginUser(String username, String password, String info) {

        LdsUserEntity user = userRepository.findByUsername(username);
        if(user == null) {
           addUser(username,password,info);
        }
        userRepository.loginUser(username, info, new Date());
    }

    @Override
    public void addOrder(String username, String info, String orderId, String reservationType, String status,
                         BigDecimal totalAmount) {

        LdsOrderEntity entity = new LdsOrderEntity();
        if(!StringUtils.isEmpty(username)) {
            LdsUserEntity user = userRepository.findByUsername(username);
            if(user != null) {
                entity.setUserId(user.getId());
            }
        }
        entity.setInfo(info);
        entity.setReservationType(reservationType);
        entity.setTotalAmount(totalAmount);
        entity.setStatus(status);
        entity.setOrderId(orderId);
        orderRepository.save(entity);
    }

    @Override
    public void checkOrder(String orderId, String payInfo, String status, String payCode, String tradeNo, String buyerId) {

        LdsOrderEntity entity = orderRepository.findByOrOrderId(orderId);
        if(entity != null) {
            entity.setPayInfo(payInfo);
            entity.setPayStatus(status);
            entity.setTradeNo(tradeNo);
            entity.setPayCode(payCode);
            entity.setBuyerId(buyerId);
            orderRepository.save(entity);
        }
    }

    @Override
    public LdsOrderEntity getOrderByOrderId(String orderId) {
        return orderRepository.findByOrOrderId(orderId);
    }
}
