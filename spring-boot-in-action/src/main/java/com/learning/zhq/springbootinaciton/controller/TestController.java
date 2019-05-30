package com.learning.zhq.springbootinaciton.controller;

import com.learning.zhq.springbootinaciton.service.TestService;
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

    @Resource
    private TestService testService;

    @RequestMapping(value = "/test1")
    public ResponseEntity<?> getService1() {
        return ResponseEntity.ok(testService.getString());
    }

}
