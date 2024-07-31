package com.ibm.hibernate_project_crud_operation.controller;

import com.ibm.hibernate_project_crud_operation.dao.ProductDao;
import com.ibm.hibernate_project_crud_operation.dto.Product;

public class UpdateProductNameByIdController {
	public static void main(String[] args) {
		
		ProductDao dao = new ProductDao();
		
		Product p = dao.updateProductNameByIdDao(101, "T-shirt");
		if(p!=null) {
			System.out.println("Data Is Updated");
		}
		else {
			System.out.println("Data Not updated");
		}
	}
}
