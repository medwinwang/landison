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
 * Created by medwin on 2018/10/16.
 */
@RestController
@RequestMapping("/register")
public class RegisterController {

    private static final String REG_SMS_CODE = "reg_sms_code";
    private static final String REG_SMS_MOBILE = "reg_sms_mobile";
    private static final String REG_SMS_EXP_TIME = "reg_sms_exp_time";

    @Autowired
    private UserService userService;

    @Autowired
    private EnvUtil envUtil;


    @RequestMapping(value = "/check", method = RequestMethod.GET)
    public BaseResult check(String  mobileCountryNumber, String mobile) {
        return userService.getUser(mobileCountryNumber, mobile);
    }

    @RequestMapping(value = "/sendRegisterSms", method = RequestMethod.POST)
    public BaseResult sendRegisterSms(String mobile, String name, HttpSession httpSession) {

        Long expTime = (Long) httpSession.getAttribute(REG_SMS_EXP_TIME);
        Long second = LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));

        if(expTime != null && expTime>second){
            return new BaseResult("2", "请1分钟后再试", null);
        }

        Random rand = new Random();
        int code = rand.nextInt(9000) + 1000;
        if(!envUtil.isProd()) {
            code = 8888;
        }

        httpSession.setAttribute(REG_SMS_CODE, code);
        httpSession.setAttribute(REG_SMS_MOBILE, mobile);
        httpSession.setAttribute(REG_SMS_EXP_TIME, second+120);

        return userService.sendRegisterSms(mobile, name, String.valueOf(code));
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public BaseResult register(String mobile, String firstName, String lastName, String code, String password,
                               String mobileCountryNumber, HttpSession httpSession) {

        Integer sessionCode = (Integer) httpSession.getAttribute(REG_SMS_CODE);
        if(sessionCode == null) {
            return new BaseResult("2", "请先选择发送验证码", null);
        }

        Long second = LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));
        Long expTime = (Long) httpSession.getAttribute(REG_SMS_EXP_TIME);

        if(!mobile.equals(httpSession.getAttribute(REG_SMS_MOBILE)) || expTime < second) {
            return new BaseResult("3", "请重新发送短信验证码", null);
        }

        if(!String.valueOf(sessionCode).equals(code)){
            return new BaseResult("4", "短信验证码错误", null);
        }

        return userService.register(mobile, firstName, lastName, password, mobileCountryNumber);
    }
}
