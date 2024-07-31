package com.jsp.hibernate_many_to_man_uni_directional.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.jsp.hibernate_many_to_man_uni_directional.dao.StudentSubjectDao;
import com.jsp.hibernate_many_to_man_uni_directional.dto.Student;
import com.jsp.hibernate_many_to_man_uni_directional.dto.Subject;

public class SaveStudentSubjectController {

	public static void main(String[] args) throws IOException {
		StudentSubjectDao dao = new StudentSubjectDao();

		Subject subject = new Subject("Java", "shambhu-sir", 5000.5);
		Subject subject1 = new Subject("SQL", "Anmol-Sir", 5000.5);

		List<Subject> sub = new ArrayList<Subject>(Arrays.asList(subject, subject1));

		File file1 = new File("D:/virat1.jpg");

		InputStream image1 = new FileInputStream(file1);

		File file2 = new File("D:/akhtar.jpg");
		
		InputStream image2 = new FileInputStream(file2);
		
	//	System.out.println(image1.read());
			
		Student student = new Student("ManMohan", "manmohan@gmail.com", 555555, image1.readAllBytes(), null);
		Student student1 = new Student("Rohan", "rohan@gmail.com", 777777, image2.readAllBytes(), null);

		System.out.println(student.getPhone());
		
		List<Student> students = new ArrayList<Student>(Arrays.asList(student, student1));

		List<Student> lst = dao.saveStudentAndSubject(students,sub);

		

	}
}
