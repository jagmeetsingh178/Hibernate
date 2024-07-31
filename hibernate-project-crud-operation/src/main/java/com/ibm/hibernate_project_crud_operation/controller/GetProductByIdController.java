package com.ibm.hibernate_project_crud_operation.controller;

import com.ibm.hibernate_project_crud_operation.dao.ProductDao;
import com.ibm.hibernate_project_crud_operation.dto.Product;
import com.ibm.hibernate_project_crud_operation.service.ProductService;

@SuppressWarnings("unused")
public class GetProductByIdController {

	public static void main(String[] args) {
		
		//ProductDao dao = new ProductDao();
		
		ProductService service = new ProductService();
		
		Product product = service.getProductByIdService(103);
		if(product!=null)
		{
			System.out.println(product);
		}
		else {
			System.out.println("Given Id is Invalid");
		}
	}
}
