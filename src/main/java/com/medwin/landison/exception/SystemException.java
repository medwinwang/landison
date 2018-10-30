package com.medwin.landison.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by medwin on 2018/10/17.
 */
@Getter
@Setter
public class SystemException  extends Exception {

    private String message;

    public SystemException() {
        super();
    }

    public SystemException(String message) {
        super(message);
        this.message = message;
    }

}
