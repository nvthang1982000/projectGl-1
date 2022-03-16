package com.hcl.productManagement.model;

import javax.persistence.*;

@Entity
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_user")
    private int idUser;
    @Column(name = "User_name")
    private String userName;
    @Column(name = "User_address")
    private String userAddress;
    @Column(name = "User_email")
    private String userEmail;
    @Column(name = "User_phone")
    private String userPhone;
    @Column(name = "User_UN")
    private String un;
    @Column(name = "User_PW")
    private String pw;
    @Column(name = "User_image")
    private String img;

    public String getImg() {
        return this.img;
    }

    public void setImg(String img) {
        this.img = img;
    }
   
   
    public int getIdUser() {
        return this.idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }


    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getUserAddress() {
        return this.userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }


    public String getUserEmail() {
        return this.userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }



    public String getUserPhone() {
        return this.userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }



    public String getUserUn() {
        return this.un;
    }

    public void setUserUn(String userUN) {
        this.un = userUN;
    }

   
    public String getUserPW() {
        return this.pw;
    }

    public void setUserPW(String userPW) {
        this.pw = userPW;
    }

    @Transient
    private String token;

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }


}
