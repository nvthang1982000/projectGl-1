package com.hcl.productManagement.controller;
import java.util.List;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

import com.hcl.productManagement.config.JwtTokenUtil;
import com.hcl.productManagement.model.*;
import com.hcl.productManagement.service.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/category/")
public class categoryController {
 
    @Autowired
    categoryService cateService;

    @GetMapping("getAll")
    public List<category> getAll()
    {
        return cateService.getAllcategory();
    }
}
