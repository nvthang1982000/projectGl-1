package com.hcl.productManagement.model;

import javax.persistence.*;

@Entity
public class supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_Supplier;
    private String Sup_name;
    private String Sup_email;
    private String Sup_hotline;

    public int getID_Supplier() {
        return this.ID_Supplier;
    }

    public void setID_Supplier(int ID_Supplier) {
        this.ID_Supplier = ID_Supplier;
    }

    public String getSup_name() {
        return this.Sup_name;
    }

    public void setSup_name(String Sup_name) {
        this.Sup_name = Sup_name;
    }

    public String getSup_email() {
        return this.Sup_email;
    }

    public void setSup_email(String Sup_email) {
        this.Sup_email = Sup_email;
    }

    public String getSup_hotline() {
        return this.Sup_hotline;
    }

    public void setSup_hotline(String Sup_hotline) {
        this.Sup_hotline = Sup_hotline;
    }

}
