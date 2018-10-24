package com.medwin.landison.service;

import com.medwin.landison.common.BaseResult;

/**
 * Created by medwin on 2018/10/16.
 */
public interface LdsService {

    void addSmsLog(Integer userId, String content, int type);

    void addUser(String username, String password, String info);

    void loginUser(String username, String password, String info);
}
