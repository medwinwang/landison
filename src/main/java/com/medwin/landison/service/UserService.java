package com.medwin.landison.service;

import com.medwin.landison.common.BaseResult;
import com.medwin.landison.exception.LpsSystemException;

/**
 * Created by medwin on 2018/10/16.
 */
public interface UserService {

    BaseResult getUser(String mobile);

    BaseResult sendRegisterSms(String mobile, String name, String code);

    BaseResult register(String mobile, String name, String password);

    BaseResult login(String mobile, String password, String mobileCountryNumber);

    BaseResult updateUser(String profileId, String firstName, String lastName, String altFirstName, String altLastName,
                          String genderCode, String idTypeCode, String idNumber, String mobile, String birthday, String email,
                          String addressCountryCode, String addressProvinceCode, String addressCity, String addressDistrict,
                          String addressStreet);

}
