
package com.hcl.productManagement.service;

import com.hcl.productManagement.rep.userRep;
import com.hcl.productManagement.model.user;

import java.util.ArrayList;
import org.springframework.security.core.userdetails.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class userService implements UserDetailsService{
    @Autowired
    userRep rep;
    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        user u=rep.findById(Integer.parseInt(id)).get();
        if (u == null) {
             throw new UsernameNotFoundException("User not found with id: " + id);
        }
    
       return new org.springframework.security.core.userdetails.User(u.getUserUn(), u.getUserPW(),
       new ArrayList<>());
    }

    public boolean checkUsername(String email)
    {
      return rep.findByUn(email) == null ;
    }

    public user login(user user) {

        return rep.findByUn(user.getUserUn());
    }

    public user create(user user) {
        //TODO-create use
        return rep.save(user);
    }
}