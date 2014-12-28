package com.shinowit.dao.mapper;

import com.shinowit.entity.TmeOrderdetailsinfo;
import com.shinowit.entity.TmeOrderdetailsinfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmeOrderdetailsinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderDetailsInfo
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    int countByExample(TmeOrderdetailsinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderDetailsInfo
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    int deleteByExample(TmeOrderdetailsinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderDetailsInfo
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderDetailsInfo
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    int insert(TmeOrderdetailsinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderDetailsInfo
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    int insertSelective(TmeOrderdetailsinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderDetailsInfo
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    List<TmeOrderdetailsinfo> selectByExample(TmeOrderdetailsinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderDetailsInfo
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    TmeOrderdetailsinfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderDetailsInfo
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    int updateByExampleSelective(@Param("record") TmeOrderdetailsinfo record, @Param("example") TmeOrderdetailsinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderDetailsInfo
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    int updateByExample(@Param("record") TmeOrderdetailsinfo record, @Param("example") TmeOrderdetailsinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderDetailsInfo
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    int updateByPrimaryKeySelective(TmeOrderdetailsinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderDetailsInfo
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    int updateByPrimaryKey(TmeOrderdetailsinfo record);

    List<TmeOrderdetailsinfo> selectPage(TmeOrderdetailsinfoCriteria example);

    Integer selectMaxPrimaryKeyValue();
}