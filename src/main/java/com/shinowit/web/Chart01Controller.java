package com.shinowit.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shinowit.dao.mapper.TbaMembeaddrinfoMapper;
import com.shinowit.dao.mapper.ToolsDao;
import com.shinowit.entity.TbaMembeaddrinfo;
import com.shinowit.entity.TbaMembeaddrinfoCriteria;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2014/12/24.
 */
@Controller
@RequestMapping("/shinowit")
public class Chart01Controller {
    @Resource
    private TbaMembeaddrinfoMapper meradddao;

    @Resource
    private ToolsDao toolsDao;

    @RequestMapping("/chart01")
    public String meradd(@ModelAttribute("merxadd") TbaMembeaddrinfo meraddinfo,Model model,HttpServletRequest request) {
        //查询发货详细信息
        String username = (String) request.getSession().getAttribute("loginame");
        TbaMembeaddrinfoCriteria criteria = new TbaMembeaddrinfoCriteria();
        TbaMembeaddrinfoCriteria.Criteria tj = criteria.createCriteria();
        tj.andUsernameEqualTo(username);
        List<TbaMembeaddrinfo> meraddlist = meradddao.selectByExample(criteria);
        model.addAttribute("memberaddlist",meraddlist);
        if(meraddinfo.getRecman()==null){
            return "chart01";
        }
        //提交会员的配货信息//
        if ((meraddinfo.getRecman().trim().length() < 2)||(meraddinfo.getRecman().trim().length()>10)) {
            request.setAttribute("success", "收货人名称不合法");
            return "chart01";
        }
        if ((meraddinfo.getPostcode()== null) || (meraddinfo.getPostcode().trim().length()<1)) {
            request.setAttribute("success", "邮政编码不能为空");
            return "chart01";
        }
        if ((meraddinfo.getRecaddress() == null) || (meraddinfo.getRecaddress().trim().length()<1)) {
            request.setAttribute("success", "发送地址不能为空");
            return "chart01";
        }
        if ((meraddinfo.getTel() == null) || (meraddinfo.getTel().trim().length()<1)) {
            request.setAttribute("success", "联系电话不能为空");
            return "chart01";
        }
        meraddinfo.setUsername(username);
        int a = meradddao.insert(meraddinfo);
        if (a > 0) {
            request.setAttribute("success", "添加成功");
        }
        return "redirect:/shinowit/chart01";
    }

    @RequestMapping("/update")
    public String update(HttpServletRequest request){
        String recname = request.getParameter("recman");
        Integer id =Integer.valueOf(request.getParameter("id"));
        String recaddress = request.getParameter("recaddress");
        String tel = request.getParameter("tel");
        String postcode = request.getParameter("postcode");
        TbaMembeaddrinfo meradd = new TbaMembeaddrinfo();
        meradd.setRecman(recname);
        meradd.setRecaddress(recaddress);
        meradd.setPostcode(postcode);
        meradd.setId(id);
        meradd.setTel(tel);
        toolsDao.updatemeradd(meradd);
        return "redirect:/shinowit/chart01";
    }
    @RequestMapping("/deletemeradd")
    public void deletemeradd(@RequestParam("id") Integer id,HttpServletResponse response){
        int a = meradddao.deleteByPrimaryKey(id);
        if(a>0){
            try {
                response.getWriter().println("删除成功");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            try {
                response.getWriter().println("删除失败");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
//将地址放到session中
    @RequestMapping("/meraddsession")
    public void meraddsession(String jsonData,HttpServletRequest request){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<TbaMembeaddrinfo> sessionlist= objectMapper.readValue(jsonData, new TypeReference<List<TbaMembeaddrinfo>>() {
            });
            if(sessionlist.size()>0){
                request.getSession().setAttribute("meraddsrc",sessionlist);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

