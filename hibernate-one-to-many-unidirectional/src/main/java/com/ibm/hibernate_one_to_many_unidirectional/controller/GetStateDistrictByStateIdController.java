package com.ibm.hibernate_one_to_many_unidirectional.controller;

import com.ibm.hibernate_one_to_many_unidirectional.dao.StateDistrictDao;
import com.ibm.hibernate_one_to_many_unidirectional.dto.State;

public class GetStateDistrictByStateIdController {

	public static void main(String[] args) {
		
		StateDistrictDao dao = new StateDistrictDao();
		
		
		State state	= dao.getStateAndDistrictByStateIdDao(113);
		if(state!=null) {
			System.out.println(state);
		}
		else {
			System.out.println("Data Not Display Please Check Id");
		}
	}
}
