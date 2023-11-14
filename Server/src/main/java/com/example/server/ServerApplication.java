package com.example.server;

import com.example.server.config.GwtProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
/*
*  Scan for Entities created in the GWTClient shared package
*  (to build the Spring Boot App, the GWT shared package jar must
*  be installed in the local maven
*/
@EntityScan("com.example.shared")
@EnableConfigurationProperties({GwtProperties.class})
public class ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

}
