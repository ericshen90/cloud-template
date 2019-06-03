package com.eric.auth.feign.service.fallback;

import com.eric.auth.feign.service.AuthFeignService;
import org.springframework.stereotype.Component;

/**
 * @author EricShen
 * @date 2019-06-03
 */
@Component
public class AuthFeignServiceFallbackImpl implements AuthFeignService {

    @Override
    public String hello(String name) {
        return "!!!Hello " + name + ", this is template-auth, but request error!!!";
    }
}
