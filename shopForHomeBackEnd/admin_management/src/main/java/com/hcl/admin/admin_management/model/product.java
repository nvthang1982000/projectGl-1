package com.hcl.admin.admin_management.model;

import javax.persistence.*;

@Entity
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_pro;
    private String Pro_name;
    private int Left_Quantity;
    @Transient
    private int Price;
    @Column(name = "Flag_0_1")
    private String Flag;
    @Column(name = "SupplierID_Supplier")
    private String SupplierID;

    public int getID_pro() {
        return this.ID_pro;
    }

    public void setID_pro(int ID_pro) {
        this.ID_pro = ID_pro;
    }

    public String getPro_name() {
        return this.Pro_name;
    }

    public void setPro_name(String Pro_name) {
        this.Pro_name = Pro_name;
    }

    public int getLeft_Quantity() {
        return this.Left_Quantity;
    }

    public void setLeft_Quantity(int Left_Quantity) {
        this.Left_Quantity = Left_Quantity;
    }

    public int getPrice() {
        return this.Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public String getFlag() {
        return this.Flag;
    }

    public void setFlag(String Flag) {
        this.Flag = Flag;
    }

    public String getSupplierID() {
        return this.SupplierID;
    }

    public void setSupplierID(String SupplierID) {
        this.SupplierID = SupplierID;
    }

}
