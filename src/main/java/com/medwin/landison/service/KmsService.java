package com.medwin.landison.service;

import com.medwin.landison.kms.informationservice.City;
import com.medwin.landison.kms.informationservice.Country;
import com.medwin.landison.kms.informationservice.Province;
import com.medwin.landison.kms.informationservice.SendInfo;

import java.util.List;

/**
 * Created by medwin on 2018/10/15.
 */
public interface KmsService {

    boolean appLogin();

    boolean appLogout();

    boolean addSendInfo(SendInfo sendInfo);

    List<Country> getCountry();

    List<Province> getProvince(String countryCode);

    List<City> getCity(String countryCode);

}