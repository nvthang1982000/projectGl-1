package com.hcl.productManagement.model;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class product_categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int ProductID_pro;
    private int CategoriesID_Cat;

    public int getProductID_pro() {
        return this.ProductID_pro;
    }

    public void setProductID_pro(int ProductID_pro) {
        this.ProductID_pro = ProductID_pro;
    }

    public int getCategoriesID_Cat() {
        return this.CategoriesID_Cat;
    }

    public void setCategoriesID_Cat(int CategoriesID_Cat) {
        this.CategoriesID_Cat = CategoriesID_Cat;
    }

}
