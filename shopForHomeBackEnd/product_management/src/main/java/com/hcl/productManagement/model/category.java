package com.hcl.productManagement.model;
import javax.persistence.*;
@Entity
public class category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_cat;
    private String Gruop;

    public int getID_cat() {
        return this.ID_cat;
    }

    public void setID_cat(int ID_cat) {
        this.ID_cat = ID_cat;
    }

    public String getGruop() {
        return this.Gruop;
    }

    public void setGruop(String Gruop) {
        this.Gruop = Gruop;
    }

}
