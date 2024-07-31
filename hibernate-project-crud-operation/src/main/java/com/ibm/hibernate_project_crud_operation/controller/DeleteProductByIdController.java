package com.ibm.hibernate_project_crud_operation.controller;

import com.ibm.hibernate_project_crud_operation.dao.ProductDao;
import com.ibm.hibernate_project_crud_operation.service.ProductService;

@SuppressWarnings("unused")
public class DeleteProductByIdController 
{
	public static void main(String[] args) {
		//ProductDao dao = new ProductDao();
		ProductService service = new ProductService();
		
		 boolean p = service.deleteProductByIdService(107);
		 if(p==true) {
			 System.out.println("Data Deletd Successfully");
		 }
		 else {
			 System.out.println("Data Not Deleted Please check Id");
		 }
	}
}
