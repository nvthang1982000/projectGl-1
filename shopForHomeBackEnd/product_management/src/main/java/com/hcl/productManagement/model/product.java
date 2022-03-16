package com.hcl.productManagement.model;

import javax.persistence.*;

@Entity
@NamedQuery(
    name ="product.getAllProduct",
    query = "select  p.ID_pro, p.Pro_name, a.Price_af_dis, GROUP_CONCAT(m.Path) as images ,p.Left_Quantity from product p join price a on p.ID_pro = a.ProductID_pro  join image m on p.ID_pro = m.ProductID_pro where sysdate() between a.Start_date and a.End_Date group by ID_pro"
)

@NamedQuery(
    name ="product.getProductDetail",
    query = "select  p.ID_pro, p.Pro_name, a.Price_af_dis, GROUP_CONCAT(m.Path) as images ,p.Left_Quantity from product p join price a on p.ID_pro = a.ProductID_pro  join image m on p.ID_pro = m.ProductID_pro where sysdate() between a.Start_date and a.End_Date and ID_pro=:param group by ID_pro"
)

@NamedQuery(
    name ="product.search",
    query = "select  p.ID_pro, p.Pro_name, a.Price_af_dis, GROUP_CONCAT(m.Path) as images ,p.Left_Quantity from product p join price a on p.ID_pro = a.ProductID_pro  join image m on p.ID_pro = m.ProductID_pro where sysdate() between a.Start_date and a.End_Date and Pro_name like '%:key%' group by ID_pro"
)
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_pro;
    private String Pro_name;
    private int Left_Quantity;
    private int Price;
    private String Flag;
    private String SupplierID;
    @Transient
    private String image;

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }


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
