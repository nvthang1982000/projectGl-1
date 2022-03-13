package com.hcl.productManagement.model;
import javax.persistence.*;
/**
 * admin
 */
@Entity
public class admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID_ad ;
    private String Ad_name ;
    private String Ad_email;
    private String Ad_UN;
    private String Ad_PW;

	public int getID_ad() {
		return this.ID_ad;
	}

	public void setID_ad(int ID_ad) {
		this.ID_ad = ID_ad;
	}

	public String getAd_name() {
		return this.Ad_name;
	}

	public void setAd_name(String Ad_name) {
		this.Ad_name = Ad_name;
	}

	public String getAd_email() {
		return this.Ad_email;
	}

	public void setAd_email(String Ad_email) {
		this.Ad_email = Ad_email;
	}

	public String getAd_UN() {
		return this.Ad_UN;
	}

	public void setAd_UN(String Ad_UN) {
		this.Ad_UN = Ad_UN;
	}

	public String getAd_PW() {
		return this.Ad_PW;
	}

	public void setAd_PW(String Ad_PW) {
		this.Ad_PW = Ad_PW;
	}

}