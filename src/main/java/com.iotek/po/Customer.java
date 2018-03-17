package com.iotek.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;




public class Customer implements Serializable {

    public static final Integer CUSTOMER_IS_NORMAL = 1;
    public static final Integer CUSTOMER_IS_NOT_NORMAL = 0;

//    transient  ·ÀÖ¹×Ö¶ÎÐòÁÐ»¯
    private  Integer  id;
    private String customerName;
    private  transient String customerPassword;
    private String customerEmail;
    private String customerPhone;
    private BigDecimal customerMoney;
    private Integer customerIsNormal;
    private Timestamp customerCreateTime;
    private Timestamp customerModifiedTime;
    private Integer customerAge;
    private String customerSex;
    private String customerPhoto;
    private String customerSkill;
    private String customerResume;

    public Integer getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(Integer customerAge) {
        this.customerAge = customerAge;
    }

    public String getCustomerSex() {
        return customerSex;
    }

    public void setCustomerSex(String customerSex) {
        this.customerSex = customerSex;
    }

    public String getCustomerPhoto() {
        return customerPhoto;
    }

    public void setCustomerPhoto(String customerPhoto) {
        this.customerPhoto = customerPhoto;
    }

    public String getCustomerSkill() {
        return customerSkill;
    }

    public void setCustomerSkill(String customerSkill) {
        this.customerSkill = customerSkill;
    }

    public String getCustomerResume() {
        return customerResume;
    }

    public void setCustomerResume(String customerResume) {
        this.customerResume = customerResume;
    }

    public Customer() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public BigDecimal getCustomerMoney() {
        return customerMoney;
    }

    public void setCustomerMoney(BigDecimal customerMoney) {
        this.customerMoney = customerMoney;
    }

    public Integer getCustomerIsNormal() {
        return customerIsNormal;
    }

    public void setCustomerIsNormal(Integer customerIsNormal) {
        this.customerIsNormal = customerIsNormal;
    }


    public Timestamp getCustomerCreateTime() {
        return customerCreateTime;
    }

    public void setCustomerCreateTime(Timestamp customerCreateTime) {
        this.customerCreateTime = customerCreateTime;
    }

    public Timestamp getCustomerModifiedTime() {
        return customerModifiedTime;
    }

    public void setCustomerModifiedTime(Timestamp customerModifiedTime) {
        this.customerModifiedTime = customerModifiedTime;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", customerPassword='" + customerPassword + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", customerMoney=" + customerMoney +
                ", customerIsNormal=" + customerIsNormal +
                ", customerCreateTime=" + customerCreateTime +
                ", customerModifiedTime=" + customerModifiedTime +
                ", customerAge=" + customerAge +
                ", customerSex='" + customerSex + '\'' +
                ", customerPhoto='" + customerPhoto + '\'' +
                ", customerSkill='" + customerSkill + '\'' +
                ", customerResume='" + customerResume + '\'' +
                '}';
    }
}
