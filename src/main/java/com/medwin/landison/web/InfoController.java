package com.medwin.landison.web;

import com.alibaba.fastjson.JSONObject;
import com.medwin.landison.common.BaseResult;
import com.medwin.landison.common.UserUtil;
import com.medwin.landison.config.LpsConfig;
import com.medwin.landison.exception.LpsSystemException;
import com.medwin.landison.kms.availabilityservice.Availability;
import com.medwin.landison.kms.informationservice.*;
import com.medwin.landison.service.KmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by medwin on 2018/10/18.
 */
@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private KmsService kmsService;

    @Autowired
    private LpsConfig lpsConfig;

    @RequestMapping(value = "/information", method = RequestMethod.GET)
    public BaseResult getInformation(String dataType, String parentCode) {

        List<CommonInfo>  items = kmsService.getInformation(dataType, parentCode);
        BaseResult baseResult = new BaseResult(BaseResult.SUCCESS_CODE, null, items);
        return baseResult;
    }

    @RequestMapping(value = "/availability", method = RequestMethod.GET)
    public BaseResult getAvailability(String hotelCode, String arrival, String departure,
                                      @RequestParam(value="extraBed", defaultValue="0")int extraBed,
                                      @RequestParam(value="adults", defaultValue="1")int adults,
                                      @RequestParam(value="adults", defaultValue="1")int roomNum, String custAccount,
                                      @RequestParam(value="children", defaultValue="0")int children, HttpSession httpSession) {

        String guesttypeCode = "0000";
        String cardNo = null;
        JSONObject user = (JSONObject) httpSession.getAttribute(LoginController.SESSION_USER);
        if(user != null) {

            cardNo = UserUtil.getCardNo(user, lpsConfig.getRegister().getMembershipCardTypeCode());
            if(!StringUtils.isEmpty(cardNo)) {

                guesttypeCode = "0002";
            }
        }

        Availability item = kmsService.getAvailability(hotelCode, arrival, departure, extraBed, adults, roomNum,
                guesttypeCode, custAccount, cardNo, children, lpsConfig.getChannel());
        BaseResult baseResult = new BaseResult(BaseResult.SUCCESS_CODE, null, item);
        return baseResult;
    }

    @RequestMapping(value = "/hotel", method = RequestMethod.GET)
    public BaseResult getSingleHotelInfo(String code) {

        HotelInfo item = kmsService.getSingleHotelInfo(code);
        BaseResult baseResult = new BaseResult(BaseResult.SUCCESS_CODE, null, item);
        return baseResult;
    }

    @RequestMapping(value = "/country", method = RequestMethod.GET)
    public BaseResult getCountry() {

        List<Country>  countries = kmsService.getCountry();
        BaseResult baseResult = new BaseResult(BaseResult.SUCCESS_CODE, null, countries);
        return baseResult;
    }

    @RequestMapping(value = "/province", method = RequestMethod.GET)
    public BaseResult getProvince(String countryCode) {

        List<Province>  items = kmsService.getProvince(countryCode);
        BaseResult baseResult = new BaseResult(BaseResult.SUCCESS_CODE, null, items);
        return baseResult;
    }


    @RequestMapping(value = "/city", method = RequestMethod.GET)
    public BaseResult getCity(String countryCode) {

        List<City>  items = kmsService.getCity(countryCode);
        BaseResult baseResult = new BaseResult(BaseResult.SUCCESS_CODE, null, items);
        return baseResult;
    }
}
