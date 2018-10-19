package com.medwin.landison.service;

import com.medwin.landison.common.BaseResult;
import com.medwin.landison.exception.LpsSystemException;

/**
 * Created by medwin on 2018/10/16.
 */
public interface LpsService {

    //根据手机号查询
    BaseResult getUserProfile(String mobileCountryNumber, String mobile);

    BaseResult getUserProfiles(String mobile);

    //注册
    BaseResult register(String mobile, String firstName, String password);

    //用户验证
    BaseResult checkUser(String mobile, String password, String mobileCountryNumber);

    //密码重置
    BaseResult restPwd(String profileId);

    //密码修改
    BaseResult changePwd(String profileId, String currentPassword, String newPassword);

    //修改用户信息
    BaseResult updateUser(String profileId, String firstName, String lastName, String altFirstName, String altLastName,
                          String genderCode, String idTypeCode, String idNumber, String mobile, String birthday, String email,
                          String addressCountryCode, String addressProvinceCode, String addressCity, String addressDistrict,
                          String addressStreet);

    //积分记录
    BaseResult getPointsHistory(String accountId, String beginDate, String endDate, String type,
                                       String hotelCode, String placeCode, int page, int pageSize);

    //卡值记录
    BaseResult getStoredValueHistory(String accountId, String beginDate, String endDate, String type,
                                     String hotelCode, String placeCode, int page, int pageSize);

    //优惠券
    BaseResult getCoupons(String profileId, String status, int page, int pageSize);

}
