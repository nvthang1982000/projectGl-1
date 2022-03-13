package com.hcl.productManagement.model;
import javax.persistence.*;
@Entity
public class bill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Bill_ID;
    private int ProductID_pro;
    private int Quantity;
    private int UserID_user;
    private int PriceProductID_pro;
    private int PriceID_Price;

    public int getBill_ID() {
        return this.Bill_ID;
    }

    public void setBill_ID(int Bill_ID) {
        this.Bill_ID = Bill_ID;
    }

    public int getProductID_pro() {
        return this.ProductID_pro;
    }

    public void setProductID_pro(int ProductID_pro) {
        this.ProductID_pro = ProductID_pro;
    }

    public int getQuantity() {
        return this.Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public int getUserID_user() {
        return this.UserID_user;
    }

    public void setUserID_user(int UserID_user) {
        this.UserID_user = UserID_user;
    }

    public int getPriceProductID_pro() {
        return this.PriceProductID_pro;
    }

    public void setPriceProductID_pro(int PriceProductID_pro) {
        this.PriceProductID_pro = PriceProductID_pro;
    }

    public int getPriceID_Price() {
        return this.PriceID_Price;
    }

    public void setPriceID_Price(int PriceID_Price) {
        this.PriceID_Price = PriceID_Price;
    }

}
