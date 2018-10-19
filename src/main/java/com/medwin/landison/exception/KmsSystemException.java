package com.medwin.landison.exception;

import lombok.Getter;
import lombok.Setter;

import javax.xml.ws.ProtocolException;

/**
 * Created by medwin on 2018/10/17.
 */
@Getter
@Setter
public class KmsSystemException extends ProtocolException {

    private String retCode;

    private String errReason;

    public KmsSystemException(){
        super();
    }

    public KmsSystemException(String retCode, String errReason) {
        super(retCode + ":" + errReason);
        this.retCode = retCode;
        this.errReason = errReason;
    }
}
