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
}
