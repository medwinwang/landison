package com.medwin.landison.exception;

/**
 * Created by medwin on 2018/10/17.
 */
public class LpsSystemException extends SystemException {

    private String code;
    private String message;

    public LpsSystemException() {
        super();
    }

    public LpsSystemException(String code, String message) {

        this.code = code;
        this.message = message;
    }
}
