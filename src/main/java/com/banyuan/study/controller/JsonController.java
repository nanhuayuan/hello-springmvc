package com.banyuan.study.controller;
import java.util.Date;

import com.banyuan.study.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/**
 * @author poi 2021/5/31 22:42
 * @version 1.0
 * 2021/5/31 22:42
 */
@Controller
@RequestMapping("/json")
public class JsonController{

    //http://localhost:8080/mvc/json/getUser
    @RequestMapping("/getUser")
    @ResponseBody //将handler的返回值，转换成json(jackson),并将json响应给客户端。
    public User getUser(){
        System.out.println("hello world");
        User user = new User();
        user.setId(0);
        user.setName("张三");
        user.setBirth(new Date());
        user.setGender(false);

        return user;
    }

    //http://localhost:8080/mvc/json/getUserList
    // @ResponseBody还可以用在handler的返回值上
    @RequestMapping("/getUserList")
    @ResponseBody
    public List<User> getUserList(){
        System.out.println("hello world");
        User user = new User();
        user.setId(0);
        user.setName("张三");
        user.setBirth(new Date());
        user.setGender(false);

        User user2 = new User();
        user2.setId(2);
        user2.setName("lisi");
        user2.setBirth(new Date());
        user2.setGender(false);
        List<User> users = Arrays.asList(user,user2);
        return users;
    }

    //http://localhost:8080/mvc/json/string
    // 如果返回值已经是字符串，则不需要转json，直接将字符串响应给客户端
    @RequestMapping(value="/string",produces = "text/html;charset=utf-8") //produces 防止中文乱码
    @ResponseBody
    public String string(){
        System.out.println("hello world");
        return "你好";
    }
}
