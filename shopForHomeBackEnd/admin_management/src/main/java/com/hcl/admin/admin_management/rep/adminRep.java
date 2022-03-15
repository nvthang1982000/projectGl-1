package com.hcl.admin.admin_management.rep;

import org.springframework.stereotype.Repository;

import com.hcl.admin.admin_management.model.admin;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface adminRep  extends JpaRepository<admin, Integer>  {
    public admin findByUn( String username);
}
