package com.banyuan.study.handler;

import com.banyuan.study.exception.Exception1;
import com.banyuan.study.exception.Exception2;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author poi 2021/5/31 23:08
 * @version 1.0
 * 2021/5/31 23:08
 */
public class MyExResolver implements HandlerExceptionResolver {
    /**
     * 异常解析器：主体逻辑
     * 执行时刻：当handler中抛出异常时，会执行：捕获异常，并可以跳到错误页面
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest request,
                                         HttpServletResponse response, Object handler, Exception ex) {
        ex.printStackTrace();//打印异常栈
        //创建一个ModelAndView
        ModelAndView mv = new ModelAndView();
        //识别异常
        if (ex instanceof Exception1) {
            mv.setViewName("redirect:/skip/toHomePage");
        } else if (ex instanceof Exception2) {
            mv.setViewName("redirect:redirect:/index.jsp");
        }
        return mv;
    }
}
