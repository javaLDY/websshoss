package com.shinowit.tools;

import com.shinowit.dao.mapper.ChartMapper;
import com.shinowit.entity.Chart;
import com.shinowit.entity.TbaMemberinfo;
import com.shinowit.entity.TmeMerchandiseinfo;
import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Map;

/**
 * Created by Administrator on 2015/1/8.
 */
@Service
public class CacheTest {


    @Resource
    private ChartMapper chartdao;

    @Cacheable(value = "user_try_login_cache",key = "#username")
    public Integer totaltime (String username,Integer trytime){
        return trytime;
    }
}
