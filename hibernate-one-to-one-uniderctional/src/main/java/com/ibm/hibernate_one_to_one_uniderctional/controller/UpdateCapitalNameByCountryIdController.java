package com.ibm.hibernate_one_to_one_uniderctional.controller;

import com.ibm.hibernate_one_to_one_uniderctional.dao.CountryCapitalDao;
import com.ibm.hibernate_one_to_one_uniderctional.dto.Country;

public class UpdateCapitalNameByCountryIdController {

		public static void main(String[] args) {
			
			CountryCapitalDao dao = new CountryCapitalDao();
		Country country	= dao.updateCapitalNameByCountryId(105, "Canada");
		if(country!=null) {
			System.out.println("Data Update Successfully");
		}
		else {
			System.out.println("Data Not Updated");
		}
		}
}
