package com.banyuan.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author poi 2021/5/30 21:58
 * @version 1.0
 * 2021/5/30 21:58
 */
@Controller
@RequestMapping("/session")
@SessionAttributes({"gender","name"}) // model中的 name和gender 会存入session中
public class SessionController {

    //http://localhost:8080/mvc/session/addToSession
    @RequestMapping("/addToSession")
    public String hello(Model m){
        m.addAttribute("gender",true); // 会存入session
        m.addAttribute("name","lisi"); // 会存入session
        return "home";
    }

    //http://localhost:8080/mvc/session/removeFromSession
    @RequestMapping("/removeFromSession")
    public String hello(SessionStatus status){
        // 移除通过SessionAttributes存入的session
        status.setComplete();
        return "home";
    }

}
