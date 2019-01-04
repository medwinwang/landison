package com.medwin.landison.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by medwin on 2018/10/30.
 */
@Component
@ConfigurationProperties(prefix="pay.alipay")
@Getter
@Setter
@ToString
public class AlipayConfig {

    private String privateKey;
    private String publicKey;
    private String appId;
    private String server;
    private String notifyUrl;
    private String returnUrl;
    private String backHost;
    private String sign;
    private String charset;
    private String format;

}
