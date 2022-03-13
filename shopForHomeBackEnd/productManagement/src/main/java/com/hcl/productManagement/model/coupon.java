package com.hcl.productManagement.model;
import javax.persistence.*;
@Entity
public class coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID_coupon;
    private int Discount;

    public int getID_coupon() {
        return this.ID_coupon;
    }

    public void setID_coupon(int ID_coupon) {
        this.ID_coupon = ID_coupon;
    }

    public int getDiscount() {
        return this.Discount;
    }

    public void setDiscount(int Discount) {
        this.Discount = Discount;
    }

}

