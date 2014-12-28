package com.shinowit.web;

import com.shinowit.dao.mapper.TmeMerchandisecinfoMapper;
import com.shinowit.dao.mapper.TmeMerchandiseinfoMapper;
import com.shinowit.entity.TmeMerchandisecinfo;
import com.shinowit.entity.TmeMerchandisecinfoCriteria;
import com.shinowit.entity.TmeMerchandiseinfo;
import com.shinowit.entity.TmeMerchandiseinfoCriteria;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2014/12/24.
 */
@Controller
@RequestMapping("/shinowit")
public class IndexController {

    @Resource
    private TmeMerchandisecinfoMapper merchanscdao;

    @Resource
    private TmeMerchandiseinfoMapper merchandisedao;

    @RequestMapping("/merchandise")
    @ResponseBody
    public List<TmeMerchandiseinfo> merchandiseselect(@RequestParam("merchanCid")String merCid,Model model){
        List<TmeMerchandiseinfo> merchaninfolist = null;
        TmeMerchandiseinfoCriteria criteria1 = new TmeMerchandiseinfoCriteria();
        TmeMerchandiseinfoCriteria.Criteria tj2 = criteria1.createCriteria();
        tj2.andMerchandisecidEqualTo(Integer.valueOf(merCid));
        tj2.andSalestatusEqualTo(true);
        merchaninfolist = merchandisedao.selectByExample(criteria1);
        return merchaninfolist;
    }

    @RequestMapping("/index")
    public String indexshow(@ModelAttribute("merchan")TmeMerchandiseinfo merchandiseinfo,Model model){
        //商品类别查询
        List<TmeMerchandisecinfo> merchaninfoclist = new ArrayList<TmeMerchandisecinfo>();
        TmeMerchandisecinfoCriteria criteria = new TmeMerchandisecinfoCriteria();
        TmeMerchandisecinfoCriteria.Criteria tj = criteria.createCriteria();
        tj.andMerchandisecidIsNotNull();
        merchaninfoclist = merchanscdao.selectByExample(criteria);
        model.addAttribute("merchanCinfo", merchaninfoclist);
        //商品上架是否查询
        List<TmeMerchandiseinfo> merchaninfolist = null;
        TmeMerchandiseinfoCriteria criteria1 = new TmeMerchandiseinfoCriteria();
        TmeMerchandiseinfoCriteria.Criteria tj1 = criteria1.createCriteria();
        tj1.andSalestatusEqualTo(true);
        merchaninfolist = merchandisedao.selectByExample(criteria1);
        model.addAttribute("merchandise",merchaninfolist);
        //商品信息主要展示栏
        TmeMerchandiseinfoCriteria criteria3 = new TmeMerchandiseinfoCriteria();
        TmeMerchandiseinfoCriteria.Criteria tj3 = criteria1.createCriteria();
        tj1.andMerchandiseidIsNotNull();
        merchaninfolist = merchandisedao.selectByExample(criteria3);
        model.addAttribute("merchandiseall",merchaninfolist);
        return "/index";
    }
}
