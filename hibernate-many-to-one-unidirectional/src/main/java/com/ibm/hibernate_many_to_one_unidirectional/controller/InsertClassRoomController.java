package com.ibm.hibernate_many_to_one_unidirectional.controller;

import com.ibm.hibernate_many_to_one_unidirectional.dao.ClassRoomDao;
import com.ibm.hibernate_many_to_one_unidirectional.dto.ClassRoom;

public class InsertClassRoomController {

	public static void main(String[] args) {
		ClassRoomDao dao = new ClassRoomDao();
		
		
		ClassRoom classRoom = new ClassRoom(102, 25, "1nd Floor", "Java-B");
		
		ClassRoom  classRoom2 = dao.saveClassRoomDao(classRoom);
		if(classRoom2!=null) {
			System.out.println("ClassRoom Insert Successfully");
		}
		else {
			System.out.println("ClassRoom Not Inserted");
		}
	}
}
