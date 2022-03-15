package com.hcl.admin.admin_management.rep;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.hcl.admin.admin_management.model.bill;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface billRep  extends JpaRepository<bill, Integer>  {
    List<bill> findBydateIgnoreCaseContaining(String Date);
}
