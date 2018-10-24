package com.medwin.landison.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.medwin.landison.web.LoginController;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by medwin on 2018/10/19.
 */

public class UserUtil {

    public static List<String> getCardAndType(JSONObject user, String type){
        List<String> ret = new ArrayList<>(2);
        String guesttypeCode = "0000";
        String cardNo = null;
        if(user != null) {
            cardNo = getCardNo(user, type);
            if(!StringUtils.isEmpty(cardNo)) {
                guesttypeCode = "0002";
            }
        }
        ret.add(guesttypeCode);
        ret.add(cardNo);
        return ret;
    }

    public static String getId(JSONObject user){

        return user.getString("id");
    }

    public static String getCardNo(JSONObject user, String type){

        String id = null;
        JSONObject card = getCard(user, type);
        if(card != null) {
            id = card.getString("membershipCardNumber");
        }
        return id;
    }

    public static String getPointId(JSONObject user, String cardType){

        return getAccountId(user, cardType, "points");
    }

    public static String getStoredValueId(JSONObject user, String cardType){

        return getAccountId(user, cardType,"storedValue");
    }

    public static JSONObject getCard(JSONObject user, String cardType){

        JSONArray jsonArray = user.getJSONArray("membershipCards");
        if(jsonArray != null && jsonArray.size() > 0) {
            for(int i=0; i< jsonArray.size(); i++) {

                JSONObject item = jsonArray.getJSONObject(i);
                if(cardType.equals(item.getJSONObject("membershipCardType").getString("code"))) {
                    return item;
                }
            }
        }
        return null;
    }

    private static String getAccountId(JSONObject user, String cardType, String type){

        JSONObject card = getCard(user, cardType);
        if(card == null) {
            return null;
        }
        String id = null;
        JSONArray jsonArray = card.getJSONArray("accounts");
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
