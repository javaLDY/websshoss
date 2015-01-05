package com.shinowit.web;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shinowit.dao.mapper.ChartMapper;
import com.shinowit.dao.mapper.ToolsDao;
import com.shinowit.entity.Chart;
import com.shinowit.entity.ChartCriteria;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2014/12/29.
 */
@Controller
@RequestMapping("/shinowit")
public class ChartCarController {

    @Resource
    private ChartMapper chartdao;

    @Resource
    private ToolsDao toolsDao;

    @RequestMapping("/chartcar")
    public void chart(HttpServletRequest request,HttpServletResponse response){
        Integer loginid = (Integer)request.getSession().getAttribute("loginid");
        String merchanname = request.getParameter("merchanname");
        String picture = request.getParameter("picture");
        int num =Integer.valueOf( request.getParameter("num"));
        Double price =Double.valueOf(request.getParameter("price"));
        BigDecimal smallnum = BigDecimal.valueOf(price);
        BigDecimal newprice = BigDecimal.valueOf(price);

        try {
            byte[] bb = merchanname.getBytes("ISO-8859-1");
            merchanname = new String(bb, "UTF-8");
            boolean status = false;
            try {
                 status = toolsDao.chartinsert(merchanname,newprice,picture,num,smallnum,loginid);
            }catch (Exception e){
                e.printStackTrace();
            }
            if(status==true){
                try {
                    response.getWriter().println("加入成功");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else{
                try {
                    response.getWriter().println("加入失败");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/chart")
    public String chartcarselect(@RequestParam(value = "pageindex",required = false) Integer pageIndex,Model model,HttpServletRequest request){
        Integer loginid = (Integer)request.getSession().getAttribute("loginid");
        ChartCriteria criteria = new ChartCriteria();
        ChartCriteria.Criteria tj = criteria.createCriteria();
        tj.andMerberidEqualTo(loginid);
        int sumnum = 0;
        int pageSize=4;
        sumnum = chartdao.selectByExample(criteria).size();
        int pagetotalnum = sumnum/pageSize;
        if(sumnum%pageSize!=0){
            pagetotalnum = pagetotalnum+1;
        }
        List<Map<String,Object>> resultlist = toolsDao.totalnum(loginid);
        Object a = null;
        Object b = null;
        for(Map<String,Object> num : resultlist){
             a = num.get("snumnum");
             b = num.get("totalprice");
        }
        model.addAttribute("snumnum",a);
        model.addAttribute("totalprice",b);
        if(pageIndex==null){
            pageIndex = 1;
            List<Map<String,Object>> chartlist = toolsDao.chartselect(loginid,pageSize,pageIndex);
            model.addAttribute("modellist",chartlist);
            model.addAttribute("pageindex",pageIndex);
            model.addAttribute("pagesize",pageSize);
            model.addAttribute("sumnum",sumnum);
            model.addAttribute("pagetotalnum",pagetotalnum);
        }else{
            List<Map<String,Object>> chartlist = toolsDao.chartselect(loginid,pageSize,pageIndex);
            model.addAttribute("modellist", chartlist);
            model.addAttribute("pageindex",pageIndex);
            model.addAttribute("pagesize",pageSize);
            model.addAttribute("sumnum",sumnum);
            model.addAttribute("pagetotalnum",pagetotalnum);
        }
        return "chart";
    }
//单挑删除
    @RequestMapping("/delete")
    public String deletechart(@RequestParam("chartid") Integer chartid){
        int a = chartdao.deleteByPrimaryKey(chartid);
        return "redirect:/shinowit/chart";
    }
//多条删除
    @RequestMapping("/deleteall")
    public void deleteaa(String jsonData,HttpServletResponse response){
        try {
            ObjectMapper objectMapper = new  ObjectMapper();
            List<Chart> chartList= objectMapper.readValue(jsonData, new TypeReference<List<Chart>>(){});
            int a = 0;
            for (Chart chart:chartList){
                a = chartdao.deleteByPrimaryKey(chart.getChartid());
            }
            if(a>0){
                response.getWriter().println("删除成功");
            }else{
                response.getWriter().println("删除失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//存放商品信息session
    @RequestMapping("/session")
    public void pushsession(String jsonData,HttpServletRequest request){
        try {
            ObjectMapper objectMapper = new  ObjectMapper();
            List<Chart> sessionlist= objectMapper.readValue(jsonData, new TypeReference<List<Chart>>(){});
            if(sessionlist.size()>0){
                request.getSession().setAttribute("src",sessionlist);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
