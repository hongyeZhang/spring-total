package com.learning.zhq.springbootinaciton.controller;

import com.learning.zhq.springbootinaciton.service.TestService;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Collections;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@WebMvcTest(TestController.class)
public class TestControllerTest3 {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private TestService testService;

    @Test
    public void getService1() throws Exception {
        Mockito.when(testService.getString()).thenReturn("world");

        mvc.perform(MockMvcRequestBuilders.get("/test1"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("world")));


    }
}