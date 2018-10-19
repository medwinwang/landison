package com.medwin.landison.kms;

import com.medwin.landison.common.KmsAddSoapHeader;
import com.medwin.landison.common.KmsClientHandler;
import com.medwin.landison.config.KmsConfig;
import com.medwin.landison.kms.availabilityservice.AvailabilityQuerySoap;
import com.medwin.landison.kms.informationservice.InformationServiceSoap;
import com.medwin.landison.kms.reservationservice.ReservationSoap;
import com.medwin.landison.kms.securityservice.SecurityService;
import com.medwin.landison.kms.securityservice.SecurityServiceSoap;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import java.net.MalformedURLException;
import java.net.URL;
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

    @Autowired
    private KmsClientHandler kmsClientHandler;

    @Bean
    public SecurityServiceSoap getSecurityServiceSoap(){

        URL url = null;
        try {
            url = new URL(kmsConfig.getUrl() + "/SecurityService.asmx?WSDL");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        SecurityService securityService = new SecurityService(url);

        securityService.setHandlerResolver(new HandlerResolver() {

            @Override
            public List<Handler> getHandlerChain(PortInfo portInfo) {
                List<Handler> handlerList = new ArrayList<Handler>();
                handlerList.add(kmsClientHandler);
                return handlerList;
            }
        });
        return securityService.getSecurityServiceSoap();
    }

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

        List<Handler> handlerList = new ArrayList<Handler>();
        handlerList.add(kmsClientHandler);
        factory.setHandlers(handlerList);

        factory.setAddress(kmsConfig.getUrl() + "/InformationService.asmx");
        factory.setServiceClass(InformationServiceSoap.class);
        return (InformationServiceSoap) factory.create();
    }

    @Bean
    public AvailabilityQuerySoap getAvailabilityQuerySoap(){

        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

        List<Interceptor<? extends Message>> list = new ArrayList();
        // 添加soap header 信息
        list.add(kmsAddSoapHeader);

        // 添加soap消息日志打印
        list.add(new org.apache.cxf.interceptor.LoggingOutInterceptor());
        factory.setOutInterceptors(list);
        factory.getInInterceptors().add(new LoggingInInterceptor());

        List<Handler> handlerList = new ArrayList<Handler>();
        handlerList.add(kmsClientHandler);
        factory.setHandlers(handlerList);

        factory.setAddress(kmsConfig.getUrl() + "/AvailabilityService.asmx");
        factory.setServiceClass(AvailabilityQuerySoap.class);
        return (AvailabilityQuerySoap) factory.create();
    }

    @Bean
    public ReservationSoap getReservationSoap(){

        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

        List<Interceptor<? extends Message>> list = new ArrayList();
        // 添加soap header 信息
        list.add(kmsAddSoapHeader);

        // 添加soap消息日志打印
        list.add(new org.apache.cxf.interceptor.LoggingOutInterceptor());
        factory.setOutInterceptors(list);
        factory.getInInterceptors().add(new LoggingInInterceptor());

        List<Handler> handlerList = new ArrayList<Handler>();
        handlerList.add(kmsClientHandler);
        factory.setHandlers(handlerList);

        factory.setAddress(kmsConfig.getUrl() + "/ReservationService.asmx");
        factory.setServiceClass(ReservationSoap.class);
        return (ReservationSoap) factory.create();
    }
}
