package com.learning.zhq.springbootinaciton.controller;

import com.learning.zhq.springbootinaciton.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: spring-boot-in-action
 * @description: 集成测试+单元测试
 * @author: ZHQ
 * @create: 2019-05-30 22:06
 **/
@RestController
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private TestService testService;

    @RequestMapping(value = "/test1")
    public ResponseEntity<?> getService1() {
        return ResponseEntity.ok(testService.getString());
    }


    @RequestMapping(value = "/log1/test1")
    public String logTest1() {
        logger.trace("test controller ======trace");
        logger.debug("test controller ======debug");
        logger.info("test controller ======info");
        logger.warn("test controller ======warn");
        logger.error("test controller =====error");

        return "success";
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str.getBytes());

    }

}
