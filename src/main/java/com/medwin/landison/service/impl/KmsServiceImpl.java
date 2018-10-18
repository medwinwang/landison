package com.medwin.landison.service.impl;

import com.medwin.landison.common.KmsAddSoapHeader;
import com.medwin.landison.common.KmsClientHandler;
import com.medwin.landison.config.KmsConfig;

import com.medwin.landison.kms.informationservice.*;
import com.medwin.landison.kms.securityservice.SecurityService;
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
    private KmsClientHandler kmsClientHandler;

    @Autowired
    private KmsAddSoapHeader kmsAddSoapHeader;

    @Override
    public boolean appLogin() {

        try {
            URL url = new URL(kmsConfig.getUrl() + "/SecurityService.asmx?WSDL");
            SecurityService securityService = new SecurityService(url);

            securityService.setHandlerResolver(new HandlerResolver() {

                @Override
                public List<Handler> getHandlerChain(PortInfo portInfo) {
                    List<Handler> handlerList = new ArrayList<Handler>();
                    handlerList.add(kmsClientHandler);
                    return handlerList;
                }
            });
            boolean ret = securityService.getSecurityServiceSoap().appLogin(kmsConfig.getUsername(),
                    kmsConfig.getPwd(), "");
            return ret;

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return  false;
    }

    @Override
    public boolean appLogout() {
        SecurityService securityService = new SecurityService();
        return securityService.getSecurityServiceSoap().appLoginOut(kmsConfig.getSessionId());
    }

    @Override
    public boolean addSendInfo(SendInfo sendInfo) {

        return getInformationServiceSoap().addSendInfo(sendInfo);
    }

    @Override
    @Cacheable("kms_getCountry")
    public List<Country> getCountry() {

        return getInformationServiceSoap().getCountry().getCountry();
    }

    @Override
    @Cacheable(value="kms_getProvince", key="#countryCode")
    public List<Province> getProvince(String countryCode) {
        return getInformationServiceSoap().getProvince(countryCode).getProvince();
    }

    @Override
    @Cacheable(value="kms_getCity", key="#countryCode")
    public List<City> getCity(String countryCode) {
        return getInformationServiceSoap().getCityList(countryCode).getCity();
    }


    private InformationServiceSoap getInformationServiceSoap(){

        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

        List<Interceptor<? extends Message>> list = new ArrayList();
        // 添加soap header 信息
        list.add(kmsAddSoapHeader);

        // 添加soap消息日志打印
        list.add(new org.apache.cxf.interceptor.LoggingOutInterceptor());
        factory.setOutInterceptors(list);
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.setAddress(kmsConfig.getUrl() + "/InformationService.asmx");
        factory.setServiceClass(InformationServiceSoap.class);
        return (InformationServiceSoap) factory.create();
    }
}
