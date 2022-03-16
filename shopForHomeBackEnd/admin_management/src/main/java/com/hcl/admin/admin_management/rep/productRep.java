package com.hcl.admin.admin_management.rep;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.persistence.NamedQuery;

import com.hcl.admin.admin_management.model.*;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
@NamedQuery(
    name ="product.getAllProduct",
    query = "select p.ID_pro, p.Pro_name, a.Price_af_dis, GROUP_CONCAT(m.Path) as images from product p join price a on p.ID_pro = a.ProductID_pro  join image m on p.ID_pro = m.ProductID_pro where sysdate() between a.Start_date and a.End_Date group by ID_pro"
)
public interface productRep extends JpaRepository<product, Integer>  {

    List<String []> getAllProduct();
    
}
