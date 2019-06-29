package com.learning.zhq.springbootinaciton.exception;

/**
 * @program: spring-boot-in-action
 * @description:
 * @author: ZHQ
 * @create: 2019-06-27 16:53
 **/
public class WebException extends BaseException {
    public WebException(String message) {
        super(message);
    }

    public WebException(int code, String message) {
        super(code, message);
    }
}