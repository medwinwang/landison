package com.medwin.landison.web;

import com.medwin.landison.common.BaseResult;
import com.medwin.landison.exception.LpsSystemException;
import com.medwin.landison.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by medwin on 2018/10/18.
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    public static final String SESSION_USER = "user";
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public BaseResult login(String mobile, String password, String mobileCountryNumber, HttpSession httpSession) {

        BaseResult baseResult = userService.login(mobile, password, mobileCountryNumber);
        if(BaseResult.SUCCESS_CODE.equals(baseResult.getCode())) {
            httpSession.setAttribute(SESSION_USER, baseResult.getData());
        }
        return baseResult;
    }
}
