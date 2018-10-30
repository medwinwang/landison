package com.medwin.landison.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by medwin on 2018/10/17.
 */
@Getter
@Setter
public class LpsSystemException extends SystemException {

    private String code;
    private String message;

    public LpsSystemException() {
        super();
    }

    public LpsSystemException(String code, String message) {
        super(code + ":" + message);

        this.code = code;
        this.message = message;
    }
}
