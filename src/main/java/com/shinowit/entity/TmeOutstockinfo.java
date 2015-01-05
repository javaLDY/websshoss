package com.shinowit.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class TmeOutstockinfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OutStockInfo.OutBillCode
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    private Integer outbillcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OutStockInfo.Handler
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    private String handler;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OutStockInfo.OutTime
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    private String outtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OutStockInfo.OutType
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    private Short outtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OutStockInfo.OutStockInfoName
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    private String outstockinfoname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OutStockInfo.Remark
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OutStockInfo.TotalMoney
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    private BigDecimal totalmoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OutStockInfo.OperID
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    private Integer operid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OutStockInfo.OutBillCode
     *
     * @return the value of TMe_OutStockInfo.OutBillCode
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    public Integer getOutbillcode() {
        return outbillcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OutStockInfo.OutBillCode
     *
     * @param outbillcode the value for TMe_OutStockInfo.OutBillCode
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    public void setOutbillcode(Integer outbillcode) {
        this.outbillcode = outbillcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OutStockInfo.Handler
     *
     * @return the value of TMe_OutStockInfo.Handler
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    public String getHandler() {
        return handler;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OutStockInfo.Handler
     *
     * @param handler the value for TMe_OutStockInfo.Handler
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    public void setHandler(String handler) {
        this.handler = handler == null ? null : handler.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OutStockInfo.OutTime
     *
     * @return the value of TMe_OutStockInfo.OutTime
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    public String getOuttime() {
        return outtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OutStockInfo.OutTime
     *
     * @param outtime the value for TMe_OutStockInfo.OutTime
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    public void setOuttime(String outtime) {
        this.outtime = outtime == null ? null : outtime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OutStockInfo.OutType
     *
     * @return the value of TMe_OutStockInfo.OutType
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    public Short getOuttype() {
        return outtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OutStockInfo.OutType
     *
     * @param outtype the value for TMe_OutStockInfo.OutType
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    public void setOuttype(Short outtype) {
        this.outtype = outtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OutStockInfo.OutStockInfoName
     *
     * @return the value of TMe_OutStockInfo.OutStockInfoName
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    public String getOutstockinfoname() {
        return outstockinfoname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OutStockInfo.OutStockInfoName
     *
     * @param outstockinfoname the value for TMe_OutStockInfo.OutStockInfoName
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    public void setOutstockinfoname(String outstockinfoname) {
        this.outstockinfoname = outstockinfoname == null ? null : outstockinfoname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OutStockInfo.Remark
     *
     * @return the value of TMe_OutStockInfo.Remark
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OutStockInfo.Remark
     *
     * @param remark the value for TMe_OutStockInfo.Remark
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OutStockInfo.TotalMoney
     *
     * @return the value of TMe_OutStockInfo.TotalMoney
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    public BigDecimal getTotalmoney() {
        return totalmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OutStockInfo.TotalMoney
     *
     * @param totalmoney the value for TMe_OutStockInfo.TotalMoney
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    public void setTotalmoney(BigDecimal totalmoney) {
        this.totalmoney = totalmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OutStockInfo.OperID
     *
     * @return the value of TMe_OutStockInfo.OperID
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    public Integer getOperid() {
        return operid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OutStockInfo.OperID
     *
     * @param operid the value for TMe_OutStockInfo.OperID
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    public void setOperid(Integer operid) {
        this.operid = operid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
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
        TmeOutstockinfo other = (TmeOutstockinfo) that;
        return (this.getOutbillcode() == null ? other.getOutbillcode() == null : this.getOutbillcode().equals(other.getOutbillcode()))
            && (this.getHandler() == null ? other.getHandler() == null : this.getHandler().equals(other.getHandler()))
            && (this.getOuttime() == null ? other.getOuttime() == null : this.getOuttime().equals(other.getOuttime()))
            && (this.getOuttype() == null ? other.getOuttype() == null : this.getOuttype().equals(other.getOuttype()))
            && (this.getOutstockinfoname() == null ? other.getOutstockinfoname() == null : this.getOutstockinfoname().equals(other.getOutstockinfoname()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getTotalmoney() == null ? other.getTotalmoney() == null : this.getTotalmoney().equals(other.getTotalmoney()))
            && (this.getOperid() == null ? other.getOperid() == null : this.getOperid().equals(other.getOperid()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockInfo
     *
     * @mbggenerated Mon Jan 05 19:10:53 CST 2015
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOutbillcode() == null) ? 0 : getOutbillcode().hashCode());
        result = prime * result + ((getHandler() == null) ? 0 : getHandler().hashCode());
        result = prime * result + ((getOuttime() == null) ? 0 : getOuttime().hashCode());
        result = prime * result + ((getOuttype() == null) ? 0 : getOuttype().hashCode());
        result = prime * result + ((getOutstockinfoname() == null) ? 0 : getOutstockinfoname().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getTotalmoney() == null) ? 0 : getTotalmoney().hashCode());
        result = prime * result + ((getOperid() == null) ? 0 : getOperid().hashCode());
        return result;
    }
}