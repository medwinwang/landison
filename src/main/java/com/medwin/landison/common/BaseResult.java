package com.medwin.landison.common;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * Created by medwin on 2018/10/17.
 *
 */
@Data
public class BaseResult {

    String code;
    String message;
    JSONObject data;

    public void setDataString(String dataStr){
        this.data = JSONObject.parseObject(dataStr);
    }

}
