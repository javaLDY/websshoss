package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2014/12/24.
 */
@Controller
@RequestMapping("/shinowit")
public class Chart02Controller {
    @RequestMapping("/chart02")
    public String chartshow(){
        return "/chart02";
    }

    @RequestMapping("/sessionvalid")
    public void gochart(HttpSession session){
       session.removeAttribute("src");
       session.removeAttribute("meraddsrc");
    }
}
