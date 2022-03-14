package com.hcl.productManagement.controller;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

import com.hcl.productManagement.config.JwtTokenUtil;
import com.hcl.productManagement.model.user;
import com.hcl.productManagement.service.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/user/")
 
public class userController {
    @Autowired
    userService sys;
    @Autowired
    systemService sysService;
    @Autowired
	private JwtTokenUtil jwtTokenUtil;
    @PostMapping("login")
    public user login(@RequestBody user user) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
       
        user u= sys.login(user);
        if(u!=null)
        {  
            System.out.println(u.getUserPW());
            if(bCryptPasswordEncoder.matches( user.getUserPW(),u.getUserPW()))
            {
                u.setToken(jwtTokenUtil.generateToken(Integer.toString(u.getIdUser())));
            }
            else
            {
                u=null;
            }
        }

        return u;
    }

    @PostMapping("registers")
    public user registers( @RequestPart("info") user user ,@RequestParam("file") MultipartFile file) {

        if(sys.checkUsername(user.getUserUn()))
        { 
            String uuid = UUID.randomUUID().toString();
            String filename = uuid+"."+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1);
            sysService.uploadFile(file,"product/"+filename);
            user.setImg(filename);
            BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
            user.setUserPW(bCryptPasswordEncoder.encode(user.getUserPW()));
            user.setToken(jwtTokenUtil.generateToken(Integer.toString(sys.create(user).getIdUser())));
            return user;

        }

        return null;
    }
}
