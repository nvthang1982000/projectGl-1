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


}
