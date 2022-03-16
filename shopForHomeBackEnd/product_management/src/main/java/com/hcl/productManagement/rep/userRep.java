package com.hcl.productManagement.rep;

import com.hcl.productManagement.model.user;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository

public  interface userRep extends JpaRepository<user, Integer>  {
    public user findByUnAndPw(String user, String pass);
    public user findByUn( String username);
    
}
