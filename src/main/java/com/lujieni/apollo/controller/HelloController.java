package com.lujieni.apollo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther ljn
 * @Date 2019/11/13
 */
@RestController
public class HelloController {

    @Value("${name}")
    private String name;

    public String sayHello(){
        return name;
    }



}
