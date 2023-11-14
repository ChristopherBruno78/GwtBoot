package com.example.server.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("gwt")
public class GwtProperties {

    private String codeserver;
}
