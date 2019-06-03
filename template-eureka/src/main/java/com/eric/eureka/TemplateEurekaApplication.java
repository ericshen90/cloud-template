package com.eric.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心 - Eureka
 * @author EricShen
 * @date 2019-06-03
 */
@EnableEurekaServer
@SpringBootApplication
public class TemplateEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateEurekaApplication.class, args);
    }

}
