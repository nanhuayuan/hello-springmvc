package com.banyuan.study.controller;

import com.banyuan.study.bean.User;
import com.banyuan.study.bean.UserList;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

/**
 * @author poi 2021/5/30 9:26
 * @version 1.0
 * 2021/5/30 9:26
 */
@Controller
public class UserController {

    //导包 : aop bean core context exp web webmvc logging
    //在web.xml中配置 中央控制器 DispatcherServlet 配置路径为 /
    // 给中央控制器一个springmvc的配置文件地址  classpath: springmvc.xml
    // 配置springmvc.xml(springmvc的配置文件)
    //  扫描类   扫描类中方法  配置视图解析器
    // 书写Controller类
    // 类上要打上@Controller注解  方法上要打上 @ReqeustMapping("路径")
    // 返回值是一个字符串,


    @RequestMapping("/user/toRegister")
    public String toRegister() {

        //return "/WEB-INF/pages/register.jsp";
        return "register";
    }

    @RequestMapping("/user/register1")
    public String testParam1(Integer id,
                             String name,
                             Boolean gender,
                             @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date birth) {
        System.out.println("test param1");
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        System.out.println("gender:" + gender);
        System.out.println("birth:" + birth);

        return "register";
    }

    @RequestMapping("/user/register2")
    public String testParam2(User user){
        System.out.println("test param2");
        System.out.println("user:"+user);
        return "register";
    }

    @RequestMapping("/test3")
    public String testParam3(String[] hobby){
        for(String h:hobby){
            System.out.print(h+" ");
        }
        return "register";
    }

    @RequestMapping("/test4/{id}")
// @PathVariable将{id}路径匹配到值赋给id参数
// 路径名和参数名相同则@PathVariable("id")可简写为 @PathVariable
    public String testParam4(@PathVariable("id") Integer id){
        System.out.println("id:"+id);
        return "register";
    }

    @RequestMapping("/test5/{username}")
    public String testParam5(@PathVariable("username") String name){//将{username}路径匹配到的值赋给name参数
        System.out.println("username:"+name);
        return "register";
    }

    @RequestMapping(value = "/test5/{username}", method = RequestMethod.POST)
    public String testParam6(@PathVariable("username") String name){//将{username}路径匹配到的值赋给name参数
        System.out.println("username:"+name);
        return "register";
    }
}
