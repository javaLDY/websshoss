package com.shinowit.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class TmeOrderinfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OrderInfo.BillCode
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    private String billcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OrderInfo.BillStatus
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    private Short billstatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OrderInfo.LinkTel
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    private String linktel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OrderInfo.OrderTime
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    private String ordertime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OrderInfo.PostBillCode
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    private String postbillcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OrderInfo.PostCode
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    private String postcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OrderInfo.RecAddress
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    private String recaddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OrderInfo.RecMan
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    private String recman;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OrderInfo.Remark
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OrderInfo.TotalMoney
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    private BigDecimal totalmoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OrderInfo.OperID
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    private Integer operid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OrderInfo.DeliveryID
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    private Integer deliveryid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OrderInfo.UserName
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OrderInfo.OutBillCode
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    private Integer outbillcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_OrderInfo
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OrderInfo.BillCode
     *
     * @return the value of TMe_OrderInfo.BillCode
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    public String getBillcode() {
        return billcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OrderInfo.BillCode
     *
     * @param billcode the value for TMe_OrderInfo.BillCode
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    public void setBillcode(String billcode) {
        this.billcode = billcode == null ? null : billcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OrderInfo.BillStatus
     *
     * @return the value of TMe_OrderInfo.BillStatus
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    public Short getBillstatus() {
        return billstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OrderInfo.BillStatus
     *
     * @param billstatus the value for TMe_OrderInfo.BillStatus
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    public void setBillstatus(Short billstatus) {
        this.billstatus = billstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OrderInfo.LinkTel
     *
     * @return the value of TMe_OrderInfo.LinkTel
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    public String getLinktel() {
        return linktel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OrderInfo.LinkTel
     *
     * @param linktel the value for TMe_OrderInfo.LinkTel
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    public void setLinktel(String linktel) {
        this.linktel = linktel == null ? null : linktel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OrderInfo.OrderTime
     *
     * @return the value of TMe_OrderInfo.OrderTime
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    public String getOrdertime() {
        return ordertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OrderInfo.OrderTime
     *
     * @param ordertime the value for TMe_OrderInfo.OrderTime
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    public void setOrdertime(String ordertime) {
        this.ordertime = ordertime == null ? null : ordertime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OrderInfo.PostBillCode
     *
     * @return the value of TMe_OrderInfo.PostBillCode
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    public String getPostbillcode() {
        return postbillcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OrderInfo.PostBillCode
     *
     * @param postbillcode the value for TMe_OrderInfo.PostBillCode
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    public void setPostbillcode(String postbillcode) {
        this.postbillcode = postbillcode == null ? null : postbillcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OrderInfo.PostCode
     *
     * @return the value of TMe_OrderInfo.PostCode
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OrderInfo.PostCode
     *
     * @param postcode the value for TMe_OrderInfo.PostCode
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OrderInfo.RecAddress
     *
     * @return the value of TMe_OrderInfo.RecAddress
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    public String getRecaddress() {
        return recaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OrderInfo.RecAddress
     *
     * @param recaddress the value for TMe_OrderInfo.RecAddress
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    public void setRecaddress(String recaddress) {
        this.recaddress = recaddress == null ? null : recaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OrderInfo.RecMan
     *
     * @return the value of TMe_OrderInfo.RecMan
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    public String getRecman() {
        return recman;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OrderInfo.RecMan
     *
     * @param recman the value for TMe_OrderInfo.RecMan
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    public void setRecman(String recman) {
        this.recman = recman == null ? null : recman.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OrderInfo.Remark
     *
     * @return the value of TMe_OrderInfo.Remark
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OrderInfo.Remark
     *
     * @param remark the value for TMe_OrderInfo.Remark
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OrderInfo.TotalMoney
     *
     * @return the value of TMe_OrderInfo.TotalMoney
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    public BigDecimal getTotalmoney() {
        return totalmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OrderInfo.TotalMoney
     *
     * @param totalmoney the value for TMe_OrderInfo.TotalMoney
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    public void setTotalmoney(BigDecimal totalmoney) {
        this.totalmoney = totalmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OrderInfo.OperID
     *
     * @return the value of TMe_OrderInfo.OperID
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    public Integer getOperid() {
        return operid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OrderInfo.OperID
     *
     * @param operid the value for TMe_OrderInfo.OperID
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    public void setOperid(Integer operid) {
        this.operid = operid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OrderInfo.DeliveryID
     *
     * @return the value of TMe_OrderInfo.DeliveryID
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    public Integer getDeliveryid() {
        return deliveryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OrderInfo.DeliveryID
     *
     * @param deliveryid the value for TMe_OrderInfo.DeliveryID
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    public void setDeliveryid(Integer deliveryid) {
        this.deliveryid = deliveryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OrderInfo.UserName
     *
     * @return the value of TMe_OrderInfo.UserName
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OrderInfo.UserName
     *
     * @param username the value for TMe_OrderInfo.UserName
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OrderInfo.OutBillCode
     *
     * @return the value of TMe_OrderInfo.OutBillCode
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    public Integer getOutbillcode() {
        return outbillcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OrderInfo.OutBillCode
     *
     * @param outbillcode the value for TMe_OrderInfo.OutBillCode
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    public void setOutbillcode(Integer outbillcode) {
        this.outbillcode = outbillcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderInfo
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
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
        TmeOrderinfo other = (TmeOrderinfo) that;
        return (this.getBillcode() == null ? other.getBillcode() == null : this.getBillcode().equals(other.getBillcode()))
            && (this.getBillstatus() == null ? other.getBillstatus() == null : this.getBillstatus().equals(other.getBillstatus()))
            && (this.getLinktel() == null ? other.getLinktel() == null : this.getLinktel().equals(other.getLinktel()))
            && (this.getOrdertime() == null ? other.getOrdertime() == null : this.getOrdertime().equals(other.getOrdertime()))
            && (this.getPostbillcode() == null ? other.getPostbillcode() == null : this.getPostbillcode().equals(other.getPostbillcode()))
            && (this.getPostcode() == null ? other.getPostcode() == null : this.getPostcode().equals(other.getPostcode()))
            && (this.getRecaddress() == null ? other.getRecaddress() == null : this.getRecaddress().equals(other.getRecaddress()))
            && (this.getRecman() == null ? other.getRecman() == null : this.getRecman().equals(other.getRecman()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getTotalmoney() == null ? other.getTotalmoney() == null : this.getTotalmoney().equals(other.getTotalmoney()))
            && (this.getOperid() == null ? other.getOperid() == null : this.getOperid().equals(other.getOperid()))
            && (this.getDeliveryid() == null ? other.getDeliveryid() == null : this.getDeliveryid().equals(other.getDeliveryid()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getOutbillcode() == null ? other.getOutbillcode() == null : this.getOutbillcode().equals(other.getOutbillcode()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderInfo
     *
     * @mbggenerated Wed Dec 31 14:43:42 CST 2014
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBillcode() == null) ? 0 : getBillcode().hashCode());
        result = prime * result + ((getBillstatus() == null) ? 0 : getBillstatus().hashCode());
        result = prime * result + ((getLinktel() == null) ? 0 : getLinktel().hashCode());
        result = prime * result + ((getOrdertime() == null) ? 0 : getOrdertime().hashCode());
        result = prime * result + ((getPostbillcode() == null) ? 0 : getPostbillcode().hashCode());
        result = prime * result + ((getPostcode() == null) ? 0 : getPostcode().hashCode());
        result = prime * result + ((getRecaddress() == null) ? 0 : getRecaddress().hashCode());
        result = prime * result + ((getRecman() == null) ? 0 : getRecman().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getTotalmoney() == null) ? 0 : getTotalmoney().hashCode());
        result = prime * result + ((getOperid() == null) ? 0 : getOperid().hashCode());
        result = prime * result + ((getDeliveryid() == null) ? 0 : getDeliveryid().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getOutbillcode() == null) ? 0 : getOutbillcode().hashCode());
        return result;
    }
}