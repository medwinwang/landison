package com.medwin.landison.web;

import com.medwin.landison.common.BaseResult;
import com.medwin.landison.exception.LpsSystemException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by medwin on 2018/10/18.
 */
@RestController
@RequestMapping("/hotel")
public class HotelController {

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public BaseResult list(HttpSession httpSession) throws LpsSystemException {

        return null;
    }

    @RequestMapping(value = "/detail/{code}", method = RequestMethod.GET)
    public BaseResult detail(@PathVariable String code, HttpSession httpSession){

        return null;
    }
}
