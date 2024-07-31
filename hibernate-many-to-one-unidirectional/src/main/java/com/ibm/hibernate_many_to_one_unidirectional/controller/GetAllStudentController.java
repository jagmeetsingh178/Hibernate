package com.ibm.hibernate_many_to_one_unidirectional.controller;

import java.util.List;

import com.ibm.hibernate_many_to_one_unidirectional.dao.StudentDao;
import com.ibm.hibernate_many_to_one_unidirectional.dto.Student;

public class GetAllStudentController {

	public static void main(String[] args) {
		StudentDao dao = new StudentDao();
		
		List<Student> list = dao.getAllStudentDao();
		if(list!=null) {
			for (Student student : list) {
				System.out.println(student);
			}
		}
		else {
			System.out.println("Students Not Present");
		}
	}
}
