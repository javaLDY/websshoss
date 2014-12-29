package com.shinowit.web;

import com.shinowit.dao.mapper.TmeMerchandisecinfoMapper;
import com.shinowit.dao.mapper.TmeMerchandiseinfoMapper;
import com.shinowit.entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2014/12/24.
 */
@Controller
@RequestMapping("/shinowit")
public class InnerPageController {

    @Resource
    private TmeMerchandisecinfoMapper merchanscdao;

    @Resource
    private TmeMerchandiseinfoMapper merchandisedao;

    @RequestMapping("/innerpage")
    public String chartshow(@RequestParam("merchanname") String merchanname,Model model){
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
        //根据商品
        try {
            byte[] bb = merchanname.getBytes("ISO-8859-1");
            merchanname=new String(bb,"UTF-8");
            TmeMerchandiseinfoCriteria criteria2 = new TmeMerchandiseinfoCriteria();
            TmeMerchandiseinfoCriteria.Criteria tj2 = criteria2.createCriteria();
            tj2.andMerchandisenameEqualTo(merchanname);
            List<TmeMerchandiseinfo> merlist = merchandisedao.selectByExample(criteria2);
            for(TmeMerchandiseinfo mer : merlist){
                model.addAttribute("merchanname",mer.getMerchandisename());
                model.addAttribute("price",mer.getPrice());
                model.addAttribute("picpath",mer.getPicpath());
                model.addAttribute("unite",mer.getUnitid());
                model.addAttribute("spen",mer.getSpec());
                return "innerpage";
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "/innerpage";
    }
}
