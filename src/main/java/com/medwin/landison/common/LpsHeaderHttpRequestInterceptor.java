package com.medwin.landison.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by medwin on 2018/10/16.
 */
@Component
public class LpsHeaderHttpRequestInterceptor implements ClientHttpRequestInterceptor {

    @Autowired
    private LpsUtil lpsUtil;

    @Override
    public ClientHttpResponse intercept(HttpRequest httpRequest, byte[] bytes,
                                        ClientHttpRequestExecution clientHttpRequestExecution) throws IOException {

        HttpHeaders headers = httpRequest.getHeaders();

        // 加入自定义字段
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);
        headers.add("Authorization", "Bearer " + lpsUtil.getToken());
        headers.add("Accept", MediaType.APPLICATION_JSON.toString());
        // 保证请求继续被执行
        return clientHttpRequestExecution.execute(httpRequest, bytes);

    }
}

