package com.hcl.productManagement.rep;

import com.hcl.productManagement.model.product;

import org.springframework.data.jpa.repository.JpaRepository;

public  interface productRep extends JpaRepository<product, Integer>  {
    
}
