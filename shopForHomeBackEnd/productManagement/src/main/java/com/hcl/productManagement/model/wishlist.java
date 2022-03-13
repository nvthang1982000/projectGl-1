package com.hcl.productManagement.model;

import javax.persistence.*;

@Entity
public class wishlist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID_user;
    private int ProductID_pro;
    private int userid;

    public int getProductID_pro() {
        return this.ProductID_pro;
    }

    public void setProductID_pro(int ProductID_pro) {
        this.ProductID_pro = ProductID_pro;
    }

    public int getUserid() {
        return this.userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

}
