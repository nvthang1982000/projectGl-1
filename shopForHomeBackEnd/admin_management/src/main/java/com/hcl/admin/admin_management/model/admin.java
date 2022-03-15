package com.hcl.admin.admin_management.model;
import javax.persistence.*;
/**
 * admin
 */
@Entity
public class admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ad")
    private int ID ;
    @Column(name = "Ad_name")
    private String name ;
    @Column(name = "Ad_email")
    private String email;
    @Column(name = "Ad_UN")
    private String un;
    @Column(name = "Ad_PW")
    private String pw;
    @Column(name = "Ad_image")
	private String image;

	public String getimg() {
		return this.image;
	}

	public void setimg(String img) {
		this.image = img;
	}

	public int getID_ad() {
		return this.ID;
	}

	public void setID_ad(int ID_ad) {
		this.ID = ID_ad;
	}

	public String getname() {
		return this.name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getemail() {
		return this.email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public String getUN() {
		return this.un;
	}

	public void setUN(String UN) {
		this.un = UN;
	}

	public String getPW() {
		return this.pw;
	}

	public void setPW(String PW) {
		this.pw = PW;
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