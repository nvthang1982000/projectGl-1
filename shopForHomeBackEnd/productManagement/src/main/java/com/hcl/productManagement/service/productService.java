package com.hcl.productManagement.service;

import com.hcl.productManagement.rep.productRep;
import com.hcl.productManagement.model.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productService {
    @Autowired
    productRep rep;

    public List<product> getAllproduct()
    {
        //TODO-get all product
            return null;
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
