package com.ibm.hibernate_one_to_many_unidirectional.controller;

import java.util.List;

import com.ibm.hibernate_one_to_many_unidirectional.dao.StateDistrictDao;
import com.ibm.hibernate_one_to_many_unidirectional.dto.State;

public class GetAllStateDistrictController {

	public static void main(String[] args) {
		
		StateDistrictDao dao = new StateDistrictDao();
		
		 List<State> states  = dao.getAllStateDistrict();
		 if(states!=null) {
			 for (State state : states) {
				System.out.println(state);
			}
		 }
		 else {
			 System.out.println("Data Not Found");
		 }
	}
}
