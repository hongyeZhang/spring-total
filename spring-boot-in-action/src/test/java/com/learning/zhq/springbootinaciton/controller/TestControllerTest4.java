package com.learning.zhq.springbootinaciton.controller;

import com.learning.zhq.springbootinaciton.service.TestService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.*;

public class TestControllerTest4 {

    @Mock
    TestService testService;
    @InjectMocks
    TestController testController;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetService1() throws Exception {
        when(testService.getString()).thenReturn("hello");

        ResponseEntity<?> result = testController.getService1();
        Assert.assertEquals("hello", result.getBody());
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme