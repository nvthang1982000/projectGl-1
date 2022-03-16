package com.hcl.productManagement.rep;

import java.util.List;

import com.hcl.productManagement.model.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository

public  interface productRep extends JpaRepository<product, Integer>  {
    
   List<String []> getAllProduct();
   List<String []> getProductDetail(@Param("param") int id);
   List<String []> search(@Param("key") String key);

}
