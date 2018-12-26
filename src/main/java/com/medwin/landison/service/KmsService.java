package com.medwin.landison.service;

import com.medwin.landison.kms.availabilityservice.Availability;
import com.medwin.landison.kms.informationservice.*;
import com.medwin.landison.kms.reservationservice.ExtraOrderInfoSummary;
import com.medwin.landison.kms.reservationservice.OrderInfo;
import com.medwin.landison.kms.reservationservice.OrderInfoPaymentGateway;

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
                                 int children, String channel);

    OrderInfo greateReservation(OrderInfo orderInfo);

    List<OrderInfo> getOrderInfoByGuestType(String guestType, String account, String beginMakedate,
                                            String endMakedate);

    boolean cancelOrder(int id, String comments, String croPermission);

    ExtraOrderInfoSummary orderQueryPerPage(int id, String beginMakedate, String endMakedate, String arrival, String departure,
                                            String statusCode, String reservationType, String hotelCode,
                                            String firstname, String lastname, String guestId, String account,
                                            String guestType, int pageSize, int currentPage);

    OrderInfoPaymentGateway addorderInfoPaymentGateway(OrderInfoPaymentGateway orderInfoPaymentGateway);

}