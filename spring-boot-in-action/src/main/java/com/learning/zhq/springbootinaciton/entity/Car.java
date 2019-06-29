package com.learning.zhq.springbootinaciton.entity;

/**
 * @program: spring-boot-in-action
 * @description:
 * @author: ZHQ
 * @create: 2019-06-28 10:36
 **/
public class Car {
    public Car() {
        System.out.println("Car's Constructor..");
    }

    public void init() {
        System.out.println("Car's Init...");
    }

    public void destory() {
        System.out.println("Car's Destroy...");
    }
}
