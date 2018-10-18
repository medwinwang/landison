package com.medwin.landison.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by medwin on 2018/10/15.
 */

@Component
@ConfigurationProperties(prefix="kms")
@Getter
@Setter
@ToString
public class KmsConfig {

    private String url;
    private String username;
    private String pwd;

    private String sessionId;
}
