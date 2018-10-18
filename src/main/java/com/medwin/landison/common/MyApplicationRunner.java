package com.medwin.landison.common;

import com.medwin.landison.service.impl.KmsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by medwin on 2018/10/17.
 * kms启动注册
 */
@Component
@Order(value = 1)
public class MyApplicationRunner implements ApplicationRunner {

    @Autowired
    private KmsServiceImpl kmsService;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {

        kmsService.appLogin();
    }
}
