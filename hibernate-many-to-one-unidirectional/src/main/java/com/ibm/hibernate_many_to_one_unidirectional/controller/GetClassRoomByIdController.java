package com.ibm.hibernate_many_to_one_unidirectional.controller;

import com.ibm.hibernate_many_to_one_unidirectional.dao.ClassRoomDao;
import com.ibm.hibernate_many_to_one_unidirectional.dto.ClassRoom;

public class GetClassRoomByIdController {

	public static void main(String[] args) {
		
		ClassRoomDao dao = new ClassRoomDao();
		
		ClassRoom classRoom = dao.getClassRoomById(101);
		if(classRoom!=null) {
			System.out.println(classRoom);
		}
		else {
			System.out.println("Given id is Invalid");
		}
	}
}
