package com.medwin.landison.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by medwin on 2018/10/19.
 */
@Component
@ConfigurationProperties(prefix="lps")
@Getter
@Setter
@ToString
@Slf4j
public class LpsConfig {

    private String version;

    private String host;

    private String client_id;

    private String client_secret;

    private String token_url;

    private Register register;

    @Data
    public static class Register{

        private String enrollmentChannelCode;

        private String membershipCardTypeCode;

        private String membershipCardLevelCode;
    }


}
