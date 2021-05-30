package com.banyuan.study.controller;

import com.banyuan.study.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

/**
 * @author poi 2021/5/30 21:48
 * @version 1.0
 * 2021/5/30 21:48
 */
@Controller
@RequestMapping("/model")
public class ModelController {

    //http://localhost:8080/mvc/model/model
    @RequestMapping("/model")
    public String testData(Model model){
        model.addAttribute("name", "张三");
        return "home";
    }
    //http://localhost:8080/mvc/model/modelAndView
    @RequestMapping("/modelAndView")
    public ModelAndView testData(){//返回值类型为ModelAndView
        //新建ModelAndView对象
        ModelAndView mv = new ModelAndView();
        // 设置视图名，即如何跳转
        mv.setViewName("forward:/index.jsp");
        // 增加数据
        mv.addObject("age",19);
        return mv;
    }

}
