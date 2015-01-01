package com.shinowit.web;

import com.shinowit.dao.mapper.ToolsDao;
import com.shinowit.dao.mapper.TbaMemberinfoMapper;
import com.shinowit.entity.TbaMemberinfo;
import com.shinowit.entity.TbaMemberinfoCriteria;
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
    public String testlogin(@ModelAttribute("loginmem")TbaMemberinfo memebr,BindingResult bindingResult,HttpServletRequest request){
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
        for(TbaMemberinfo mer : memberlist){
            loginname = mer.getUsername();
        }
        if(memberlist.size()>0){
            request.getSession().setAttribute("loginame",loginname);
            return "redirect:/shinowit/index";
        }else{
            return "/login";
        }
    }
}