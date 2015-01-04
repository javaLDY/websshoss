package com.shinowit.tools;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2015/1/3.
 */

public class Intercepter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        String uri = request.getRequestURI();
        if((uri.endsWith("validate"))||(uri.endsWith("emailvalid"))||(uri.endsWith("loginemail"))||(uri.endsWith("index"))||(uri.endsWith("validlogin"))||(uri.endsWith("insert"))||(uri.startsWith("/lib"))||(uri.startsWith(".js"))||(uri.endsWith(".css"))||(uri.endsWith(".jsp"))||(uri.endsWith(".png"))||(uri.endsWith("innerpage"))){
            return true;
        }
        String session = (String)request.getSession().getAttribute("loginame");
        if(session==null){
            response.sendRedirect(request.getContextPath()+"/shinowit/validlogin");
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) throws Exception {

    }
}
