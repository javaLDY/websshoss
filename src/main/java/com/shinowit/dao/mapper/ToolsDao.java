package com.shinowit.dao.mapper;

import com.shinowit.entity.TbaMembeaddrinfo;
import com.shinowit.entity.TbaMemberinfo;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.sql.Types;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2014/12/26.
 */
@Repository
public class ToolsDao {

    @Resource
    private JdbcTemplate jt;
    //在点击邮箱之后尽心比较之后更新数据库将状态给成符合标准的状态
    public boolean regstatusinsert(String name,boolean status){
        boolean result = false;
        String sql = "update dbo.TBa_MemberInfo set Status=? where UserName=?";
        int a = jt.update(sql,new Object[]{status,name},new int[]{Types.BOOLEAN,Types.VARCHAR});
        if(a>0){
            result = true;
        }
        return result;
    }

    //在做登录的时候ajax请求验证输入的邮箱是否已经同过了激活
    public List<Map<String,Object>> selectstatus(String emailvalue){
        List<Map<String,Object>> result = null;
        String sql = "select c.Status from dbo.TBa_MemberInfo c where c.Email=?";
        result = jt.queryForList(sql,new Object[]{emailvalue},new int[]{Types.VARCHAR});
        return result;
    }

    //商品信息的模糊查询
    public List<Map<String,Object>> selecmerchan(String merchanname){
        List<Map<String,Object>> result = null;
        String sql = "select * from dbo.TMe_MerchandiseInfo a where a.MerchandiseName like ?";
        result = jt.queryForList(sql,new Object[]{"%"+merchanname+"%"},new int[]{Types.VARCHAR});
        return result;
    }
    //真正的商品信息模糊查询
    public List<Map<String,Object>> pageselecmerchan(String merchanname,int pageSize,int pageIndex){
        List<Map<String,Object>> result = null;
        String sql = "select top "+pageSize+" * from dbo.TMe_MerchandiseInfo a" +
                     " where a.MerchandiseName" +
                "  not in (select top (("+pageIndex+"-1) * "+pageSize+") MerchandiseName from dbo.TMe_MerchandiseInfo where MerchandiseName like '%"+merchanname+"%')and a.MerchandiseName like '%"+merchanname+"%' ;";
        result = jt.queryForList(sql);
        return result;
    }
    //购物车的插入
    public boolean chartinsert(String merchanname,BigDecimal price,String picture,int num,BigDecimal smallnum){
        boolean result = false;
        String sql = "insert into chart(merchandisename,smallsum,num,picth,price) values(?,?,?,?,?)";
        int a = jt.update(sql,new Object[]{merchanname,smallnum,num,picture,price},new int[]{Types.VARCHAR,Types.NUMERIC,Types.INTEGER,Types.VARCHAR,Types.NUMERIC});
        if(a>0){
            result = true;
        }
        return result;
    }
    //购物车的总数量计算
    public List<Map<String,Object>> totalnum(){
        List<Map<String,Object>> result = null;
        String sql = "select SUM(num) as snumnum,SUM(price) as totalprice from dbo.chart ";
        result = jt.queryForList(sql,new Object[]{},new int[]{});
        return result;
    }
    //发货信息更改
     public boolean updatemeradd(TbaMembeaddrinfo meradd){
         boolean result = false;
         String sql = "update TBa_MembeAddrInfo set RecMan=?,RecAddress=?,PostCode=?,Tel=? where ID=?";
         int a = jt.update(sql,new Object[]{meradd.getRecman(),meradd.getRecaddress(),meradd.getPostcode(),meradd.getTel(),meradd.getId()},new int[]{Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.INTEGER});
         if(a>0){
             result = true;
         }
         return result;
     }
}
