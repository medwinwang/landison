package com.medwin.landison.service.impl;

import com.medwin.landison.common.KmsAddSoapHeader;
import com.medwin.landison.common.KmsClientHandler;
import com.medwin.landison.config.KmsConfig;

import com.medwin.landison.kms.availabilityservice.Availability;
import com.medwin.landison.kms.availabilityservice.AvailabilityQuerySoap;
import com.medwin.landison.kms.informationservice.*;
import com.medwin.landison.kms.informationservice.CommonInfo;
import com.medwin.landison.kms.profileservice.PhoneType;
import com.medwin.landison.kms.profileservice.ProfileSoap;
import com.medwin.landison.kms.profileservice.QueryGuestInfoIn;
import com.medwin.landison.kms.profileservice.QueryGuestInfoOut;
import com.medwin.landison.kms.reservationservice.*;
import com.medwin.landison.kms.securityservice.SecurityService;
import com.medwin.landison.kms.securityservice.SecurityServiceSoap;
import com.medwin.landison.service.KmsService;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.message.Message;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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

    @Autowired
    private ProfileSoap profileSoap;

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



    public boolean cancelOrder(int id, String comments, String croPermission){

        return reservationSoap.cancelOrder(id, comments, croPermission);
    }

    @Override
    public QueryOrderPageOut queryOrderPage(int id, String beginArrivalDate, String endArrivalDate, String beginDepartureDate, String endDepartureDate,
                                            String beginInsertDate, String endInsertDate, String hotels, String firstName,
                                            String lastName, int profileId, String account, String cardNumber,
                                            String phoneNumber, String statusCode, int pageIndex, int pageSize) {

        QueryOrderPageIn queryOrderPageIn = new QueryOrderPageIn();
        queryOrderPageIn.setId(id);
        if(!StringUtils.isEmpty(beginArrivalDate)) {
            queryOrderPageIn.setBeginArrivalDate(new DateTime(beginArrivalDate).toDate());
        }
        if(!StringUtils.isEmpty(endArrivalDate)) {
            queryOrderPageIn.setBeginArrivalDate(new DateTime(endArrivalDate).toDate());
        }
        if(!StringUtils.isEmpty(beginDepartureDate)) {
            queryOrderPageIn.setBeginArrivalDate(new DateTime(beginDepartureDate).toDate());
        }
        if(!StringUtils.isEmpty(endDepartureDate)) {
            queryOrderPageIn.setBeginArrivalDate(new DateTime(endDepartureDate).toDate());
        }
        if(!StringUtils.isEmpty(beginInsertDate)) {
            queryOrderPageIn.setBeginArrivalDate(new DateTime(beginInsertDate).toDate());
        }
        if(!StringUtils.isEmpty(endInsertDate)) {
            queryOrderPageIn.setBeginArrivalDate(new DateTime(endInsertDate).toDate());
        }
        queryOrderPageIn.setHotels(hotels);
        queryOrderPageIn.setFirstName(firstName);
        queryOrderPageIn.setLastName(lastName);
        if(profileId > 0) {
            queryOrderPageIn.setProfileId(profileId);
        }
        queryOrderPageIn.setAccount(account);
        queryOrderPageIn.setCardNumber(cardNumber);
        queryOrderPageIn.setPhoneNumber(phoneNumber);
        queryOrderPageIn.setStatusCode(statusCode);

        PageInfo pageInfo = new PageInfo();
        pageInfo.setPageIndex(pageIndex);
        pageInfo.setPageSize(pageSize);
        queryOrderPageIn.setPageInfo(pageInfo);

        Party party = new Party();
        party.setPartyAction(PartyAction.SELECT);
        queryOrderPageIn.setParty(party);

        QueryOrderPageOut queryOrderPageOut = reservationSoap.queryOrderPage(queryOrderPageIn);
        return queryOrderPageOut;
    }




    @Override
    public OrderInfoPaymentGateway addorderInfoPaymentGateway(OrderInfoPaymentGateway orderInfoPaymentGateway){
        return reservationSoap.addorderInfoPaymentGateway(orderInfoPaymentGateway);
    }

    @Override
    public QueryGuestInfoOut queryGuestInfo(String mobile) {

        QueryGuestInfoIn queryGuestInfoIn = new QueryGuestInfoIn();
        queryGuestInfoIn.setPhoneNumber(mobile);
        queryGuestInfoIn.setPhoneType(PhoneType.ALL);
        return profileSoap.queryGuestInfo(queryGuestInfoIn);
    }

}
