package com.shinowit.web;

import com.shinowit.dao.mapper.TmeMerchandisecinfoMapper;
import com.shinowit.dao.mapper.TmeMerchandiseinfoMapper;
import com.shinowit.dao.mapper.ToolsDao;
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
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    @Resource
    private ToolsDao toolsDao;

    @RequestMapping("/merchandise")
    @ResponseBody
    public List<TmeMerchandiseinfo> merchandiseselect(@RequestParam("merchanCid")String merCid){
        List<TmeMerchandiseinfo> merchaninfolist = null;
        TmeMerchandiseinfoCriteria criteria1 = new TmeMerchandiseinfoCriteria();
        TmeMerchandiseinfoCriteria.Criteria tj2 = criteria1.createCriteria();
        tj2.andMerchandisecidEqualTo(Integer.valueOf(merCid));
        tj2.andSalestatusEqualTo(true);
        merchaninfolist = merchandisedao.selectByExample(criteria1);
        return merchaninfolist;
    }

//    @RequestMapping("/merchandisexinxi")
//    public String merchandisexinxiselect(@RequestParam("merchanname")String merchanname,Model model){
//        List<Map<String,Object>> merchaninfolist = null;
//        try {
//            byte[] bb = merchanname.getBytes("ISO-8859-1");
//            merchanname=new String(bb,"UTF-8");
//            merchaninfolist = toolsDao.selecmerchan(merchanname);
//            model.addAttribute("merchandiseall",merchaninfolist);
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        return "/shinowit/index";
//    }

    @RequestMapping("/index")
    public String indexshow(@ModelAttribute("merchan")TmeMerchandiseinfo merchandiseinfo,Model model,@RequestParam(value = "pageindex",required = false) Integer pageIndex,@RequestParam(value = "merchanname",required = false)String merchanname){
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
        //商品分页展示
        TmeMerchandiseinfoCriteria criteria3 = new TmeMerchandiseinfoCriteria();
        TmeMerchandiseinfoCriteria.Criteria tj3 = criteria3.createCriteria();
        tj3.andMerchandiseidIsNotNull();
        int merchandisetoalnum = merchandisedao.selectByExample(criteria3).size();//商品信息的总数
        int pagesumnum=0;
        if(merchanname==null) {
            if (pageIndex == null) {
                pageIndex = 1;
                int pageSize = 4;
                pagesumnum = merchandisetoalnum / pageSize;
                if (merchandisetoalnum % pageSize != 0) {
                    pagesumnum = pagesumnum + 1;
                }
                criteria3.setPageIndex(pageIndex);
                criteria3.setPageSize(pageSize);
                merchaninfolist = merchandisedao.selectPage(criteria3);
            } else {
                int pageSize = 4;
                pagesumnum = merchandisetoalnum / pageSize;
                if (merchandisetoalnum % pageSize != 0) {
                    pagesumnum = pagesumnum + 1;
                }
                criteria3.setPageIndex(pageIndex);
                criteria3.setPageSize(pageSize);
                merchaninfolist = merchandisedao.selectPage(criteria3);
            }
        }else{
            List<Map<String,Object>> merchaninfolist1 = null;
            try {
                int pageSize=4;
                byte[] bb = merchanname.getBytes("ISO-8859-1");
                merchanname=new String(bb,"UTF-8");
                if(pageIndex==null) {
                    pageIndex = 1;
                    merchaninfolist1 = toolsDao.pageselecmerchan(merchanname, pageSize, pageIndex);
                    int merchandisetoalnum1 = toolsDao.selecmerchan(merchanname).size();
                    int pagesumnum2 = merchandisetoalnum1 / pageSize;
                    if (merchandisetoalnum % pageSize != 0) {
                        pagesumnum2 = pagesumnum2 + 1;
                    }
                    model.addAttribute("pagesumnum", pagesumnum2);
                    model.addAttribute("pageIndex", pageIndex);
                    model.addAttribute("merchanname",merchanname);
                    model.addAttribute("merchandiseall", merchaninfolist1);
                    model.addAttribute("merchandisetoalnum", merchandisetoalnum1);
                }else{
                    merchaninfolist1 = toolsDao.pageselecmerchan(merchanname, pageSize, pageIndex);
                    int merchandisetoalnum1 = toolsDao.selecmerchan(merchanname).size();
                    int pagesumnum2 = merchandisetoalnum1 / pageSize;
                    if (merchandisetoalnum % pageSize != 0) {
                        pagesumnum2 = pagesumnum2 + 1;
                    }
                    model.addAttribute("pagesumnum", pagesumnum2);
                    model.addAttribute("pageIndex", pageIndex);
                    model.addAttribute("merchanname",merchanname);
                    model.addAttribute("merchandiseall", merchaninfolist1);
                    model.addAttribute("merchandisetoalnum", merchandisetoalnum1);
                }
                return "/index";
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }

        model.addAttribute("merchandiseall",merchaninfolist);
        model.addAttribute("merchandisetoalnum",merchandisetoalnum);
        model.addAttribute("merchanname",merchanname);
        model.addAttribute("pageIndex",pageIndex);
        model.addAttribute("pagesumnum",pagesumnum);
        return "/index";
    }
}
