package com.hcl.productManagement.service;

import com.hcl.productManagement.rep.categoryRep;
import com.hcl.productManagement.rep.productRep;
import com.hcl.productManagement.model.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class categoryService {
    @Autowired
    categoryRep rep;

    public List<category> getAllcategory()
    {
      return rep.findAll();
    }

  
    
}
