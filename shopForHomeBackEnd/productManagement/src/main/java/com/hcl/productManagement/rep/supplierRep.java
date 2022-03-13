

package com.hcl.productManagement.rep;

import com.hcl.productManagement.model.supplier;

import org.springframework.data.jpa.repository.JpaRepository;

public  interface supplierRep extends JpaRepository<supplier, Integer>  {
    
}
