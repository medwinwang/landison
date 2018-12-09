package com.medwin.landison.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.medwin.landison.config.LpsConfig;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by medwin on 2018/10/16.
 */
@Component
@Slf4j
public class LpsUtil {

    @Autowired
    private LpsConfig lpsConfig;

    @Autowired
    private RestTemplate restTemplate;

    public BaseResult put(String apiPath, Map<String, String> paras){

        HttpHeaders headers = new HttpHeaders();
        String jsonStr = JSON.toJSONString(paras);
        String logJsonStr = hidePwd(paras);

        HttpEntity<String> formEntity = new HttpEntity<String>(jsonStr, headers);
        String url = getPath(apiPath);

        try {

            restTemplate.put(url, formEntity);
            log.info("put {} {}", url, logJsonStr);

            BaseResult baseResult = new BaseResult();
            baseResult.setCode(BaseResult.SUCCESS_CODE);
            return baseResult;

        }catch (HttpClientErrorException e) {

            String bodyStr = e.getResponseBodyAsString();
            String code = e.getStatusText();
            log.info("put {} {} {} {}", url, logJsonStr, code, bodyStr);

            BaseResult baseResult = new BaseResult();
            baseResult.setCode("10003");
            baseResult.setDataString(bodyStr);
            return baseResult;
        }
    }

    public BaseResult post(String apiPath, Map<String, String> paras){

        HttpHeaders headers = new HttpHeaders();
        String jsonStr = JSON.toJSONString(paras);
        String logJsonStr = hidePwd(paras);

        HttpEntity<String> formEntity = new HttpEntity<String>(jsonStr, headers);
        String url = getPath(apiPath);

        try {

            ResponseEntity<String> result = restTemplate.postForEntity(url, formEntity, String.class);
            log.info("post {} {} {} {}", url, logJsonStr, result.getStatusCodeValue(), result.getBody());

            BaseResult baseResult = new BaseResult();
            baseResult.setCode(BaseResult.SUCCESS_CODE);
            baseResult.setDataString(result.getBody());
            return baseResult;

        }catch (HttpClientErrorException e) {

            String bodyStr = e.getResponseBodyAsString();
            String code = e.getStatusText();
            log.info("post {} {} {} {}", url, logJsonStr, code, bodyStr);

            BaseResult baseResult = new BaseResult();
            baseResult.setCode("10001");
            baseResult.setDataString(bodyStr);
            return baseResult;
        }
    }

    public BaseResult get(String apiPath, Map paras) {

        MultiValueMap map = new LinkedMultiValueMap();
        map.setAll(paras);
        String logJsonStr = hidePwd(paras);
        String url = getPath(apiPath);
        URI targetUrl= UriComponentsBuilder.fromHttpUrl(url)
                .queryParams(map).build().toUri();

        try {
            log.info("get {} {}", targetUrl, logJsonStr);
            ResponseEntity<String> result = restTemplate.getForEntity(targetUrl, String.class);
            log.info("get return {} {}", result.getStatusCodeValue(), result.getBody());
            BaseResult baseResult = new BaseResult();
            baseResult.setCode(BaseResult.SUCCESS_CODE);
            baseResult.setDataString(result.getBody());
            return baseResult;

        }catch (HttpClientErrorException e) {

            String bodyStr = e.getResponseBodyAsString();
            String code = e.getStatusText();
            log.info("get {} {} {} {}", targetUrl, logJsonStr, code, bodyStr);

            BaseResult baseResult = new BaseResult();
            baseResult.setCode("10000");
            baseResult.setDataString(bodyStr);
            return baseResult;
        }

    }

    public String getPath(String apiPath){
        String url = lpsConfig.getHost() + apiPath.replace("{version}", lpsConfig.getVersion());
        return url;
    }

    private String hidePwd(Map paras){

        if(CollectionUtils.isEmpty(paras)) {
            return null;
        }
        if(!StringUtils.isEmpty(paras.get("password"))) {
            paras.put("password", "***");
        }
        return JSON.toJSONString(paras);
    }

    @Cacheable("lps_token")
    public String getToken() {

        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType(MediaType.APPLICATION_FORM_URLENCODED_VALUE);
        headers.setContentType(type);

        MultiValueMap<String, String> params =  new LinkedMultiValueMap<>();
        params.add("client_id", lpsConfig.getClient_id());
        params.add("client_secret", lpsConfig.getClient_secret());
        params.add("grant_type", "client_credentials");
        params.add("scope", "LPS_Web_API");

        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(params, headers);
        RestTemplate restTemplate = new RestTemplate();
        String jsonStr = restTemplate.postForObject(lpsConfig.getToken_url(), requestEntity, String.class);

        log.info("getToken {} {} {}", lpsConfig.getToken_url(), JSON.toJSONString(params), jsonStr);

        JSONObject json = JSON.parseObject(jsonStr);
        if(StringUtils.isEmpty(json.getString("access_token"))) {
            return null;
        }
        return json.getString("access_token");
    }

}
