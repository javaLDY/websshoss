package com.shinowit.web;

import com.shinowit.dao.mapper.ChartMapper;
import com.shinowit.entity.Chart;
import com.shinowit.tools.CacheTest;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/1/6.
 */
@Controller
@RequestMapping("/shinowit")
public class TestehacaheController {



//    public List<Map<String,List>> ehcache(String chartid){
//        List<Map<String,Object>> result = null;
//        Chart chart = chartdao.selectByPrimaryKey(Integer.valueOf(chartid));
//        String name = chart.getMerchandisename();
//        if (result != null) {
//
//        }
//    }


    @Resource
    private CacheTest cacheTest;

    @RequestMapping("/testehcache")
    public String test(int chartid,Model model){
        model.addAttribute("name", cacheTest.test(chartid));
        return "/test";
    }

}
