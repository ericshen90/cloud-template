package com.eric.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author EricShen
 * @date 2019-06-03
 */
@RestController
public class AdminController {

    @GetMapping("hello/{name}")
    public String hello(@PathVariable String name){
        return "Hello," + name;
    }
}
