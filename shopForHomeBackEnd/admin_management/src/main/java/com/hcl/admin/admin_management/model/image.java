package com.hcl.admin.admin_management.model;

import javax.persistence.*;
@Entity
public class image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String Path;
    private int ProductID_pro;

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPath() {
        return this.Path;
    }

    public void setPath(String Path) {
        this.Path = Path;
    }

    public int getProductID_pro() {
        return this.ProductID_pro;
    }

    public void setProductID_pro(int ProductID_pro) {
        this.ProductID_pro = ProductID_pro;
    }

}
