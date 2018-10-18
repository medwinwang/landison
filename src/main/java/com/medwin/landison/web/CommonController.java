package com.medwin.landison.web;

import com.medwin.landison.common.BaseResult;
import com.medwin.landison.exception.LpsSystemException;
import com.medwin.landison.kms.informationservice.City;
import com.medwin.landison.kms.informationservice.CommonInfo;
import com.medwin.landison.kms.informationservice.Country;
import com.medwin.landison.kms.informationservice.Province;
import com.medwin.landison.service.KmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by medwin on 2018/10/18.
 */
@RestController
@RequestMapping("/common")
public class CommonController {

    @Autowired
    private KmsService kmsService;

    @RequestMapping(value = "/information", method = RequestMethod.GET)
    public BaseResult getInformation(String dataType, String parentCode) {

        List<CommonInfo>  items = kmsService.getInformation(dataType, parentCode);
        BaseResult baseResult = new BaseResult(BaseResult.SUCCESS_CODE, null, items);
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
