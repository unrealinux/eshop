package com.outseaeasy.eurekaservercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaservercenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaservercenterApplication.class, args);
    }

}
