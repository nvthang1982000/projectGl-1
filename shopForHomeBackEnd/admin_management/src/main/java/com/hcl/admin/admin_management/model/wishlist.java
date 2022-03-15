package com.hcl.admin.admin_management.model;

import javax.persistence.*;

@Entity
public class wishlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    private int ProductID_pro;
    @Column(name="idUser")
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
