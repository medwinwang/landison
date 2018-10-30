package com.medwin.landison.web;

import com.alibaba.fastjson.JSONObject;
import com.medwin.landison.common.BaseResult;
import com.medwin.landison.common.UserUtil;
import com.medwin.landison.config.LpsConfig;
import com.medwin.landison.exception.LpsSystemException;
import com.medwin.landison.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by medwin on 2018/10/18.
 */
@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private UserService userService;

    @Autowired
    private LpsConfig lpsConfig;

    @RequestMapping(value = "/detail/{code}", method = RequestMethod.GET)
    public BaseResult detail(@PathVariable String code, HttpSession httpSession){

        return null;
    }

    @RequestMapping(value = "/addOrder", method = RequestMethod.POST)
    public BaseResult addOrder(String arrival, String departure,
                               @RequestParam(value="roomNum", defaultValue="1")int roomNum,
                               @RequestParam(value="extraBed", defaultValue="0")int extraBed,
                               @RequestParam(value="adults", defaultValue="1")int adults,
                               @RequestParam(value="children", defaultValue="0")int children, double rate,
                               String lastName, double totalRevenue, String hotelCode, String roomtypeCode, String comments,
                               String reteCode, String reservationTypeCode,String address, String email,String mobile,
                               HttpSession httpSession) {

        JSONObject user = (JSONObject) httpSession.getAttribute(LoginController.SESSION_USER);
        List<String> info = UserUtil.getCardAndType(user,  lpsConfig.getRegister().getMembershipCardTypeCode());

        BaseResult baseResult = userService.addOrder(arrival,departure, roomNum, extraBed, adults, children, rate,
                lastName, totalRevenue, hotelCode, info.get(0),
                roomtypeCode, reteCode, info.get(1), reservationTypeCode, comments, address, email, mobile);

        return baseResult;
    }
}
