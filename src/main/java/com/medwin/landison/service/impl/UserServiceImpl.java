package com.medwin.landison.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.medwin.landison.common.BaseResult;
import com.medwin.landison.config.LpsConfig;
import com.medwin.landison.entity.LdsOrderEntity;
import com.medwin.landison.exception.KmsSystemException;
import com.medwin.landison.exception.SystemException;
import com.medwin.landison.kms.informationservice.SendInfo;
import com.medwin.landison.kms.profileservice.GuestInfo;
import com.medwin.landison.kms.profileservice.QueryGuestInfoOut;
import com.medwin.landison.kms.reservationservice.*;
import com.medwin.landison.service.UserService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;

/**
 * Created by medwin on 2018/10/16.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private LpsConfig lpsConfig;

    @Autowired
    private LpsServiceImpl lpsService;

    @Autowired
    private KmsServiceImpl kmsService;

    @Autowired
    private LdsServiceImpl ldsService;


    @Override
    public BaseResult getUser(String mobileCountryNumber, String mobile){

        return lpsService.getUserProfile(mobileCountryNumber, mobile);
    }

    @Override
    public BaseResult getUserByPid(String id) {
        return lpsService.getUserProfileById(id);
    }

    @Override
    public BaseResult sendRegisterSms(String mobileCountryNumber, String mobile, String name, String code) {

        BaseResult baseResult = new BaseResult();

        BaseResult userBaseResult = getUser(mobileCountryNumber, mobile);
        if(BaseResult.SUCCESS_CODE.equals(userBaseResult.getCode())) {
            baseResult.setCode("2");
            baseResult.setMessage("手机号已注册");
            return baseResult;
        }

        SendInfo sendInfo = new SendInfo();
        sendInfo.setSendType("3");
        sendInfo.setRecipientName(name);
        sendInfo.setAddress(mobile);
        sendInfo.setTitle("注册验证码");
        sendInfo.setContent("您的验证码是【"+code+"】");
        sendInfo.setContentFlag("S");

        LocalDateTime arrivalDate = LocalDateTime.now();
        arrivalDate.plus(1, ChronoUnit.DAYS);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        sendInfo.setEndTime(arrivalDate.format(format));

        sendInfo.setHotelCode("000001");
        boolean ret = kmsService.addSendInfo(sendInfo);
        baseResult.setBooleanCode(ret);

        ldsService.addSmsLog(null, sendInfo.getContent(), 1);

        return baseResult;
    }

    @Override
    public BaseResult register(String mobile, String firstName, String lastName, String password, String mobileCountryNumber) {

        LpsConfig.Register register = lpsConfig.getRegister();
        BaseResult baseResult = lpsService.register(mobile, firstName, lastName, password, mobileCountryNumber,
                register.getMembershipCardTypeCode(), register.getMembershipCardLevelCode(),
                register.getEnrollmentChannelCode());

        if(BaseResult.SUCCESS_CODE.equals(baseResult.getCode())){
            ldsService.addUser(mobile, password, baseResult.getData().toString());
        }

        return baseResult;
    }

    @Override
    public BaseResult login(String mobile, String password, String mobileCountryNumber) throws SystemException {

        boolean isReg = false;
        BaseResult baseResult;

        if(StringUtils.isEmpty(password)) {

            baseResult = getUser(mobileCountryNumber, mobile);
            if(BaseResult.SUCCESS_CODE.equals(baseResult.getCode())) {
                isReg = true;
            }
        }else  {

            baseResult = lpsService.checkUser(mobile, password, mobileCountryNumber);
            if(BaseResult.SUCCESS_CODE.equals(baseResult.getCode())){
                isReg = true;
            }
        }
        if(isReg){

            ldsService.loginUser(mobile, password, baseResult.getData().toString());
        } else {

            baseResult.setMessage("手机号或密码错误");
            baseResult.setCode("2");
            baseResult.setData(null);
        }

        return baseResult;
    }

    @Override
    public BaseResult sendLoginSms(String mobileCountryNumber, String mobile, String code) {

        BaseResult baseResult = new BaseResult();

        BaseResult userBaseResult = getUser(mobileCountryNumber, mobile);
        if(!BaseResult.SUCCESS_CODE.equals(userBaseResult.getCode())) {
            baseResult.setCode("2");
            baseResult.setMessage("手机号未注册");
            return baseResult;
        }

        SendInfo sendInfo = new SendInfo();
        sendInfo.setSendType("3");
        sendInfo.setRecipientName(((JSONObject)userBaseResult.getData()).getString("lastName"));
        sendInfo.setAddress(mobile);
        sendInfo.setTitle("登录验证码");
        sendInfo.setContent("您的验证码是【"+code+"】");
        sendInfo.setContentFlag("S");

        LocalDateTime arrivalDate = LocalDateTime.now();
        arrivalDate.plus(1, ChronoUnit.DAYS);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        sendInfo.setEndTime(arrivalDate.format(format));

        sendInfo.setHotelCode("000001");
        boolean ret = kmsService.addSendInfo(sendInfo);
        baseResult.setBooleanCode(ret);

        ldsService.addSmsLog(null, sendInfo.getContent(), 2);

        return baseResult;
    }

    @Override
    public BaseResult updateUser(String profileId, String firstName, String lastName, String altFirstName,
                                 String altLastName, String genderCode, String idTypeCode, String idNumber,
                                 String mobile, String mobileCountryNumber, String birthday, String email,
                                 String addressCountryCode,
                                 String addressProvinceCode, String addressCity, String addressDistrict,
                                 String addressStreet) {

        return lpsService.updateUser(profileId, firstName, lastName, altFirstName,
                altLastName, genderCode, idTypeCode, idNumber,
                mobile, mobileCountryNumber, birthday, email, addressCountryCode,
                addressProvinceCode, addressCity, addressDistrict,
                addressStreet);
    }

    @Override
    public BaseResult getPointsHistory(String accountId, String beginDate, String endDate, String type, String hotelCode, String placeCode, int page, int pageSize) {

        return lpsService.getPointsHistory(accountId, beginDate, endDate, type, hotelCode, placeCode, page, pageSize);
    }

    @Override
    public BaseResult getStoredValueHistory(String accountId, String beginDate, String endDate, String type, String hotelCode, String placeCode, int page, int pageSize) {

        return lpsService.getStoredValueHistory(accountId, beginDate, endDate, type, hotelCode, placeCode, page, pageSize);
    }

    @Override
    public BaseResult getCoupons(String profileId, String status, int page, int pageSize) {

        return lpsService.getCoupons(profileId, status, page, pageSize);
    }

    @Override
    public BaseResult addOrder(String arrival, String departure, int roomNum, int extraBed, int adults, int children,
                               double rate, String lastName, String firstName, double totalRevenue, String hotelCode, String guesttypeCode,
                               String roomtypeCode, String reteCode, String memberId, String reservationTypeCode, String comments,
                               String address, String email, String mobile, String arrivalTime) {


        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setArrival(new DateTime(arrival).toDate());
        orderInfo.setDeparture(new DateTime(departure).toDate());
        orderInfo.setRoomNum(roomNum);
        orderInfo.setExtraBed(extraBed);
        orderInfo.setAdults(adults);
        orderInfo.setChildren(children);
        orderInfo.setFirstname(firstName);
        orderInfo.setRate(new BigDecimal(rate).setScale(2,BigDecimal.ROUND_HALF_UP));
        orderInfo.setLastname(lastName);
        orderInfo.setTotalRevenue(new BigDecimal(totalRevenue).setScale(2,BigDecimal.ROUND_HALF_UP));
        orderInfo.setComments(comments);
        orderInfo.setAddress(address);
        orderInfo.setArrivalTime(arrivalTime);
        if(!StringUtils.isEmpty(email)) {
            orderInfo.setEmail(email);
            orderInfo.setEmailConfirm("1");
        }
        orderInfo.setMobile(mobile);

        CommonInfo hotel = new CommonInfo();
        hotel.setCode(hotelCode);
        orderInfo.setHotelCode(hotel);

        CommonInfo gusttpe = new CommonInfo();
        gusttpe.setCode(guesttypeCode);
        orderInfo.setGuesttypeCode(gusttpe);

        CommonInfo roomtype = new CommonInfo();
        roomtype.setCode(roomtypeCode);
        orderInfo.setRoomtypeCode(roomtype);

        CommonInfo rete = new CommonInfo();
        rete.setCode(reteCode);
        orderInfo.setRateCode(rete);

        CommonInfo market = new CommonInfo();
        market.setCode("");
        orderInfo.setMarket(market);

        CommonInfo source = new CommonInfo();
        source.setCode("");
        orderInfo.setSource(source);

        CommonInfo channel = new CommonInfo();
        channel.setCode(lpsConfig.getChannel());
        orderInfo.setChannel(channel);

        CommonInfo memberIdInfo = new CommonInfo();
        memberIdInfo.setCode(memberId);
        orderInfo.setMemberId(memberIdInfo);

        CommonInfo reservationType = new CommonInfo();
        reservationType.setCode(reservationTypeCode);
        orderInfo.setReservationType(reservationType);

        OrderInfo info = kmsService.greateReservation(orderInfo);

        ldsService.addOrder(mobile, JSONObject.toJSONString(info), String.valueOf(info.getID()),
                reservationTypeCode, info.getStatusCode().getCode(), orderInfo.getTotalRevenue());

        return new BaseResult(BaseResult.SUCCESS_CODE, "提交成功", info);
    }

    @Override
    public BaseResult queryOrder(int id, String beginArrivalDate, String endArrivalDate, String beginDepartureDate, String endDepartureDate,
                                 String beginInsertDate, String endInsertDate, String hotels, String firstName,
                                 String lastName, int profileId, String account, String cardNumber,
                                 String phoneNumber, String statusCode, int pageIndex, int pageSize) {

        QueryOrderPageOut orderPageOut = kmsService.queryOrderPage(id, beginArrivalDate, endArrivalDate, beginDepartureDate,
                endDepartureDate, beginInsertDate, endInsertDate, hotels, firstName, lastName, profileId, account, cardNumber,
                phoneNumber, statusCode, pageIndex, pageSize);

        ArrayOfOrderInfo arrayOfOrderInfo = orderPageOut.getOrderInfos();
        if(arrayOfOrderInfo != null && !CollectionUtils.isEmpty(arrayOfOrderInfo.getOrderInfo())) {

            arrayOfOrderInfo.getOrderInfo().forEach(orderInfo -> {
                if(LdsOrderEntity.TYPE_PRE.equals(orderInfo.getReservationType().getCode())
                        && "0001".equals(orderInfo.getStatusCode().getCode())) {//预付 未入住订单

                    OrderInfo orderAllInfo = kmsService.getOrderInfo(orderInfo.getID());
                    orderInfo.setPayMentGateWay(orderAllInfo.getPayMentGateWay());
//                    LdsOrderEntity orderEntity = ldsService.getOrderByOrderId(String.valueOf(orderInfo.getID()));
//                    if(PayMentStatus.PAID.equals(orderEntity.getPayCode())) {
//
//                    }
                }
            });
        }

        return new BaseResult(BaseResult.SUCCESS_CODE, "", orderPageOut);
    }


    @Override
    @Transactional
    public BaseResult checkOrder(String orderId, Double amount, String gatewayIdentification,
                                 String gatewayReferenceNo, PayMentStatus status, String remark, String paymentCode,
                                 DataType orderType, PayMentStatus updateStatus) {

        OrderInfoPaymentGateway orderInfoPaymentGateway = new OrderInfoPaymentGateway();
        orderInfoPaymentGateway.setOrderId(orderId);
        orderInfoPaymentGateway.setAmountType(AmountType.MONEY);
        orderInfoPaymentGateway.setAmount(new BigDecimal(amount).setScale(2,BigDecimal.ROUND_HALF_UP));
        orderInfoPaymentGateway.setGatewayIdentification(gatewayIdentification);
        orderInfoPaymentGateway.setGatewayReferenceNo(gatewayReferenceNo);
        orderInfoPaymentGateway.setStatus(status);
        orderInfoPaymentGateway.setRemark(remark);
        orderInfoPaymentGateway.setPaymentCode(paymentCode);
        orderInfoPaymentGateway.setOrderType(orderType);
        orderInfoPaymentGateway.setUpdateStatus(updateStatus);
        OrderInfoPaymentGateway gateway = kmsService.addorderInfoPaymentGateway(orderInfoPaymentGateway);

        ldsService.checkOrder(orderId, JSONObject.toJSONString(gateway), gateway.getStatus().value(),
                paymentCode, gatewayReferenceNo, gatewayIdentification);

        return new BaseResult(BaseResult.SUCCESS_CODE, "提交成功", gateway);

    }

    @Override
    public BaseResult cancelOrder(int id, String comments, String mobile) {

        QueryOrderPageOut orderPageOut = kmsService.queryOrderPage(id, null, null, null, null, null, null,
                null,null, null, -1, null,  null, mobile, null, 1, 1);
        if(orderPageOut.getPageInfo() != null && orderPageOut.getPageInfo().getTotalRecords() > 0) {

            boolean ret = kmsService.cancelOrder(id, comments);
            if(ret) {
                ldsService.cancelOrder(id, "0003", comments);
            }
            return new BaseResult(BaseResult.SUCCESS_CODE, "", ret);
        } else {
            return new BaseResult("2", "查询订单失败", null) ;
        }
    }
}
