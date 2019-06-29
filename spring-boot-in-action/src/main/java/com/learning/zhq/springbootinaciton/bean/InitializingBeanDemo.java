package com.learning.zhq.springbootinaciton.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


/**
 * @program: spring-boot-in-action
 * @description:
 * @author: ZHQ
 * @create: 2019-06-28 10:19
 **/
@Component
public class InitializingBeanDemo implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet bean demo");
    }


    public void testInit() {
        System.out.println("this is oridnary method");
    }
}
