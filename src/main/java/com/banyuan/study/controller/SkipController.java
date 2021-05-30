package com.banyuan.study.controller;

import com.banyuan.study.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.Date;

/**
 * @author poi 2021/5/30 17:56
 * @version 1.0
 * 2021/5/30 17:56
 */
@Controller
@RequestMapping("/skip")
public class SkipController {

    @RequestMapping("/toHomePage")
    public String toHomePage(){
        return "home";
    }

    @RequestMapping("/forward1")
    public String testForward(){
        System.out.println("test forward1");
        // 转发跳转 /pages/forward.jsp
        // return "forward";//和下一行等价
        return "forward:/WEB-INF/pages/forward.jsp";
    }
    @RequestMapping("/forward2")
    public String testForward2(){
        System.out.println("test forward2");
        //转发到  /skip/forward1
        return "forward:forward1";//相对路径(转发到本类中的test1)
        //转发到  /skip/forward1
        //return "forward:/skip/forward1"; //绝对路径
    }


    //http://localhost:8080/mvc/skip/redirect1
    @RequestMapping("/redirect1")
    public String testRedirect1(){
        System.out.println("test redirect1");
        //重定向到 /redir/toHomePage
        return "redirect:toHomePage"; //相对路径(转发到本类中的toHomePage)
        //return "redirect:/skip/toHomePage";//绝对路径
    }
    //http://localhost:8080/mvc/skip/redirect2
    @RequestMapping("/redirect2")
    public String testRedirect2(){
        System.out.println("test redirect2");
        //重定向到 index.jsp
        return "redirect:/index.jsp";
    }

    //http://localhost:8080/mvc/skip/forwardData
    @RequestMapping("/forwardData")
    public String testForward(HttpSession session, HttpServletRequest req, Integer id){
        System.out.println("test forwardData");

        User sessionUser = new User();
        sessionUser.setBirth(new Date());
        sessionUser.setId(1);

        session.setAttribute("user",sessionUser);
        req.setAttribute("age", 18);
        req.setAttribute("users", Arrays.asList(sessionUser));
        // 转发跳转 /pages/forward.jsp
        return "forward:/index.jsp";
    }


    //http://localhost:8080/mvc/skip/redirectData
    @RequestMapping("/redirectData")
    public String testRedirectData(HttpSession session, HttpServletRequest req){
        System.out.println("test testRedirectData");

        User sessionUser = new User();
        sessionUser.setBirth(new Date());
        sessionUser.setId(1);

        session.setAttribute("user",sessionUser);
        req.setAttribute("age", 18);
        req.setAttribute("users", Arrays.asList(sessionUser));

        //重定向到 index.jsp
        return "redirect:/index.jsp";
    }
}
