package com.shinowit.entity;

import java.io.Serializable;

public class TmeProstatusinfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_ProStatusInfo.ProStatusID
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    private Integer prostatusid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_ProStatusInfo.ProStatusName
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    private String prostatusname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_ProStatusInfo.Remark
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_ProStatusInfo.Status
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    private Boolean status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_ProStatusInfo
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_ProStatusInfo.ProStatusID
     *
     * @return the value of TMe_ProStatusInfo.ProStatusID
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    public Integer getProstatusid() {
        return prostatusid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_ProStatusInfo.ProStatusID
     *
     * @param prostatusid the value for TMe_ProStatusInfo.ProStatusID
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    public void setProstatusid(Integer prostatusid) {
        this.prostatusid = prostatusid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_ProStatusInfo.ProStatusName
     *
     * @return the value of TMe_ProStatusInfo.ProStatusName
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    public String getProstatusname() {
        return prostatusname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_ProStatusInfo.ProStatusName
     *
     * @param prostatusname the value for TMe_ProStatusInfo.ProStatusName
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    public void setProstatusname(String prostatusname) {
        this.prostatusname = prostatusname == null ? null : prostatusname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_ProStatusInfo.Remark
     *
     * @return the value of TMe_ProStatusInfo.Remark
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_ProStatusInfo.Remark
     *
     * @param remark the value for TMe_ProStatusInfo.Remark
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_ProStatusInfo.Status
     *
     * @return the value of TMe_ProStatusInfo.Status
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_ProStatusInfo.Status
     *
     * @param status the value for TMe_ProStatusInfo.Status
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_ProStatusInfo
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TmeProstatusinfo other = (TmeProstatusinfo) that;
        return (this.getProstatusid() == null ? other.getProstatusid() == null : this.getProstatusid().equals(other.getProstatusid()))
            && (this.getProstatusname() == null ? other.getProstatusname() == null : this.getProstatusname().equals(other.getProstatusname()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_ProStatusInfo
     *
     * @mbggenerated Sun Dec 28 23:34:48 CST 2014
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProstatusid() == null) ? 0 : getProstatusid().hashCode());
        result = prime * result + ((getProstatusname() == null) ? 0 : getProstatusname().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}