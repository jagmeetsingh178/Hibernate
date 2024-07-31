package com.ibm.hibernate_project_crud_operation.controller;

import java.util.List;

import com.ibm.hibernate_project_crud_operation.dao.ProductDao;
import com.ibm.hibernate_project_crud_operation.dto.Product;

public class DisplayAllProductController {
	public static void main(String[] args) {
		
		ProductDao dao = new ProductDao();
		
		 List<Product> products = dao.getAllProductDao();

		 for (Product product : products) {
				System.out.println(product);
			}
	}
}
