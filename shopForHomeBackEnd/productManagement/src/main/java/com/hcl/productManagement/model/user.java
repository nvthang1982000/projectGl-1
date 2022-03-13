package com.hcl.productManagement.model;

import javax.persistence.*;

@Entity
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID_user;
    private String User_name;
    private String User_address;
    private String User_email;
    private String User_phone;
    private String User_UN;
    private String User_PW;

    public int getID_user() {
        return this.ID_user;
    }

    public void setID_user(int ID_user) {
        this.ID_user = ID_user;
    }

    public String getUser_name() {
        return this.User_name;
    }

    public void setUser_name(String User_name) {
        this.User_name = User_name;
    }

    public String getUser_address() {
        return this.User_address;
    }

    public void setUser_address(String User_address) {
        this.User_address = User_address;
    }

    public String getUser_email() {
        return this.User_email;
    }

    public void setUser_email(String User_email) {
        this.User_email = User_email;
    }

    public String getUser_phone() {
        return this.User_phone;
    }

    public void setUser_phone(String User_phone) {
        this.User_phone = User_phone;
    }

    public String getUser_UN() {
        return this.User_UN;
    }

    public void setUser_UN(String User_UN) {
        this.User_UN = User_UN;
    }

    public String getUser_PW() {
        return this.User_PW;
    }

    public void setUser_PW(String User_PW) {
        this.User_PW = User_PW;
    }

}
