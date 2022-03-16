package com.hcl.productManagement.service;

import com.hcl.productManagement.rep.*;
import com.hcl.productManagement.model.product;
import com.hcl.productManagement.model.wishlist;

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

    @Autowired
    wishlistRep wishrep;
    systemService() {

        this.rootLocation = Paths.get("src\\main\\resources\\upload");

    }

    private final Path rootLocation;
    public List<product> SearchProduct(String key)
    {
        //TODO-get search réuit
            return null;
    }

    public void addWishList(String idUser,int productId) {
        wishlist wl=new wishlist();
        wl.setProductID_pro(productId);
        wl.setUserid(Integer.parseInt(idUser));
        wishrep.save(wl);
        //TODO-add to wish list

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
