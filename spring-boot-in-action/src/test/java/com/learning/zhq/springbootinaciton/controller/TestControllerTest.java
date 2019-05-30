package com.learning.zhq.springbootinaciton.controller;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getService1() {
        String response = restTemplate.getForObject("/test1", String.class);
        System.out.println(response);
        Assertions.assertThat(response).isEqualTo("hello");
//        Assertions.assertThat(response).endsWith("hello");
    }
}