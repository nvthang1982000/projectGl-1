package com.hcl.admin.admin_management.rep;
import org.springframework.stereotype.Repository;

import com.hcl.admin.admin_management.model.*;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface productRep extends JpaRepository<product, Integer>  {
    
}
