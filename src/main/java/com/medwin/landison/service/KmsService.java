package com.medwin.landison.service;

import com.medwin.landison.kms.informationservice.SendInfo;

/**
 * Created by medwin on 2018/10/15.
 */
public interface KmsService {

    boolean appLogin();

    boolean appLogout();

    boolean addSendInfo(SendInfo sendInfo);

}