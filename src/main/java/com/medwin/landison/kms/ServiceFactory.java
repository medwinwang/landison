package com.medwin.landison.kms;

import com.medwin.landison.common.KmsAddSoapHeader;
import com.medwin.landison.common.KmsClientHandler;
import com.medwin.landison.config.KmsConfig;
import com.medwin.landison.kms.informationservice.InformationServiceSoap;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by medwin on 2018/10/18.
 */
@Configuration
public class ServiceFactory {


    @Autowired
    private KmsConfig kmsConfig;

    @Autowired
    private KmsAddSoapHeader kmsAddSoapHeader;

    @Bean
    public InformationServiceSoap getInformationServiceSoap(){

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
