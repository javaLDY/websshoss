package com.shinowit.dao.mapper;

import com.shinowit.entity.District;
import com.shinowit.entity.DistrictCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DistrictMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table district
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    int countByExample(DistrictCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table district
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    int deleteByExample(DistrictCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table district
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    int insert(District record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table district
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    int insertSelective(District record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table district
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    List<District> selectByExample(DistrictCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table district
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    int updateByExampleSelective(@Param("record") District record, @Param("example") DistrictCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table district
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    int updateByExample(@Param("record") District record, @Param("example") DistrictCriteria example);

    List<District> selectPage(DistrictCriteria example);
}