package com.medwin.landison.service.impl;

import com.medwin.landison.common.BaseResult;
import com.medwin.landison.common.DateUtils;
import com.medwin.landison.exception.LpsSystemException;
import com.medwin.landison.kms.informationservice.SendInfo;
import com.medwin.landison.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * Created by medwin on 2018/10/16.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private LpsServiceImpl lpsService;

    @Autowired
    private KmsServiceImpl kmsService;

    @Override
    public BaseResult getUser(String mobile){
        return lpsService.getUserProfile(mobile);
    }

    @Override
    public BaseResult sendRegisterSms(String mobile, String name) {

        SendInfo sendInfo = new SendInfo();
        sendInfo.setSendType("3");
        sendInfo.setRecipientName(name);
        sendInfo.setAddress(mobile);
        sendInfo.setTitle("注册验证码");
        sendInfo.setContent("您的验证码是【8888】");
        sendInfo.setContentFlag("S");
        sendInfo.setEndTime("2018-10-19");
        sendInfo.setHotelCode("000001");
        boolean ret = kmsService.addSendInfo(sendInfo);
        if(ret) {
            return new BaseResult();
        }
        return null;
    }
}
