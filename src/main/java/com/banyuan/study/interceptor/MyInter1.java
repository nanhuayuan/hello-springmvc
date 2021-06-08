package com.banyuan.study.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author  poi 2021/5/31 23:56
 * @version 1.0
 * 2021/5/31 23:56
 */
public class MyInter1 implements HandlerInterceptor {
    //主要逻辑：在handler之前执行：抽取handler中的冗余代码
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        System.out.println("pre~~~");
        /*
        response.sendRedirect("/springMVC_day2/index.jsp");//响应
        return false;//中断请求
        */
        return true;//放行，后续的拦截器或handler就会执行
    }
    //在handler之后执行:进一步的响应定制
    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        System.out.println("post~~");
    }
    //在页面渲染完毕之后，执行：资源回收
    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        System.out.println("after~~");
    }
}
