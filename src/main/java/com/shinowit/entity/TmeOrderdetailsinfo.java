package com.shinowit.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class TmeOrderdetailsinfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OrderDetailsInfo.ID
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OrderDetailsInfo.Num
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    private Integer num;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OrderDetailsInfo.Price
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    private BigDecimal price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OrderDetailsInfo.MerchandiseID
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    private Integer merchandiseid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OrderDetailsInfo.BillCode
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    private String billcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OrderDetailsInfo.UnitID
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    private Integer unitid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_OrderDetailsInfo
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OrderDetailsInfo.ID
     *
     * @return the value of TMe_OrderDetailsInfo.ID
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OrderDetailsInfo.ID
     *
     * @param id the value for TMe_OrderDetailsInfo.ID
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OrderDetailsInfo.Num
     *
     * @return the value of TMe_OrderDetailsInfo.Num
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OrderDetailsInfo.Num
     *
     * @param num the value for TMe_OrderDetailsInfo.Num
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OrderDetailsInfo.Price
     *
     * @return the value of TMe_OrderDetailsInfo.Price
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OrderDetailsInfo.Price
     *
     * @param price the value for TMe_OrderDetailsInfo.Price
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OrderDetailsInfo.MerchandiseID
     *
     * @return the value of TMe_OrderDetailsInfo.MerchandiseID
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    public Integer getMerchandiseid() {
        return merchandiseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OrderDetailsInfo.MerchandiseID
     *
     * @param merchandiseid the value for TMe_OrderDetailsInfo.MerchandiseID
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    public void setMerchandiseid(Integer merchandiseid) {
        this.merchandiseid = merchandiseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OrderDetailsInfo.BillCode
     *
     * @return the value of TMe_OrderDetailsInfo.BillCode
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    public String getBillcode() {
        return billcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OrderDetailsInfo.BillCode
     *
     * @param billcode the value for TMe_OrderDetailsInfo.BillCode
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    public void setBillcode(String billcode) {
        this.billcode = billcode == null ? null : billcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OrderDetailsInfo.UnitID
     *
     * @return the value of TMe_OrderDetailsInfo.UnitID
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    public Integer getUnitid() {
        return unitid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OrderDetailsInfo.UnitID
     *
     * @param unitid the value for TMe_OrderDetailsInfo.UnitID
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    public void setUnitid(Integer unitid) {
        this.unitid = unitid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderDetailsInfo
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
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
        TmeOrderdetailsinfo other = (TmeOrderdetailsinfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getMerchandiseid() == null ? other.getMerchandiseid() == null : this.getMerchandiseid().equals(other.getMerchandiseid()))
            && (this.getBillcode() == null ? other.getBillcode() == null : this.getBillcode().equals(other.getBillcode()))
            && (this.getUnitid() == null ? other.getUnitid() == null : this.getUnitid().equals(other.getUnitid()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderDetailsInfo
     *
     * @mbggenerated Mon Dec 29 21:11:42 CST 2014
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getMerchandiseid() == null) ? 0 : getMerchandiseid().hashCode());
        result = prime * result + ((getBillcode() == null) ? 0 : getBillcode().hashCode());
        result = prime * result + ((getUnitid() == null) ? 0 : getUnitid().hashCode());
        return result;
    }
}