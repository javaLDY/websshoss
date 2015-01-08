package com.shinowit.tools;

import com.shinowit.dao.mapper.ChartMapper;
import com.shinowit.entity.Chart;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2015/1/8.
 */
@Service
public class CacheTest {


    @Resource
    private ChartMapper chartdao;


    @Cacheable(value = "user_try_login_cache",key = "'test'+#chartid")
    public Chart  test(Integer chartid){
        System.out.println("调用了方法");
        Chart chart = chartdao.selectByPrimaryKey(chartid);
        return  chart;
    }
}
