
package com.hcl.productManagement.service;

import com.hcl.productManagement.model.admin;
import com.hcl.productManagement.rep.adminRep;

import java.util.ArrayList;
import org.springframework.security.core.userdetails.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class userService implements UserDetailsService{
    @Autowired
    adminRep rep;
    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        admin u=rep.findById(Integer.parseInt(id)).get();
        if (u == null) {
             throw new UsernameNotFoundException("User not found with id: " + id);
        }
    
       return new org.springframework.security.core.userdetails.User(u.getUN(), u.getPW(),
       new ArrayList<>());
    }

    public boolean checkUsername(String email)
    {
      return rep.findByUn(email) == null ;
    }
    
   
}