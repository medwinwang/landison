package com.medwin.landison.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.medwin.landison.common.BaseResult;
import com.medwin.landison.config.LpsConfig;
import com.medwin.landison.kms.informationservice.SendInfo;
import com.medwin.landison.kms.reservationservice.*;
import com.medwin.landison.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

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
    public BaseResult login(String mobile, String password, String mobileCountryNumber) {

        BaseResult baseResult = lpsService.checkUser(mobile, password, mobileCountryNumber);
        if(BaseResult.SUCCESS_CODE.equals(baseResult.getCode())){
            ldsService.loginUser(mobile, password, baseResult.getData().toString());
        }

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
                               double rate, String lastName, double totalRevenue, String hotelCode, String guesttypeCode,
                               String roomtypeCode, String reteCode, String memberId, String reservationTypeCode, String comments,
                               String address, String email, String mobile) {


        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setArrival(arrival);
        orderInfo.setDeparture(departure);
        orderInfo.setRoomNum(roomNum);
        orderInfo.setExtraBed(extraBed);
        orderInfo.setAdults(adults);
        orderInfo.setChildren(children);
        orderInfo.setRate(new BigDecimal(rate).setScale(2,BigDecimal.ROUND_HALF_UP));
        orderInfo.setLastname(lastName);
        orderInfo.setTotalRevenue(new BigDecimal(totalRevenue).setScale(2,BigDecimal.ROUND_HALF_UP));
        orderInfo.setComments(comments);
        orderInfo.setAddress(address);
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
                reservationTypeCode, orderInfo.getStatusCode().getCode());

        return new BaseResult(BaseResult.SUCCESS_CODE, "提交成功", info);
    }

    @Override
    public BaseResult checkOrder(String orderId, Double amount, String gatewayIdentification,
                                 String gatewayReferenceNo, String status, String remark, String paymentCode,
                                 String orderType, String updateStatus) {

        OrderInfoPaymentGateway orderInfoPaymentGateway = new OrderInfoPaymentGateway();
        orderInfoPaymentGateway.setOrderId(orderId);
        orderInfoPaymentGateway.setAmountType(AmountType.MONEY);
        orderInfoPaymentGateway.setAmount(new BigDecimal(amount).setScale(2,BigDecimal.ROUND_HALF_UP));
        orderInfoPaymentGateway.setGatewayIdentification(gatewayIdentification);
        orderInfoPaymentGateway.setGatewayReferenceNo(gatewayReferenceNo);
        orderInfoPaymentGateway.setStatus(PayMentStatus.fromValue(status));
        orderInfoPaymentGateway.setRemark(remark);
        orderInfoPaymentGateway.setPaymentCode(paymentCode);
        orderInfoPaymentGateway.setOrderType(DataType.RESVROOM);
        orderInfoPaymentGateway.setUpdateStatus(PayMentStatus.PAID);
        OrderInfoPaymentGateway gateway = kmsService.addorderInfoPaymentGateway(orderInfoPaymentGateway);

        ldsService.checkOrder(orderId, JSONObject.toJSONString(gateway), gateway.getUpdateStatus().value());

        return new BaseResult(BaseResult.SUCCESS_CODE, "提交成功", gateway);

    }
}
