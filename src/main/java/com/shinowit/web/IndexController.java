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
import javax.servlet.http.HttpServletRequest;
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

//    @RequestMapping("/merchandise")
//    public String merchandiseselect(@RequestParam("merchanCid")String merCid,Model model){
//        List<TmeMerchandiseinfo> merchaninfolist = null;
//        TmeMerchandiseinfoCriteria criteria1 = new TmeMerchandiseinfoCriteria();
//        TmeMerchandiseinfoCriteria.Criteria tj2 = criteria1.createCriteria();
//        tj2.andMerchandisecidEqualTo(Integer.valueOf(merCid));
//        tj2.andSalestatusEqualTo(true);
//        merchaninfolist = merchandisedao.selectByExample(criteria1);
//        model.addAttribute("merchandise",merchaninfolist);
//        return "redirect:/shinowit/index";
//    }

    @RequestMapping("/index")
    public String indexshow(@ModelAttribute("merchan")TmeMerchandiseinfo merchandiseinfo,HttpServletRequest request,Model model,@RequestParam(value = "merchanCid",required = false)String merCid,@RequestParam(value = "pageindex",required = false) Integer pageIndex,@RequestParam(value = "merchanname",required = false)String merchanname,HttpServletResponse response){
        //商品类别查询
        List<TmeMerchandisecinfo> merchaninfoclist = new ArrayList<TmeMerchandisecinfo>();
        TmeMerchandisecinfoCriteria criteria = new TmeMerchandisecinfoCriteria();
        TmeMerchandisecinfoCriteria.Criteria tj = criteria.createCriteria();
        tj.andMerchandisecidIsNotNull();
        merchaninfoclist = merchanscdao.selectByExample(criteria);
        model.addAttribute("merchanCinfo", merchaninfoclist);
        //商品上架是否查询
        List<TmeMerchandiseinfo> merchaninfolist = null;
        if(merCid==null){
            TmeMerchandiseinfoCriteria criteria1 = new TmeMerchandiseinfoCriteria();
            TmeMerchandiseinfoCriteria.Criteria tj1 = criteria1.createCriteria();
            tj1.andSalestatusEqualTo(true);
            merchaninfolist = merchandisedao.selectByExample(criteria1);
            model.addAttribute("merchandise",merchaninfolist);
        }else{
            TmeMerchandiseinfoCriteria criteria1 = new TmeMerchandiseinfoCriteria();
            TmeMerchandiseinfoCriteria.Criteria tj2 = criteria1.createCriteria();
            tj2.andMerchandisecidEqualTo(Integer.valueOf(merCid));
            tj2.andSalestatusEqualTo(true);
            merchaninfolist = merchandisedao.selectByExample(criteria1);
            model.addAttribute("merchandise",merchaninfolist);
        }
        //商品分页展示
        TmeMerchandiseinfoCriteria criteria3 = new TmeMerchandiseinfoCriteria();
        TmeMerchandiseinfoCriteria.Criteria tj3 = criteria3.createCriteria();
        tj3.andMerchandiseidIsNotNull();
        int merchandisetoalnum = merchandisedao.selectByExample(criteria3).size();//商品信息的总数
        int pagesumnum=0;
        //这个是首页的展示就是在没有进行商品信息查询的时候进行的
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
            } else {//这里是有了上下页参数或者跳转的时候
                int pageSize = 4;
                pagesumnum = merchandisetoalnum / pageSize;
                if (merchandisetoalnum % pageSize != 0) {
                    pagesumnum = pagesumnum + 1;
                }
                criteria3.setPageIndex(pageIndex);
                criteria3.setPageSize(pageSize);
                merchaninfolist = merchandisedao.selectPage(criteria3);
            }
        }else{//这里是在进行商品信息的模糊查询之后的战士
            List<Map<String,Object>> merchaninfolist1 = null;
            try {
                int pageSize=4;
                byte[] bb = merchanname.getBytes("ISO-8859-1");
                merchanname=new String(bb,"UTF-8");
                if(pageIndex==null) {//同样的这里还是需要判断当前页是否为空
                    pageIndex = 1;
                    merchaninfolist1 = toolsDao.pageselecmerchan(merchanname, pageSize, pageIndex);
                    int merchandisetoalnum1 = toolsDao.selecmerchan(merchanname).size();
                    int pagesumnum2 = merchandisetoalnum1 / pageSize;
                    if (merchandisetoalnum % pageSize != 0) {
                        pagesumnum2 = pagesumnum2 + 1;
                    }
                    model.addAttribute("pagesumnum", pagesumnum2);
                    model.addAttribute("pageIndex", pageIndex);
                    model.addAttribute("merchanname",merchanname);//这里是在进行模糊查询的时候要附带的参数如果不将它还给前台那么在进行下一页或者页面跳转的时候会返回首页查询
                    model.addAttribute("merchandiseall", merchaninfolist1);
                    model.addAttribute("merchandisetoalnum", merchandisetoalnum1);
                }else{//这里是在触发了上下页的时间的时候进行的分页查询
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
        return "index";
    }
}
