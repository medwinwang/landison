package com.medwin.landison.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.client.ClientHttpRequestInterceptor;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by medwin on 2018/10/16.
 */
@Configuration
public class RestClientConfig {

    // 注入拦截器。拦截器也可以不声明为Bean, 直接在这里新建实例
    @Autowired
    ClientHttpRequestInterceptor actionTrackInterceptor;

    // 声明为Bean，方便应用内使用同一实例
    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();

        // 把自定义的ClientHttpRequestInterceptor添加到RestTemplate，可添加多个
        restTemplate.setInterceptors(Collections.singletonList(actionTrackInterceptor));

        List<HttpMessageConverter<?>> messageConverters = restTemplate.getMessageConverters();
        Iterator<HttpMessageConverter<?>> iterator = messageConverters.iterator();
        while (iterator.hasNext()) {
            HttpMessageConverter<?> converter = iterator.next();
            if (converter instanceof StringHttpMessageConverter) {
                ((StringHttpMessageConverter)converter).setDefaultCharset(Charset.forName("utf-8"));
            }
        }
        return restTemplate;
    }
}
