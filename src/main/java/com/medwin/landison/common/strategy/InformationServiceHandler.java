package com.medwin.landison.common.strategy;

import com.medwin.landison.exception.KmsSystemException;
import org.springframework.util.StringUtils;

import javax.xml.soap.SOAPHeader;

import static com.medwin.landison.common.KmsClientHandler.ERR_REASON;
import static com.medwin.landison.common.KmsClientHandler.RET_CODE;
import static com.medwin.landison.common.KmsClientHandler.getValueByEle;

/**
 * Created by medwin on 2018/12/12.
 */
public class InformationServiceHandler implements HandlerStrategy {


    @Override
    public void handler(SOAPHeader soapHeader) {

        String retCode = getValueByEle(soapHeader, RET_CODE);
        if(!StringUtils.isEmpty(retCode) && !"2001".equals(retCode)) {
            String errReason = getValueByEle(soapHeader, ERR_REASON);
            throw new KmsSystemException(retCode, errReason);
        }
    }
}
