package com.learning.zhq.springbootinaciton.controller;

import com.learning.zhq.springbootinaciton.exception.WebException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/hello1")
    public String hello1() {

        try {
            logger.info("enter the method");
            if (logger.isDebugEnabled()) {
                logger.debug("debug level logback");
            }
            if (true) {
                throw new WebException("web exception");
            }
        } catch (WebException e) {
            logger.error("web exception, =" + e);
        } catch (Exception e) {
            e.printStackTrace();
        }

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
