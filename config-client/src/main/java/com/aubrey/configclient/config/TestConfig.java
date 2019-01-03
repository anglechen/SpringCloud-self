package com.aubrey.configclient.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author aubrey
 * @create 2019-01-02 16:21
 */
@RefreshScope
@ConfigurationProperties
@Component
@Data
public class TestConfig {
    private String name;
    private Integer age;
}
