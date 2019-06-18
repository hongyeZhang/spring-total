package com.learning.zhq.springbootinaciton.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-boot-in-action
 * @description:
 * @author: ZHQ
 * @create: 2019-06-19 00:01
 **/
@RestController
public class HelloConroller {

    @RequestMapping(value = "/hello1")
    public String hello1() {
        return "hello1";
    }


    @RequestMapping(value = "/hello2.do")
    public String hello2() {
        return "hello2";
    }

    @RequestMapping(value = "/hello3.json")
    public String hello3() {
        return "hello3";
    }

}
