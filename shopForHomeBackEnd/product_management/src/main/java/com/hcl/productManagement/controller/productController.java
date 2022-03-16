package com.hcl.productManagement.controller;

import java.util.List;

import com.hcl.productManagement.model.product;
import com.hcl.productManagement.service.productService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product/")
public class productController {
  
    @Autowired
    productService productService;

    @GetMapping("getAllProduct")
    public List<product> getallp() {
        
        return productService.getAllproduct();
    }
    @GetMapping("product/{id}")
    public List<product> productDetail(@PathVariable("id") Integer  id) {
        
        return productService.getProductDetail(id);
    }

    @GetMapping("product/category/{id}")
    public List<product> productByCategory(@PathVariable("id") Integer  id) {
        
        return productService.getProductByCategpry(id);
    }
    

}
