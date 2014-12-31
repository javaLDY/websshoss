package com.shinowit.dao.mapper;

import com.shinowit.entity.TmeOutstockdetailsinfo;
import com.shinowit.entity.TmeOutstockdetailsinfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmeOutstockdetailsinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockDetailsInfo
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    int countByExample(TmeOutstockdetailsinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockDetailsInfo
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    int deleteByExample(TmeOutstockdetailsinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockDetailsInfo
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockDetailsInfo
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    int insert(TmeOutstockdetailsinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockDetailsInfo
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    int insertSelective(TmeOutstockdetailsinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockDetailsInfo
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    List<TmeOutstockdetailsinfo> selectByExample(TmeOutstockdetailsinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockDetailsInfo
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    TmeOutstockdetailsinfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockDetailsInfo
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    int updateByExampleSelective(@Param("record") TmeOutstockdetailsinfo record, @Param("example") TmeOutstockdetailsinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockDetailsInfo
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    int updateByExample(@Param("record") TmeOutstockdetailsinfo record, @Param("example") TmeOutstockdetailsinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockDetailsInfo
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    int updateByPrimaryKeySelective(TmeOutstockdetailsinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockDetailsInfo
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    int updateByPrimaryKey(TmeOutstockdetailsinfo record);

    List<TmeOutstockdetailsinfo> selectPage(TmeOutstockdetailsinfoCriteria example);

    Integer selectMaxPrimaryKeyValue();
}