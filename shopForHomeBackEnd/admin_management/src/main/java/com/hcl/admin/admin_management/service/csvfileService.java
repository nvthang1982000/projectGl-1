package com.hcl.admin.admin_management.service;

import java.util.ArrayList;
import java.util.List;

import com.hcl.admin.admin_management.model.*;
import com.hcl.admin.admin_management.rep.productRep;

import org.apache.commons.csv.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.*;
@Service
public class csvfileService{
    @Autowired
    productRep rep;
  
    public static String TYPE = "text/csv";
    static String[] HEADERs = { "Pro_name", "Left_Quantity", "Price", "Flag", "SupplierID", };
    public boolean hasCSVFormat(MultipartFile file) {
      if (!TYPE.equals(file.getContentType())) {
        return false;
      }
      return true;
    }



    
  public List<product> csvToTutorials(InputStream is) {
    try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        CSVParser csvParser = new CSVParser(fileReader,
            CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {

      List<product> products = new ArrayList<product>();

      Iterable<CSVRecord> csvRecords = csvParser.getRecords();

      for (CSVRecord csvRecord : csvRecords) {
        product a = new product();
        a.setPro_name(csvRecord.get("Pro_name"));
        a.setLeft_Quantity(Integer.parseInt(csvRecord.get("Left_Quantity")) );
        a.setPrice(Integer.parseInt(csvRecord.get("Price")));
        a.setSupplierID(csvRecord.get("SupplierID"));
        a.setFlag(csvRecord.get("Flag"));
        products.add(a);
      }
      rep.saveAll(products);
      return products;
    } catch (IOException e) {
      throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
    }
  }


}