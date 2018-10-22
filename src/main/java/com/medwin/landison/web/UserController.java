package com.medwin.landison.web;

import com.alibaba.fastjson.JSONObject;
import com.medwin.landison.common.BaseResult;
import com.medwin.landison.common.UserUtil;
import com.medwin.landison.config.LpsConfig;
import com.medwin.landison.exception.LpsSystemException;
import com.medwin.landison.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

    @Autowired
    private LpsConfig lpsConfig;

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public BaseResult getUser(@RequestParam(value="from", defaultValue="0") int from,
                                       HttpSession httpSession){

        JSONObject user = (JSONObject) httpSession.getAttribute(LoginController.SESSION_USER);

        if(from > 0) {
            BaseResult baseResult = userService.getUserByPid(UserUtil.getId(user));
            if(BaseResult.SUCCESS_CODE.equals(baseResult.getCode())) {
                httpSession.setAttribute(LoginController.SESSION_USER, baseResult.getData());
            }
            return baseResult;
        } else {
            return new BaseResult(BaseResult.SUCCESS_CODE, null, user);
        }

    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public BaseResult logout(HttpSession httpSession){

        httpSession.removeAttribute(LoginController.SESSION_USER);
        return new BaseResult(BaseResult.SUCCESS_CODE, null, null);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public BaseResult update(String firstName, String lastName, String altFirstName, String altLastName,
                             String genderCode, String idTypeCode, String idNumber, String birthday, String email,
                             String addressCountryCode, String addressProvinceCode, String addressCity, String addressDistrict,
                             String addressStreet, HttpSession httpSession) throws LpsSystemException {

        JSONObject user = (JSONObject) httpSession.getAttribute(LoginController.SESSION_USER);

        BaseResult baseResult = userService.updateUser(UserUtil.getId(user), firstName, lastName, altFirstName,
                altLastName, genderCode, idTypeCode, idNumber,
                user.getString("mobile"), user.getString("mobileCountryNumber"),
                birthday, email, addressCountryCode,
                addressProvinceCode, addressCity, addressDistrict,
                addressStreet);
        if(BaseResult.SUCCESS_CODE.equals(baseResult.getCode())) {

            baseResult = userService.getUserByPid(UserUtil.getId(user));
            if(BaseResult.SUCCESS_CODE.equals(baseResult.getCode())) {
                httpSession.setAttribute(LoginController.SESSION_USER, baseResult.getData());
            }
        }

        return baseResult;
    }

    @RequestMapping(value = "/pointsHistory", method = RequestMethod.GET)
    public BaseResult getPointsHistory(String beginDate, String endDate, String type, String hotelCode, String placeCode,
                                       @RequestParam(value="page", defaultValue="1") int page,
                                       @RequestParam(value="pageSize", defaultValue="10")int pageSize, HttpSession httpSession){

        JSONObject user = (JSONObject) httpSession.getAttribute(LoginController.SESSION_USER);

        return userService.getPointsHistory(
                UserUtil.getPointId(user, lpsConfig.getRegister().getMembershipCardTypeCode()),
                 beginDate, endDate, type, hotelCode, placeCode, page, pageSize);

    }

    @RequestMapping(value = "/storedValueHistory", method = RequestMethod.GET)
    public BaseResult getStoredValueHistory(String beginDate, String endDate, String type,
                                       String hotelCode, String placeCode, @RequestParam(value="page", defaultValue="1") int page,
                                            @RequestParam(value="pageSize", defaultValue="10")int pageSize, HttpSession httpSession){

        JSONObject user = (JSONObject) httpSession.getAttribute(LoginController.SESSION_USER);

        return userService.getStoredValueHistory(
                UserUtil.getStoredValueId(user, lpsConfig.getRegister().getMembershipCardTypeCode()),
                beginDate, endDate, type, hotelCode, placeCode, page, pageSize);

    }


    @RequestMapping(value = "/coupons", method = RequestMethod.GET)
    public BaseResult getCoupons(String status, @RequestParam(value="page", defaultValue="1") int page,
                                 @RequestParam(value="pageSize", defaultValue="10")int pageSize, HttpSession httpSession){

        JSONObject user = (JSONObject) httpSession.getAttribute(LoginController.SESSION_USER);

        return userService.getCoupons(UserUtil.getId(user), status, page, pageSize);

    }

}
