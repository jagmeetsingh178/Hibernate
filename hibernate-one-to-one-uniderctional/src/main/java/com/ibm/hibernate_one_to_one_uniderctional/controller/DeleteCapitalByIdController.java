package com.ibm.hibernate_one_to_one_uniderctional.controller;

import com.ibm.hibernate_one_to_one_uniderctional.dao.CountryCapitalDao;

public class DeleteCapitalByIdController {
	public static void main(String[] args) {

		CountryCapitalDao dao = new CountryCapitalDao();

		boolean id = dao.deleteCapitalById(4,104);
		if (id == true) {
			// System.out.println(id);
			System.out.println("Data Deleted Successfully");
		} else {
			System.out.println("Given Id is InValid");
		}
	}
}
