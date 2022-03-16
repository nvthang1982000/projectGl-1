

package com.hcl.productManagement.rep;

import com.hcl.productManagement.model.price;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository

public  interface priceRep extends JpaRepository<price, Integer>  {
    
}
