package com.zingpay.cardwalla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @author Bilal Hassan on 23-Feb-21
 * @project cardwalla-microservice
 */

@SpringBootApplication
@EnableFeignClients(basePackages = "com.zingpay.cardwalla.feign")
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableResourceServer
public class CardWallaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CardWallaApplication.class, args);
    }
}
