package com.test.zha.redis_test_new.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @program: redisTestNew
 * @description:
 * @author: ZHQ
 * @create: 2019-06-11 10:53
 **/
@Component
@ConfigurationProperties(prefix = "spring.redis")
public class DefaultRedisDataSourceInfo extends BasicRedisInfo{
}
