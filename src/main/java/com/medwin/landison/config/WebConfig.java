package com.medwin.landison.config;

import com.medwin.landison.web.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * Created by medwin on 2018/10/18.
 */
@Configuration
public class WebConfig implements  WebMvcConfigurer  {

    @Autowired
    private LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        //.excludePathPatterns("/user/
        registry.addInterceptor(loginInterceptor).addPathPatterns("/user/**");
    }
}

