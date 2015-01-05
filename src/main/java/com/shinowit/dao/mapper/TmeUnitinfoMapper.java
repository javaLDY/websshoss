package com.shinowit.dao.mapper;

import com.shinowit.entity.TmeUnitinfo;
import com.shinowit.entity.TmeUnitinfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmeUnitinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    int countByExample(TmeUnitinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    int deleteByExample(TmeUnitinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    int deleteByPrimaryKey(Integer unitid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    int insert(TmeUnitinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    int insertSelective(TmeUnitinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    List<TmeUnitinfo> selectByExample(TmeUnitinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    TmeUnitinfo selectByPrimaryKey(Integer unitid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    int updateByExampleSelective(@Param("record") TmeUnitinfo record, @Param("example") TmeUnitinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    int updateByExample(@Param("record") TmeUnitinfo record, @Param("example") TmeUnitinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    int updateByPrimaryKeySelective(TmeUnitinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    int updateByPrimaryKey(TmeUnitinfo record);

    List<TmeUnitinfo> selectPage(TmeUnitinfoCriteria example);

    Integer selectMaxPrimaryKeyValue();
}