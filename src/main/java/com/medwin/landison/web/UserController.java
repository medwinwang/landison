package com.medwin.landison.web;

import com.alibaba.fastjson.JSONObject;
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
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public BaseResult update(String firstName, String lastName, String altFirstName, String altLastName,
                             String genderCode, String idTypeCode, String idNumber, String mobile, String birthday, String email,
                             String addressCountryCode, String addressProvinceCode, String addressCity, String addressDistrict,
                             String addressStreet, HttpSession httpSession) throws LpsSystemException {

        JSONObject user = (JSONObject) httpSession.getAttribute(LoginController.SESSION_USER);

        return userService.updateUser(user.getString("id"), firstName, lastName, altFirstName,
                altLastName, genderCode, idTypeCode, idNumber,
                mobile, birthday, email, addressCountryCode,
                addressProvinceCode, addressCity, addressDistrict,
                addressStreet);
    }

}
