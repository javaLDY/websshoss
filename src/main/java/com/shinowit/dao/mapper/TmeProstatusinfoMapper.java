package com.shinowit.dao.mapper;

import com.shinowit.entity.TmeProstatusinfo;
import com.shinowit.entity.TmeProstatusinfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmeProstatusinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_ProStatusInfo
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    int countByExample(TmeProstatusinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_ProStatusInfo
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    int deleteByExample(TmeProstatusinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_ProStatusInfo
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    int deleteByPrimaryKey(Integer prostatusid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_ProStatusInfo
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    int insert(TmeProstatusinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_ProStatusInfo
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    int insertSelective(TmeProstatusinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_ProStatusInfo
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    List<TmeProstatusinfo> selectByExample(TmeProstatusinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_ProStatusInfo
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    TmeProstatusinfo selectByPrimaryKey(Integer prostatusid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_ProStatusInfo
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    int updateByExampleSelective(@Param("record") TmeProstatusinfo record, @Param("example") TmeProstatusinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_ProStatusInfo
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    int updateByExample(@Param("record") TmeProstatusinfo record, @Param("example") TmeProstatusinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_ProStatusInfo
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    int updateByPrimaryKeySelective(TmeProstatusinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_ProStatusInfo
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    int updateByPrimaryKey(TmeProstatusinfo record);

    List<TmeProstatusinfo> selectPage(TmeProstatusinfoCriteria example);

    Integer selectMaxPrimaryKeyValue();
}