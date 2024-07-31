package com.ibm.hibernate_project_crud_operation.controller;

import java.time.LocalDate;

import com.ibm.hibernate_project_crud_operation.dao.ProductDao;
import com.ibm.hibernate_project_crud_operation.dto.Product;
import com.ibm.hibernate_project_crud_operation.service.ProductService;

public class InsertProductController {

	public static void main(String[] args) {
		//ProductDao dao = new ProductDao();
		ProductService  service = new ProductService();
		
		Product product = new Product(107, "T-Shirt", "blue", LocalDate.parse("2002-08-17"), LocalDate.parse("2020-08-17"));
		
		 Product product2 = service.saveProductService(product);
		 if(product2!=null)
		 {
			 System.out.println("Data Inserted Successfully");
		 }
		 else {
			 System.out.println("Data Not Insert");
		 }
	}
}
