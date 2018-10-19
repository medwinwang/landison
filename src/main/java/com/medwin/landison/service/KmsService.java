package com.medwin.landison.service;

import com.medwin.landison.kms.availabilityservice.Availability;
import com.medwin.landison.kms.informationservice.*;

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

    List<CommonInfo> getInformation(String dataType, String parentCode);

    HotelInfo getSingleHotelInfo(String code);

    Availability getAvailability(String hotelCode, String arrival, String departure, int extraBed, int adults,
                                 int roomNum, String guesttypeCode, String custAccount, String cardNo,
                                 String card_no, int children, String channel);

}