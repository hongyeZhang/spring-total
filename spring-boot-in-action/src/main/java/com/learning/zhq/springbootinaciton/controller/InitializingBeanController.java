package com.learning.zhq.springbootinaciton.controller;

import com.learning.zhq.springbootinaciton.bean.InitializingBeanDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-boot-in-action
 * @description:
 * @author: ZHQ
 * @create: 2019-06-28 10:22
 **/
@RestController
public class InitializingBeanController {

/*    @Autowired
    private InitializingBeanDemo initializingBeanDemo;

    @RequestMapping(value = "/bean/test1")
    public String test1() {
        initializingBeanDemo.testInit();
        return "test1 return";
    }*/

    @RequestMapping(value = "/bean/test2")
    public String test2() {
        System.out.println("hello world");
        return "test2 return";
    }


}
