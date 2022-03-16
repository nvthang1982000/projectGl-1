package com.hcl.productManagement.service;

import com.hcl.productManagement.rep.*;
import com.hcl.productManagement.model.product;
import com.hcl.productManagement.model.wishlist;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.nio.file.*;
@Service
public class systemService {
    @Autowired
    productRep rep;

  
    systemService() {

        this.rootLocation = Paths.get("src\\main\\resources\\upload");

    }

    private final Path rootLocation;
    public List<product> SearchProduct(String key)
    {
        List<product> products =new ArrayList<product>();
        //TO-get product detail
       for (String[] a : rep.search(key)) {
           product p=new product();
           p.setID_pro(Integer.parseInt(a[0]));
           p.setPro_name(a[1]);
           p.setPrice(Integer.parseInt(a[2]));
           p.setImage(a[3]);
           p.setLeft_Quantity(Integer.parseInt(a[4]));

           products.add(p);
       } 
        return products;
    }


    
    public String uploadFile(MultipartFile file,String filename) {
        try {
            if (file.isEmpty()) {
                System.out.println("File is nulll");
            }
            
            try (InputStream inputStream = file.getInputStream()) {
               
                Files.copy(file.getInputStream(), this.rootLocation.resolve(filename),
                StandardCopyOption.REPLACE_EXISTING); 
                System.out.println("ok");
                        return "ok";
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("error");
        }
        return null;
    }

}
