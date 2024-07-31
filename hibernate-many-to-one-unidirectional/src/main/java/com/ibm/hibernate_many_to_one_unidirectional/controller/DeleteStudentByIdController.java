package com.ibm.hibernate_many_to_one_unidirectional.controller;

import com.ibm.hibernate_many_to_one_unidirectional.dao.StudentDao;

public class DeleteStudentByIdController {

	public static void main(String[] args) {
		
		StudentDao dao = new StudentDao();
		
		boolean id = dao.deleteStudentByIdDao(3);
		if(id==true) {
			System.out.println("Student Delete Successfully");
		}
		else {
			System.out.println("Student Not Delete Please Check Student Id");
		}
	}
}
