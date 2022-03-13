

package com.hcl.productManagement.rep;

import com.hcl.productManagement.model.wishlist;

import org.springframework.data.jpa.repository.JpaRepository;

public  interface wishlistRep extends JpaRepository<wishlist, Integer>  {
    
}
