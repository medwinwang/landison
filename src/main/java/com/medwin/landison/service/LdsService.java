package com.medwin.landison.service;

import com.medwin.landison.entity.LdsOrderEntity;

import java.math.BigDecimal;

/**
 * Created by medwin on 2018/10/16.
 */
public interface LdsService {

    void addSmsLog(Integer userId, String content, int type);

    void addUser(String username, String password, String info);

    void loginUser(String username, String password, String info);

    void addOrder(String username, String info, String orderId,  String reservationTypeCode, String status,
                  BigDecimal totalAmount);

    void checkOrder(String orderId, String payInfo, String status,String payCode, String tradeNo, String buyerId);

    void cancelOrder(int orderId, String status, String msg);

    LdsOrderEntity getOrderByOrderId(String orderId);

}
