package com.medwin.landison.web;

import com.medwin.landison.common.BaseResult;
import com.medwin.landison.common.EnvUtil;
import com.medwin.landison.exception.LpsSystemException;
import com.medwin.landison.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;

/**
 * Created by medwin on 2018/10/18.
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    private static final String SMS_CODE = "login_sms_code";
    private static final String SMS_MOBILE = "login_sms_mobile";
    private static final String SMS_EXP_TIME = "login_sms_exp_time";
    public static final String SESSION_USER = "user";

    @Autowired
    private UserService userService;


    @Autowired
    private EnvUtil envUtil;

    @RequestMapping(method = RequestMethod.POST)
    public BaseResult login(String mobile, String code, String mobileCountryNumber, HttpSession httpSession) {

        Integer sessionCode = (Integer) httpSession.getAttribute(SMS_CODE);
        if(sessionCode == null) {
            return new BaseResult("2", "请先选择发送验证码", null);
        }

        Long second = LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));
        Long expTime = (Long) httpSession.getAttribute(SMS_EXP_TIME);

        if(!mobile.equals(httpSession.getAttribute(SMS_MOBILE)) || expTime < second) {
            return new BaseResult("3", "请重新发送短信验证码", null);
        }

        if(!String.valueOf(sessionCode).equals(code)){
            return new BaseResult("4", "短信验证码错误", null);
        }

        BaseResult baseResult = userService.login(mobile,null, mobileCountryNumber);
        if(BaseResult.SUCCESS_CODE.equals(baseResult.getCode())) {
            httpSession.setAttribute(SESSION_USER, baseResult.getData());
        }
        return baseResult;
    }

    @RequestMapping(value = "/sendSms", method = RequestMethod.POST)
    public BaseResult sendRegisterSms(String  mobileCountryNumber, String mobile, HttpSession httpSession) {

        Long expTime = (Long) httpSession.getAttribute(SMS_EXP_TIME);
        Long second = LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));

        if(expTime != null && expTime>second){
            return new BaseResult("2", "请2分钟后再试", null);
        }

        Random rand = new Random();
        int code = rand.nextInt(9000) + 1000;
        if(!envUtil.isProd()) {
            code = 8888;
        }

        BaseResult baseResult = userService.sendLoginSms(mobileCountryNumber, mobile, String.valueOf(code));
        if(BaseResult.SUCCESS_CODE.equals(baseResult.getCode())){
            httpSession.setAttribute(SMS_CODE, code);
            httpSession.setAttribute(SMS_MOBILE, mobile);
            httpSession.setAttribute(SMS_EXP_TIME, second+120);
        }
        return baseResult;
    }
}
