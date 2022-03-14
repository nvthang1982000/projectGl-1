

package com.hcl.productManagement.rep;

import com.hcl.productManagement.model.supplier;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository

public  interface supplierRep extends JpaRepository<supplier, Integer>  {
    
}
