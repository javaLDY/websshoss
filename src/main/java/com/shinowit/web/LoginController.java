package com.shinowit.web;

import com.shinowit.dao.mapper.ToolsDao;
import com.shinowit.dao.mapper.TbaMemberinfoMapper;
import com.shinowit.entity.TbaMemberinfo;
import com.shinowit.entity.TbaMemberinfoCriteria;
import com.shinowit.tools.CacheTest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2014/12/24.
 */
@Controller
@RequestMapping("/shinowit")
public class LoginController {

    @Resource
    private TbaMemberinfoMapper memberdao;

    @Resource
    private ToolsDao dao;

    @Resource
    private CacheTest cacheTest;

    @RequestMapping("/loginemail")
    public void testemail(@RequestParam("valid") String emailvalue,HttpServletResponse response){
            List<Map<String,Object>> memberlist = dao.selectstatus(emailvalue);
            if(memberlist.size()<1){
                try {
                    response.getWriter().println("邮箱没有注册或者还没有激活!");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
    }
    @RequestMapping("/validlogin")
    public String testlogin(@ModelAttribute("loginmem")TbaMemberinfo memebr,BindingResult bindingResult,HttpServletRequest request,HttpServletResponse response){
        if(bindingResult.hasErrors()){
            return "/login";
        }
        if((memebr.getEmail()==null)||(memebr.getEmail().trim().length()<1)){
            request.setAttribute("username","用户名不能为空");
            return "/login";
        }
        if((memebr.getPwd()==null)||(memebr.getPwd().length()<1)){
            request.setAttribute("username","密码不能为空");
            return "/login";
        }

        TbaMemberinfoCriteria criteria = new TbaMemberinfoCriteria();
        TbaMemberinfoCriteria.Criteria tj = criteria.createCriteria();
        tj.andEmailEqualTo(memebr.getEmail());
        List<TbaMemberinfo> memberlist = memberdao.selectByExample(criteria);
        String loginname = null;
        int loginid = 0;
        String pwd = null;
        for(TbaMemberinfo mer : memberlist){
            loginname = mer.getUsername();
            loginid = mer.getId();
            pwd = mer.getPwd();
        }
        boolean result = false;
        if(!memebr.getPwd().equals(pwd)){
            request.setAttribute("username","密码或者姓名输入有误");
            boolean status = cacheTest.test(memebr.getPwd(),result);
            if(status==false){
                request.setAttribute("username","密码输入错误已达五次请五分钟之后输入");
            }
            return "/login";
        }

            if(memberlist.size()>0){
            request.getSession().setAttribute("loginame",loginname);
            request.getSession().setAttribute("loginid",loginid);
            return "redirect:/shinowit/index";
        }else{
            return "/login";
        }
    }
}