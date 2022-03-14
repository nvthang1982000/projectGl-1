package com.hcl.productManagement.model;

import javax.persistence.*;

@Entity
public class price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_Price;
    private int ProductID_pro;
    private int Price_af_dis;
    private int Price_bf_dis;
    private String Start_date;
    private int CouponID_Coupon;
    private int End_Date;

    public int getID_Price() {
        return this.ID_Price;
    }

    public void setID_Price(int ID_Price) {
        this.ID_Price = ID_Price;
    }

    public int getProductID_pro() {
        return this.ProductID_pro;
    }

    public void setProductID_pro(int ProductID_pro) {
        this.ProductID_pro = ProductID_pro;
    }

    public int getPrice_af_dis() {
        return this.Price_af_dis;
    }

    public void setPrice_af_dis(int Price_af_dis) {
        this.Price_af_dis = Price_af_dis;
    }

    public int getPrice_bf_dis() {
        return this.Price_bf_dis;
    }

    public void setPrice_bf_dis(int Price_bf_dis) {
        this.Price_bf_dis = Price_bf_dis;
    }

    public String getStart_date() {
        return this.Start_date;
    }

    public void setStart_date(String Start_date) {
        this.Start_date = Start_date;
    }

    public int getCouponID_Coupon() {
        return this.CouponID_Coupon;
    }

    public void setCouponID_Coupon(int CouponID_Coupon) {
        this.CouponID_Coupon = CouponID_Coupon;
    }

    public int getEnd_Date() {
        return this.End_Date;
    }

    public void setEnd_Date(int End_Date) {
        this.End_Date = End_Date;
    }

}
