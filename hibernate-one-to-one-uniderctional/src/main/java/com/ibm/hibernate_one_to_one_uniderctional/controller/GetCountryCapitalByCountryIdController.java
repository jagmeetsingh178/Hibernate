 package com.ibm.hibernate_one_to_one_uniderctional.controller;

import com.ibm.hibernate_one_to_one_uniderctional.dao.CountryCapitalDao;
import com.ibm.hibernate_one_to_one_uniderctional.dto.Country;

public class GetCountryCapitalByCountryIdController {

	public static void main(String[] args) {
		CountryCapitalDao dao = new CountryCapitalDao();
				
				Country country = dao.getCountryCapitalByCountryId(101);
				if(country!=null) {
					System.out.println(country);
				}
				else {
					System.out.println("Given id is InValid");
				}
	}
}
