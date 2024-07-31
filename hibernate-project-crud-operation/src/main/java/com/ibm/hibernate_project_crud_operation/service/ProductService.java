package com.ibm.hibernate_project_crud_operation.service;

import com.ibm.hibernate_project_crud_operation.dao.ProductDao;
import com.ibm.hibernate_project_crud_operation.dto.Product;

public class ProductService {

	ProductDao dao =  new ProductDao();
	
	public Product saveProductService(Product product) {
		
		int id = product.getId();
		String color = product.getColor();
		String name = product.getName();
		
		if((id>99 && id<1000)) {
			return dao.saveProductDao(product);
		}
		else {
			System.out.println("Please pass Color as Blue And Id with 3 Digits only");
			return null;
		}
			
	}
	
	public Product getProductByIdService(int id) {
		
		if(id>99 && id<1000) {
			return dao.getProductByIdDao(id);
		}
		else {
			System.out.println("Please Pass Id With 3 Digit Only ");
			return null;
		}
	}
	
	public boolean deleteProductByIdService(int id) {
		
		if(id>99 && id<1000) {
			return dao.deleteProductByIdDao(id);
		}
		else {
			System.out.println("Please Pass Id With 3 Digit Only ");
			return false;
		}
	}
}
