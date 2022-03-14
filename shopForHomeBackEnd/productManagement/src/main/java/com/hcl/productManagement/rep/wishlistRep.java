

package com.hcl.productManagement.rep;

import com.hcl.productManagement.model.wishlist;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository

public  interface wishlistRep extends JpaRepository<wishlist, Integer>  {
    
}
