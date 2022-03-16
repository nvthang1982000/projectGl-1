package com.hcl.productManagement.rep;

import com.hcl.productManagement.model.admin;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository

public  interface adminRep extends JpaRepository<admin, Integer>  {
    public admin findByUnAndPw(String user, String pass);
    public admin findByUn( String username);
    
}
