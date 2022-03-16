package com.hcl.admin.admin_management.controller;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;

import com.hcl.admin.admin_management.config.JwtTokenUtil;
import com.hcl.admin.admin_management.model.*;
import com.hcl.admin.admin_management.service.adminService;
import com.hcl.admin.admin_management.service.csvfileService;
import com.hcl.admin.admin_management.service.systemService;
import com.mashape.unirest.http.exceptions.UnirestException;

import org.springframework.web.multipart.MultipartFile;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/admin/")
public class adminController {
    @Autowired
    adminService sys;
    @Autowired
    systemService sysService;
    @Autowired
	private JwtTokenUtil jwtTokenUtil;
    @Autowired
    csvfileService csv;
    @PostMapping("login")
    public admin login(@RequestBody admin user) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        System.out.println(bCryptPasswordEncoder.encode("admin")); 
        admin u= sys.login(user);
        if(u!=null)
        {  
            System.out.println(u.getPW());
             if(bCryptPasswordEncoder.matches( user.getPW(),u.getPW()))
            // if(true)
            {
                u.setToken(jwtTokenUtil.generateToken(u.getUN()));
            }
            else
            {
                u=null;
            }
        }
        u.setPW(null);//hide pass before return
        u.setID_ad(0);
        return u;
    }

    @PostMapping("auth/create")
    public admin registers( @RequestBody admin user) {

        if(sys.checkUsername(user.getUN()))
        { 
            // String uuid = UUID.randomUUID().toString();
            // String filename = uuid+"."+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1);
            // sysService.uploadFile(file,"admin/"+filename);
            // user.setimg(filename);
            BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
            user.setPW(bCryptPasswordEncoder.encode(user.getPW()));
            user.setToken(jwtTokenUtil.generateToken(Integer.toString(sys.create(user).getID_ad())));
            sys.create(user);
            return user;

        }

        return null;
    }

    @PostMapping("auth/cvs")
    public void cvs(@RequestParam("file") MultipartFile file) throws IOException {

        if(csv.hasCSVFormat(file))
        {
            csv.csvToTutorials(file.getInputStream());
        }
        else
        {
            System.out.println("sai định dạng");
        }
    }

   
    @PostMapping("auth/mail")
    public void mail(@RequestParam("contain") String text,@RequestParam("subject") String subject,@RequestParam("contain")String [] mails)
    {
        for (String mail : mails) {
            try {
                sysService.sendmail(mail, subject, text);
            } catch (UnirestException e) {
                e.printStackTrace();
            }
        }
    }
    @GetMapping("auth/report")
    public ResponseEntity<Resource> getReport(@RequestParam("date") String date)
    {
       

        ByteArrayInputStream in =  sysService.tutorialsToCSV(sysService.getBillBydate(date));
        InputStreamResource file = new InputStreamResource(in);
   
       return ResponseEntity.ok()
       .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + "report.csv")
       .contentType(MediaType.parseMediaType("application/csv"))
       .body(file);
    }




    
}
