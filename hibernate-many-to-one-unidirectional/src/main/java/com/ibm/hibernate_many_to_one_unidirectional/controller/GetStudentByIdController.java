package com.ibm.hibernate_many_to_one_unidirectional.controller;

import com.ibm.hibernate_many_to_one_unidirectional.dao.StudentDao;
import com.ibm.hibernate_many_to_one_unidirectional.dto.Student;

public class GetStudentByIdController {

	public static void main(String[] args) {
		
		StudentDao dao = new StudentDao();
		
		Student student = dao.getStudentByIdDao(2);
		if(student!=null) {
			System.out.println(student);
		}
		else {
			System.out.println("Given Id is InValid");
		}
	}
}
