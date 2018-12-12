package com.medwin.landison.common.strategy;

import com.medwin.landison.config.KmsConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import javax.xml.soap.SOAPHeader;

import static com.medwin.landison.common.KmsClientHandler.getValueByEle;

/**
 * Created by medwin on 2018/12/12.
 */
public class SecurityServiceHandler implements HandlerStrategy {

    @Autowired
    private KmsConfig kmsConfig;

    @Override
    public void handler(SOAPHeader soapHeader) {
        String sessionId = getValueByEle(soapHeader, "SessionId");
        if(!StringUtils.isEmpty(sessionId)){
            kmsConfig.setSessionId(sessionId);
        }
    }
}
