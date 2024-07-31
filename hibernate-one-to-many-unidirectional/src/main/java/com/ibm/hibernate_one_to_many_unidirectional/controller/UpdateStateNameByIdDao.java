package com.ibm.hibernate_one_to_many_unidirectional.controller;

import com.ibm.hibernate_one_to_many_unidirectional.dao.StateDistrictDao;
import com.ibm.hibernate_one_to_many_unidirectional.dto.State;

public class UpdateStateNameByIdDao {

	public static void main(String[] args) {
		
		StateDistrictDao dao = new StateDistrictDao();
		
		State state = dao.updateStateNameByIddao(114, "Haryana");
		if(state!=null) {
			System.out.println("Data Updated Successfully");
		}
		else {
			System.out.println("Data Not Updated");
		}
	}
}
