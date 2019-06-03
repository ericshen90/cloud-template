package com.eric.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author EricShen
 */
@EnableEurekaClient
@SpringBootApplication
public class TemplateAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateAdminApplication.class, args);
    }

}
