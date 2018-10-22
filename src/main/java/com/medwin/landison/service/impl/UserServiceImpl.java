package com.medwin.landison.service.impl;

import com.medwin.landison.common.BaseResult;
import com.medwin.landison.config.LpsConfig;
import com.medwin.landison.kms.informationservice.SendInfo;
import com.medwin.landison.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return baseResult;
    }

    @Override
    public BaseResult register(String mobile, String firstName, String lastName, String password, String mobileCountryNumber) {

        LpsConfig.Register register = lpsConfig.getRegister();
        return lpsService.register(mobile, firstName, lastName, password, mobileCountryNumber,
                register.getMembershipCardTypeCode(), register.getMembershipCardLevelCode(),
                register.getEnrollmentChannelCode());
    }

    @Override
    public BaseResult login(String mobile, String password, String mobileCountryNumber) {

        return lpsService.checkUser(mobile, password, mobileCountryNumber);
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
}
