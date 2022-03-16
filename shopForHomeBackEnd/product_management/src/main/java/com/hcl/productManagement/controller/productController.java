package com.hcl.productManagement.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.hcl.productManagement.model.product;
import com.hcl.productManagement.service.productService;
import com.hcl.productManagement.service.systemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/product/")
public class productController {
  
    @Autowired
    productService productService;

    @Autowired
    systemService sys;
    
    @GetMapping("getAllProduct")
    public List<product> getallp() {
        
        return productService.getAllproduct();
    }

    @GetMapping("delete/{id}")
    public void deletep(@PathVariable("id") int  id) {
        productService.delete(id);
       
    }
    @GetMapping("product/{id}")
    public product productDetail(@PathVariable("id") int  id) {
        
        return productService.getProductDetail(id);
    }


    @PostMapping("product/update/{id}")
    public void update(@PathVariable("id") int id,@RequestPart("info") product product  ) {
        
         productService.update(id,product);
    }

    @GetMapping("product/category/{id}")
    public List<product> productByCategory(@PathVariable("id") Integer  id) {
        
        return productService.getProductByCategpry(id);
    }
    @GetMapping("search")
    public List<product> productDetail(@RequestParam("key")  String key) {
        System.out.println(key+"ssssssssssssss");
        return sys.SearchProduct(key);
    }

    @PostMapping("auth/create")
    public product productCreate(@RequestPart("info") product product ,@RequestParam("file") MultipartFile[] file) {

        String uuid = UUID.randomUUID().toString();
        ArrayList<String> image=new ArrayList<String>();
        for(int i=0;i<file.length;i++)
        {
            String filename = uuid+"."+file[i].getOriginalFilename().substring(file[i].getOriginalFilename().lastIndexOf(".") + 1);
            sys.uploadFile(file[i],"product/"+filename);
            image.add(filename);
        }
        
        product.setImage(String.join(",", image));
        productService.create(product);
        return product;
    }

}
