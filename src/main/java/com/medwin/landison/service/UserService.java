package com.medwin.landison.service;

import com.medwin.landison.common.BaseResult;
import com.medwin.landison.exception.LpsSystemException;
import com.medwin.landison.exception.SystemException;
import com.medwin.landison.kms.reservationservice.DataType;
import com.medwin.landison.kms.reservationservice.PayMentStatus;

/**
 * Created by medwin on 2018/10/16.
 */
public interface UserService {

    BaseResult getUser(String mobileCountryNumber, String mobile);

    BaseResult getUserByPid(String id);

    BaseResult sendRegisterSms(String mobileCountryNumber, String mobile, String name, String code);

    BaseResult register(String mobile, String firstName, String lastName, String password, String mobileCountryNumber);

    BaseResult login(String mobile, String password, String mobileCountryNumber) throws SystemException;

    BaseResult sendLoginSms(String mobileCountryNumber, String mobile, String code);

    BaseResult updateUser(String profileId, String firstName, String lastName, String altFirstName, String altLastName,
                          String genderCode, String idTypeCode, String idNumber, String mobile, String mobileCountryNumber,
                          String birthday, String email,
                          String addressCountryCode, String addressProvinceCode, String addressCity, String addressDistrict,
                          String addressStreet);

    BaseResult getPointsHistory(String accountId, String beginDate, String endDate, String type,
                                String hotelCode, String placeCode, int page, int pageSize);

    BaseResult getStoredValueHistory(String accountId, String beginDate, String endDate, String type,
                                     String hotelCode, String placeCode, int page, int pageSize);

    BaseResult getCoupons(String profileId, String status, int page, int pageSize);

    BaseResult addOrder(String arrival, String departure,int roomNum, int extraBed, int adults,int children, double rate,
                        String lastName, String firstName, double totalRevenue, String hotelCode, String guesttypeCode, String roomtypeCode,
                        String reteCode, String memberId, String reservationTypeCode, String comments, String address,
                        String email, String mobile, String arrivalTime);

    BaseResult queryOrder(int id, String beginArrivalDate, String endArrivalDate, String beginDepartureDate, String endDepartureDate,
                          String beginInsertDate, String endInsertDate, String hotels, String firstName,
                          String lastName, int profileId, String account, String cardNumber,
                          String phoneNumber, String statusCode, int pageIndex, int pageSize);


    BaseResult checkOrder(String orderId, Double amount, String gatewayIdentification,
                          String gatewayReferenceNo, PayMentStatus status, String remark, String paymentCode,
                          DataType orderType, PayMentStatus updateStatus);

    BaseResult cancelOrder(int id, String comments, String mobile);
}
