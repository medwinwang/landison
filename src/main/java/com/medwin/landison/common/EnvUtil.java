package com.medwin.landison.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by medwin on 2018/10/18.
 */
@Component
public class EnvUtil {

    @Autowired
    private Environment env;

    public boolean isProd(){

        String[] arr = env.getActiveProfiles();
        List<String> list= Arrays.asList(arr);
        if (list.contains("prod")) {
            return true;
        }
        return false;
    }
}
