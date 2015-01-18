package com.shinowit.tools;

import com.shinowit.dao.mapper.ChartMapper;
import com.shinowit.entity.Chart;
import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * Created by Administrator on 2015/1/8.
 */
@Service
public class CacheTest {


    @Resource
    private ChartMapper chartdao;


    @Cacheable(value = "user_try_login_cache",key = "'test'+#pwd")
    public boolean  test(String pwd,boolean status){
        CacheManager manager = CacheManager.getInstance();
        Cache cache = manager.getCache("user_try_login_cache");
        boolean cachestatus = true;
        int aa = cache.getSize();
        System.out.print(aa);
        System.out.print((Serializable)aa);
        if(cache.getSize()>=5){
            cachestatus = false;
          }
        return cachestatus;
//        System.out.println("调用了方法");
//        System.out.println(chartid);
//        Chart chart = chartdao.selectByPrimaryKey(chartid);
//        CacheManager manager = CacheManager.getInstance();
//        manager.removalAll();
//        manager.addCache("testlist");
//        Cache cache = manager.getCache("testlist");
//        Element element = new Element("testid"+chartid,chart);
//        cache.put(element);
//        Serializable valuetest = cache.get("testid"+chartid);
//        System.out.print(valuetest);
//        int elements = cache.getSize();
//        System.out.print(elements);
//        return  chart;
    }
}
