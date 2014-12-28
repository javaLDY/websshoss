package com.shinowit.dao.mapper;

import com.shinowit.entity.TbaDeliveryinfo;
import com.shinowit.entity.TbaDeliveryinfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbaDeliveryinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_DeliveryInfo
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    int countByExample(TbaDeliveryinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_DeliveryInfo
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    int deleteByExample(TbaDeliveryinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_DeliveryInfo
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    int deleteByPrimaryKey(Integer deliveryid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_DeliveryInfo
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    int insert(TbaDeliveryinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_DeliveryInfo
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    int insertSelective(TbaDeliveryinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_DeliveryInfo
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    List<TbaDeliveryinfo> selectByExample(TbaDeliveryinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_DeliveryInfo
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    TbaDeliveryinfo selectByPrimaryKey(Integer deliveryid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_DeliveryInfo
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    int updateByExampleSelective(@Param("record") TbaDeliveryinfo record, @Param("example") TbaDeliveryinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_DeliveryInfo
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    int updateByExample(@Param("record") TbaDeliveryinfo record, @Param("example") TbaDeliveryinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_DeliveryInfo
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    int updateByPrimaryKeySelective(TbaDeliveryinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_DeliveryInfo
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    int updateByPrimaryKey(TbaDeliveryinfo record);

    List<TbaDeliveryinfo> selectPage(TbaDeliveryinfoCriteria example);

    Integer selectMaxPrimaryKeyValue();
}