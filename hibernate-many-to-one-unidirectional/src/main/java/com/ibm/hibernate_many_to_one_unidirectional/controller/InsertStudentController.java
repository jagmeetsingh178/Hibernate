package com.ibm.hibernate_many_to_one_unidirectional.controller;

import com.ibm.hibernate_many_to_one_unidirectional.dao.StudentDao;
import com.ibm.hibernate_many_to_one_unidirectional.dto.Student;

public class InsertStudentController {

	public static void main(String[] args) {
		
		StudentDao dao = new StudentDao();
		
		Student  student = new Student("Jot", "jot@gmail.com", 7082811896l);
		
		Student student2 = dao.saveStudentDao(student, 102);
		if(student2!=null) {
			System.out.println("Student Insert Successfully");
		}
		else {
			System.out.println("Student Not Inserted");
		}
	}
}
