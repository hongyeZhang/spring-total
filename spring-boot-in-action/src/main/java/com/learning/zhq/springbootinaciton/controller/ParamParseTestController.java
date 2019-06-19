package com.learning.zhq.springbootinaciton.controller;

import com.learning.zhq.springbootinaciton.entity.UserModel;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: spring-boot-in-action
 * @description:
 * @author: ZHQ
 * @create: 2019-06-19 00:23
 **/
@RestController
public class ParamParseTestController {

    /**
     * 1.直接把表单的参数写在Controller相应的方法的形参中
     *
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/addUser1")
    public String addUser1(String username, String password) {
        System.out.println("username is:" + username);
        System.out.println("password is:" + password);
        return "demo/index";
    }

    /**
     * 2、通过HttpServletRequest接收
     *
     * @param request
     * @return
     */
    @RequestMapping("/addUser2")
    public String addUser2(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username is:" + username);
        System.out.println("password is:" + password);
        return "demo/index";
    }

    /**
     * 3、通过一个bean来接收
     *
     * @param user
     * @return
     */
    @RequestMapping("/addUser3")
    public String addUser3(UserModel user) {
        System.out.println("username is:" + user.getUsername());
        System.out.println("password is:" + user.getPassword());
        return "demo/index";
    }

    /**
     * 4、通过@PathVariable获取路径中的参数
     *
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/addUser4/{username}/{password}", method = RequestMethod.GET)
    public String addUser4(@PathVariable String username, @PathVariable String password) {
        System.out.println("username is:" + username);
        System.out.println("password is:" + password);
        return "demo/index";
    }

    /**
     * 6、用注解@RequestParam绑定请求参数到方法入参
     *
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/addUser6", method = RequestMethod.GET)
    public String addUser6(@RequestParam(value = "username", required = false) String username, @RequestParam("password") String password) {
        System.out.println("username is:" + username);
        System.out.println("password is:" + password);
        return "demo/index";
    }
}
