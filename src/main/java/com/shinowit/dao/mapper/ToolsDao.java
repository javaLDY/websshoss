package com.shinowit.dao.mapper;

import com.shinowit.entity.TbaMemberinfo;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.lang.reflect.Type;
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
}
