package com.medwin.landison.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

/**
 * Created by medwin on 2018/10/17.
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseResult {

    public static final String SUCCESS_CODE = "1";

    String code;
    String message;
    Object data;

    public void setDataString(String dataStr){

        try {
            if(!StringUtils.isEmpty(dataStr)) {

                if(dataStr.indexOf("[") == 0) {

                    this.data = JSON.parseArray(dataStr);
                } else {

                    JSONObject jsonObject = JSON.parseObject(dataStr);
                    this.data = jsonObject;
                    this.message = jsonObject.getString("message");
                }
            }
        } catch (Exception e) {
            this.data = dataStr;
        }
    }

    public void setBooleanCode(boolean code){
        this.code = code ? SUCCESS_CODE: "2";
    }

}
