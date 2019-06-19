package com.test.zha.redis_test_new;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableCaching
@EnableScheduling
@SpringBootApplication
public class RedisTestNewApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisTestNewApplication.class, args);
    }
}
