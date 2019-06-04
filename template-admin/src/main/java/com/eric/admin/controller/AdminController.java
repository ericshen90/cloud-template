package com.eric.admin.controller;

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
public class AdminController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("hello/{name}")
    public String hello(@PathVariable String name) {
        logger.info("{}===>>>{}", "Getting into admin", "hello");
        return "Hello," + name + ", this is template admin!";
    }
}
