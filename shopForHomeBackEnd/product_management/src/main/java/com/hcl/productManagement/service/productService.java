package com.hcl.productManagement.service;

import com.hcl.productManagement.rep.productRep;
import com.hcl.productManagement.model.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productService {
    @Autowired
    productRep rep;

    public List<product> getAllproduct()
    {
        List<product> products =new ArrayList<product>();
        //TO-get product detail
       for (String[] a : rep.getAllProduct()) {
           product p=new product();
           p.setID_pro(Integer.parseInt(a[0]));
           p.setPro_name(a[1]);
           p.setPrice(Integer.parseInt(a[2]));
           p.setImage(a[3]);
           products.add(p);
       } 
        return products;
    }

    public List<product> getProductDetail(Integer id) {
        //TODO-get product detail

        return null;
    }

    public List<product> getProductByCategpry(Integer id) {
        //TODO-get product by category

        return null;
    }
    
}
