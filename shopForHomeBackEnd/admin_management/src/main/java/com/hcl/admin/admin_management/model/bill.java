package com.hcl.admin.admin_management.model;
import javax.persistence.*;
@Entity
public class bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int billId;
    private String date;
    private int userId;
    private Double total;

    public int getBillId() {
        return this.billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Double getTotal() {
        return this.total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }



}
