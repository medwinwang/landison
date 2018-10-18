package com.medwin.landison.service;

import com.medwin.landison.common.BaseResult;
import com.medwin.landison.exception.LpsSystemException;

/**
 * Created by medwin on 2018/10/16.
 */
public interface LpsService {

    //根据手机号查询
    BaseResult getUserProfile(String mobile);

    BaseResult getUserProfiles(String mobile);

    //注册
    BaseResult register(String mobile, String firstName, String password);

    //用户验证
    BaseResult checkUser(String mobile, String password, String mobileCountryNumber);

    //密码重置
    BaseResult restPwd(String profileId);

    //密码修改
    BaseResult changePwd(String profileId, String currentPassword, String newPassword);

}
