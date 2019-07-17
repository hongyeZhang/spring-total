package com.learning.zhq.springbootinaciton.bean;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @program: spring-boot-in-action
 * @description:
 * @author: ZHQ
 * @create: 2019-06-29 17:04
 **/
@Component
public class ApplicationListenerDemo implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println(event);
        System.out.println("test application listener ... ...");

    }
}
