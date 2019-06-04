package com.eric.auth.controller;

import com.eric.auth.feign.service.AuthFeignService;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author EricShen
 * @date 2019-06-03
 */
@RestController
public class AuthController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("hello/{name}")
    public String hello(@PathVariable String name) {
        logger.info("{}===>>>{}", "Getting into auth", "hello");
        return "Hello " + name + ", this is template auth!";
    }


    @Resource
    private AuthFeignService authFeignService;

    /**
     * 模拟Feign远程调用，这里暴露一个请求接口`/feignHello` 这个请求接口将调用`AuthFeignService`（Feign接口）
     * Feign接口（`AuthFeignService`接口）将会通过`@FeignClient(value = "template-admin")`在Eureka注册中心寻找`template-admin`模块
     * Feign接口类似Controller的Rest接口，也暴露一个地址，这个地址对应`template-admin`模块的一个Controller接口地址
     *
     * @param name
     * @return
     */
    @GetMapping("/feignHello/{name}")
    public String feignHello(@PathVariable String name) {
        logger.info("{}===>>>{}", "Getting into auth", "feignHello");
        return authFeignService.hello(name);
    }

}
