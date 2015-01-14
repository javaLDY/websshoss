package com.shinowit;

import com.shinowit.dao.mapper.ToolsDao;
import com.shinowit.entity.TmeMerchandiseinfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Administrator on 2015/1/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:application-context.xml"})
public class JunitTest {

    @Resource
    private ToolsDao dao;

    @Test
    public void test(){
        boolean status = false;

            TmeMerchandiseinfo mer = new TmeMerchandiseinfo();
            mer.setMerchandisename("你妹的我擦");
            mer.setPrice(BigDecimal.valueOf(12.00));
            mer.setPicpath("images/T1.jpg");
            status = dao.insertmerchaner(mer);
        if(status==true){
            System.out.print("插入成功");
        }
    }

    @Test
    public void test1(){
        Long starttime = new Date().getTime();
        dao.testmohu("你妹");
        Long endtime = new Date().getTime();
        System.out.print("耗时" + (endtime-starttime));
    }


}
