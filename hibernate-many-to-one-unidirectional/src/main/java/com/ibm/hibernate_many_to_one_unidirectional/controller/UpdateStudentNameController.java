package com.ibm.hibernate_many_to_one_unidirectional.controller;

import com.ibm.hibernate_many_to_one_unidirectional.dao.StudentDao;
import com.ibm.hibernate_many_to_one_unidirectional.dto.Student;

public class UpdateStudentNameController {

	public static void main(String[] args) {
		
		StudentDao dao = new StudentDao();
		
		Student student = dao.updateStudentNameByStudentIdDao(1, "Manish");
		if(student!=null) {
			System.out.println("Data Updated Successfully");
		}
		else {
			System.out.println("Data Not Updated");
		}
	}
}
