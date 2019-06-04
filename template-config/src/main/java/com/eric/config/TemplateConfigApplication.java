package com.eric.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author EricShen
 */
@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class TemplateConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateConfigApplication.class, args);
    }

}
