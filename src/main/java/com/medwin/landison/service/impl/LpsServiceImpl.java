package com.medwin.landison.service.impl;

import com.medwin.landison.common.BaseResult;
import com.medwin.landison.common.LpsUtil;
import com.medwin.landison.service.LpsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * Created by medwin on 2018/10/16.
 */
@Service
@Slf4j
public class LpsServiceImpl implements LpsService{

    @Autowired
    private LpsUtil lpsUtil;


    @Override
    public BaseResult getUserProfile(String mobile)  {

        HashMap<String, String> par = new HashMap<>();
        par.put("mobile", mobile);
        return  lpsUtil.get("/api/v{version}/profiles/profile", par);
    }

    @Override
    public BaseResult getUserProfiles(String mobile)  {

        HashMap<String, String> par = new HashMap<>();
        par.put("mobile", mobile);
        return  lpsUtil.get("/api/v{version}/profiles", par);
    }

    @Override
    public BaseResult register(String mobile, String firstName, String password)  {

        HashMap<String, String> par = new HashMap<>();
        par.put("mobile", mobile);
        par.put("firstName", firstName);
        par.put("password", password);
        return  lpsUtil.post("/api/v{version}/profiles", par);
    }

    @Override
    public BaseResult checkUser(String mobile, String password, String mobileCountryNumber)  {

        HashMap<String, String> par = new HashMap<>();
        par.put("mobile", mobile);
        par.put("mobileCountryNumber", mobileCountryNumber);
        par.put("password", password);
        return  lpsUtil.post("/api/v{version}/profiles/validation/mobile", par);
    }

    @Override
    public BaseResult restPwd(String profileId)  {

        HashMap<String, String> par = new HashMap<>();
        return  lpsUtil.post("/api/v{version}/profiles/"+profileId+"/passwordReset", par);
    }

    @Override
    public BaseResult changePwd(String profileId, String currentPassword, String newPassword)  {

        HashMap<String, String> par = new HashMap<>();
        par.put("currentPassword", currentPassword);
        par.put("newPassword", newPassword);
        return  lpsUtil.post("/api/v{version}/profiles/"+profileId+"/password", par);
    }

    @Override
    public BaseResult updateUser(String profileId, String firstName, String lastName, String altFirstName,
                                 String altLastName, String genderCode, String idTypeCode, String idNumber,
                                 String mobile, String birthday, String email, String addressCountryCode,
                                 String addressProvinceCode, String addressCity, String addressDistrict,
                                 String addressStreet) {

        HashMap<String, String> par = new HashMap<>();
        par.put("firstName", firstName);
        par.put("lastName", lastName);
        par.put("altFirstName", altFirstName);
        par.put("altLastName", altLastName);
        par.put("genderCode", genderCode);
        par.put("idTypeCode", idTypeCode);
        par.put("idNumber", idNumber);
        par.put("mobile", mobile);
        par.put("birthday", birthday);
        par.put("email", email);

        par.put("addressCountryCode", addressCountryCode);
        par.put("addressProvinceCode", addressProvinceCode);
        par.put("addressCity", addressCity);
        par.put("addressDistrict", addressDistrict);
        par.put("addressStreet", addressStreet);

        return  lpsUtil.put("/api/v{version}/profiles/" + profileId, par);
    }


}
