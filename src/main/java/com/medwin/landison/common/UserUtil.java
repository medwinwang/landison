package com.medwin.landison.common;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

/**
 * Created by medwin on 2018/10/19.
 */

public class UserUtil {

    public static String getPointId(JSONObject user){

        return getAccountId(user, "points");
    }

    public static String getStoredValueId(JSONObject user){

        return getAccountId(user, "storedValue");
    }

    private static String getAccountId(JSONObject user, String type){

        String id = null;

        JSONArray jsonArray = user.getJSONArray("accounts");
        for(int i=0; i< jsonArray.size(); i++) {

            JSONObject item = jsonArray.getJSONObject(i);
            if(type.equals(item.getString("accountType"))) {
                id = item.getString("id");
                break;
            }
        }

        return id;
    }
}
