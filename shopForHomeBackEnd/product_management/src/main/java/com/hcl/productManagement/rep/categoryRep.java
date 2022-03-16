package com.hcl.productManagement.rep;

import java.util.List;

import com.hcl.productManagement.model.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository

public  interface categoryRep extends JpaRepository<category, Integer>  {

}