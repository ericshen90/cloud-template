package com.eric.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * 服务消费方 - auth模块
 *
 * @author EricShen
 * @date 2019-06-03
 */
@EnableDiscoveryClient
@EnableHystrixDashboard
@EnableFeignClients
@SpringBootApplication
public class TemplateAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateAuthApplication.class, args);
    }

}
