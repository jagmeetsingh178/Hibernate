package com.ibm.hibernate_one_to_one_uniderctional.controller;

import com.ibm.hibernate_one_to_one_uniderctional.dao.CountryCapitalDao;
import com.ibm.hibernate_one_to_one_uniderctional.dto.Capital;
import com.ibm.hibernate_one_to_one_uniderctional.dto.Country;

public class InsertCountryCapitalController
{
		public static void main(String[] args) {
			
			CountryCapitalDao dao = new CountryCapitalDao();
			
			Capital capital = new Capital(5, "India", 1600000, 2);
			Country country = new Country(105, "Singalpure", 40000000, 23, capital);
			
			Country country2 = dao.saveCountryCapital(country, capital);		
			if(country!=null) {
				System.out.println("Insert Data Successfully");
			}
			else {
				System.out.println("Data Not Inserted");
			}
		}
}
