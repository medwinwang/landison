package com.medwin.landison.web;

import com.medwin.landison.common.BaseResult;
import com.medwin.landison.common.KmsClientHandler;
import com.medwin.landison.exception.KmsSystemException;
import com.medwin.landison.exception.LpsSystemException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by medwin on 2018/10/17.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = KmsSystemException.class)
    @ResponseBody
    public Object kmsSystemExceptionHandler(HttpServletRequest req, KmsSystemException e){

        BaseResult baseResult = new BaseResult();
        baseResult.setCode("90001");
        Map<String, String> emap = new HashMap<>();
        emap.put(KmsClientHandler.RET_CODE, e.getRetCode());
        emap.put(KmsClientHandler.ERR_REASON, e.getErrReason());
        baseResult.setData(emap);

        return baseResult;
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object defaultErrorHandler(HttpServletRequest req, Exception e){
        BaseResult baseResult = new BaseResult();
        baseResult.setCode("90000");
        baseResult.setData(e.getMessage());
        return baseResult;
    }
}
