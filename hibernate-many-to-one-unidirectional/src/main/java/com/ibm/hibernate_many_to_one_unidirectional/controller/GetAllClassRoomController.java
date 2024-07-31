package com.ibm.hibernate_many_to_one_unidirectional.controller;

import java.util.List;

import com.ibm.hibernate_many_to_one_unidirectional.dao.ClassRoomDao;
import com.ibm.hibernate_many_to_one_unidirectional.dto.ClassRoom;

public class GetAllClassRoomController {

	public static void main(String[] args) {
		
		ClassRoomDao dao = new ClassRoomDao();
		
		List<ClassRoom> classRooms = dao.getAllClassRoom();
		if(classRooms!=null) {
			for (ClassRoom classRoom : classRooms) {
				System.out.println(classRoom);
			}
		}
		else {
			System.out.println("ClassRoom Not Present");
		}
	}
}
