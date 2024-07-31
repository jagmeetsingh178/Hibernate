package com.ibm.hibernate_one_to_one_uniderctional.controller;

import java.util.List;

import com.ibm.hibernate_one_to_one_uniderctional.dao.CountryCapitalDao;
import com.ibm.hibernate_one_to_one_uniderctional.dto.Country;

public class DisplayAllCountryCapitalController {

	public static void main(String[] args) {
		CountryCapitalDao dao = new CountryCapitalDao();
		
		 List<Country> countries = dao.getAllCountryAndAllCapitalDao();
		 if(countries!=null) {
			for (Country country : countries) {
				 System.out.println(country);
			}
		 }
		 else {
			 System.out.println("Data Not Present");
		 }
	}
}
