package com.medwin.landison.common.strategy;

import javax.xml.soap.SOAPHeader;

/**
 * Created by medwin on 2018/12/12.
 */
public interface HandlerStrategy {

    void handler(SOAPHeader soapHeader);
}
