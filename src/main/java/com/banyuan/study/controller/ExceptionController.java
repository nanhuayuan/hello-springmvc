package com.banyuan.study.controller;

import com.banyuan.study.bean.User;
import com.banyuan.study.exception.Exception1;
import com.banyuan.study.exception.Exception2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author poi 2021/5/31 22:42
 * @version 1.0
 * 2021/5/31 22:42
 */
@Controller
@RequestMapping("/exception")
public class ExceptionController {

    //http://localhost:8080/mvc/exception/exception1
    @RequestMapping("/exception1")
    @ResponseBody
    public User exception1() throws Exception1 {
        System.out.println("hello world");

        int i = 0;
        if (i++ % 2 == 0){
            throw new Exception1();
        }
        User user = new User();
        user.setId(0);
        user.setName("张三");
        user.setBirth(new Date());
        user.setGender(false);

        return user;
    }

    //http://localhost:8080/mvc/exception/exception2
    // @ResponseBody还可以用在handler的返回值上
    @RequestMapping("/exception2")
    @ResponseBody
    public User exception2() throws Exception2 {
        System.out.println("hello world");

        int i = 0;
        if (i++ % 2 == 0){
            throw new Exception2();
        }
        User user = new User();
        user.setId(0);
        user.setName("张三");
        user.setBirth(new Date());
        user.setGender(false);

        return user;
    }

}
