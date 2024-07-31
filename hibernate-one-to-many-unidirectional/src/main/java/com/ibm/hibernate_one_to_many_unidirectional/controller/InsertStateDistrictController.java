package com.ibm.hibernate_one_to_many_unidirectional.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ibm.hibernate_one_to_many_unidirectional.dao.StateDistrictDao;
import com.ibm.hibernate_one_to_many_unidirectional.dto.District;
import com.ibm.hibernate_one_to_many_unidirectional.dto.State;

public class InsertStateDistrictController {

	public static void main(String[] args) {
		StateDistrictDao dao = new StateDistrictDao();
		
		District district = new District(105, "Manali", 987458, LocalDate.now());
		
		District district2 = new District(106, "Rohtang", 123525, LocalDate.parse("2018-09-09"));
		
		List<District> districts = new ArrayList<District>(Arrays.asList(district,district2));
		
		State state = new State(115, "Himachal Pradesh", "XYZ", 35, districts);
		
		dao.saveStateDistrictDao(state, districts);
	}
}
