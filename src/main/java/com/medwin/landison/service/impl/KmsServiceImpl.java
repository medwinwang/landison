package com.medwin.landison.service.impl;

import com.medwin.landison.common.KmsAddSoapHeader;
import com.medwin.landison.common.KmsClientHandler;
import com.medwin.landison.config.KmsConfig;

import com.medwin.landison.kms.availabilityservice.Availability;
import com.medwin.landison.kms.availabilityservice.AvailabilityQuerySoap;
import com.medwin.landison.kms.informationservice.*;
import com.medwin.landison.kms.reservationservice.OrderInfo;
import com.medwin.landison.kms.reservationservice.ReservationSoap;
import com.medwin.landison.kms.securityservice.SecurityService;
import com.medwin.landison.kms.securityservice.SecurityServiceSoap;
import com.medwin.landison.service.KmsService;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by medwin on 2018/10/15.
 */
@Service
public class KmsServiceImpl implements KmsService {

    @Autowired
    private KmsConfig kmsConfig;

    @Autowired
    private InformationServiceSoap informationServiceSoap;

    @Autowired
    private AvailabilityQuerySoap availabilityQuerySoap;

    @Autowired
    private ReservationSoap reservationSoap;

    @Autowired
    private SecurityServiceSoap securityServiceSoap;

    @Override
    public boolean appLogin() {

            boolean ret = securityServiceSoap.appLogin(kmsConfig.getUsername(),
                    kmsConfig.getPwd(), "");
            return ret;
    }

    @Override
    public boolean appLogout() {
        SecurityService securityService = new SecurityService();
        return securityService.getSecurityServiceSoap().appLoginOut(kmsConfig.getSessionId());
    }

    @Override
    public boolean addSendInfo(SendInfo sendInfo) {

        return informationServiceSoap.addSendInfo(sendInfo);
    }

    @Override
    @Cacheable("kms_getCountry")
    public List<Country> getCountry() {

        return informationServiceSoap.getCountry().getCountry();
    }

    @Override
    @Cacheable(value="kms_getProvince", key="#countryCode")
    public List<Province> getProvince(String countryCode) {
        return informationServiceSoap.getProvince(countryCode).getProvince();
    }

    @Override
    @Cacheable(value="kms_getCity", key="#countryCode")
    public List<City> getCity(String countryCode) {
        return informationServiceSoap.getCityList(countryCode).getCity();
    }

    @Override
    @Cacheable(value="kms_getInformation", key="#dataType+#parentCode")
    public List<CommonInfo> getInformation(String dataType, String parentCode) {
        ArrayOfCommonInfo info = informationServiceSoap.getInformation(dataType,  parentCode);
        if(info != null) {
            return info.getCommonInfo();
        }
        return null;
    }

    @Override
    @Cacheable(value="kms_getSingleHotelInfo", key="#code")
    public HotelInfo getSingleHotelInfo(String code) {
       return informationServiceSoap.getSingleHotelInfo(code);
    }

    @Override
    public Availability getAvailability(String hotelCode, String arrival, String departure, int extraBed, int adults,
                                int roomNum, String guesttypeCode, String custAccount, String cardNo,
                                        int children, String channel) {

        Availability availability = availabilityQuerySoap.getAvailability(hotelCode, arrival, departure, extraBed, adults, roomNum,
                guesttypeCode, custAccount, cardNo, children, channel);

        return availability;
    }

    @Override
    public OrderInfo greateReservation(OrderInfo orderInfo) {

        return reservationSoap.createReservation(orderInfo);
    }

}
