package com.hcl.admin.admin_management.service;


import java.util.ArrayList;
import java.util.List;

import com.hcl.admin.admin_management.model.admin;
import com.hcl.admin.admin_management.rep.adminRep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class adminService  implements UserDetailsService {
    @Autowired
    adminRep rep;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        admin u=rep.findByUn(username);
        if (u == null) {
             throw new UsernameNotFoundException("User not found with username: " + username);
        }
    
       return new org.springframework.security.core.userdetails.User(u.getUN(), u.getPW(),
       new ArrayList<>());
    }
    public admin login(admin user) {
        return rep.findByUn(user.getUN());
    }
    public admin create(admin user) {
        //TODO-create use
        return rep.save(user);
    }
    public boolean checkUsername(String un)
    {
      return rep.findByUn(un) == null ;
    }
}
