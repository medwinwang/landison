package com.medwin.landison.service.impl;

import com.medwin.landison.common.BaseResult;
import com.medwin.landison.service.KmsService;
import com.medwin.landison.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by medwin on 2018/10/19.
 */
@Service
public class OderServiceImpl implements OrderService {


    @Autowired
    private KmsService kmsService;

    @Override
    public BaseResult addOrder() {
        return null;
    }
}
