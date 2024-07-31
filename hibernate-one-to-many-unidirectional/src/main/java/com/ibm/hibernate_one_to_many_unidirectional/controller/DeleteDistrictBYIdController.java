package com.ibm.hibernate_one_to_many_unidirectional.controller;

import com.ibm.hibernate_one_to_many_unidirectional.dao.StateDistrictDao;
import com.ibm.hibernate_one_to_many_unidirectional.dto.District;

@SuppressWarnings("unused")
public class DeleteDistrictBYIdController {

	public static void main(String[] args) {
		StateDistrictDao dao = new StateDistrictDao();
		
		boolean id = dao.deleteDistrictByIdDao(101);
		if(id==true) {
			System.out.println("Data Delete Successfully");
		}
		else {
			System.out.println("Data Not Delete");
		}
	}
}
