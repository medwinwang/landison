package com.medwin.landison.service;

import com.medwin.landison.kms.availabilityservice.Availability;
import com.medwin.landison.kms.informationservice.*;
import com.medwin.landison.kms.profileservice.QueryGuestInfoOut;
import com.medwin.landison.kms.reservationservice.ExtraOrderInfoSummary;
import com.medwin.landison.kms.reservationservice.OrderInfo;
import com.medwin.landison.kms.reservationservice.OrderInfoPaymentGateway;
import com.medwin.landison.kms.reservationservice.QueryOrderPageOut;

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

    boolean cancelOrder(int id, String comments);

    QueryOrderPageOut queryOrderPage(int id, String beginArrivalDate, String endArrivalDate, String beginDepartureDate, String endDepartureDate,
                                        String beginInsertDate, String endInsertDate, String hotels, String firstName,
                                        String lastName, int profileId, String account, String cardNumber,
                                        String phoneNumber, String statusCode, int pageIndex, int pageSize);

    OrderInfoPaymentGateway addorderInfoPaymentGateway(OrderInfoPaymentGateway orderInfoPaymentGateway);

    QueryGuestInfoOut queryGuestInfo(String mobile);

}