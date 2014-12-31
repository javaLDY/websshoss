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
                 status = toolsDao.chartinsert(merchanname,newprice,picture,num,smallnum);
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
    public String chartcarselect(@RequestParam(value = "pageindex",required = false) Integer pageIndex,Model model){
        ChartCriteria criteria = new ChartCriteria();
        ChartCriteria.Criteria tj = criteria.createCriteria();
        tj.andChartidIsNotNull();
        int sumnum = 0;
        int pageSize=4;
        sumnum = chartdao.selectByExample(criteria).size();
        int pagetotalnum = sumnum/pageSize;
        if(sumnum%pageSize!=0){
            pagetotalnum = pagetotalnum+1;
        }
        List<Map<String,Object>> resultlist = toolsDao.totalnum();
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
            criteria.setPageSize(pageSize);
            criteria.setPageIndex(pageIndex);
            List<Chart> chartlist = chartdao.selectPage(criteria);
            model.addAttribute("modellist",chartlist);
            model.addAttribute("pageindex",pageIndex);
            model.addAttribute("pagesize",pageSize);
            model.addAttribute("sumnum",sumnum);
            model.addAttribute("pagetotalnum",pagetotalnum);
        }else{
            criteria.setPageSize(pageSize);
            criteria.setPageIndex(pageIndex);
            List<Chart> chartlist = chartdao.selectPage(criteria);
            model.addAttribute("modellist", chartlist);
            model.addAttribute("pageindex",pageIndex);
            model.addAttribute("pagesize",pageSize);
            model.addAttribute("sumnum",sumnum);
            model.addAttribute("pagetotalnum",pagetotalnum);
        }
        return "chart";
    }

    @RequestMapping("/delete")
    public String deletechart(@RequestParam("chartid") Integer chartid){
        int a = chartdao.deleteByPrimaryKey(chartid);
        return "redirect:/shinowit/chart";
    }

    @RequestMapping("/deleteall")
    public String deleteaa(String jsonData){
        try {
            ObjectMapper objectMapper = new  ObjectMapper();
            List<Chart> chartList= objectMapper.readValue(jsonData, new TypeReference<List<Chart>>(){});
            for (Chart chart:chartList){
                chartdao.deleteByPrimaryKey(chart.getChartid());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/shinowit/chart";
    }
}
