package com.jsp.hibernate_many_to_man_uni_directional.dao;

import java.util.List;

import com.jsp.hibernate_many_to_man_uni_directional.dto.Student;
import com.jsp.hibernate_many_to_man_uni_directional.dto.Subject;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentSubjectDao {
	
	EntityManager em=Persistence.createEntityManagerFactory("hibernate").createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public List<Student> saveStudentAndSubject(List<Student> list,List<Subject> subjects) {
		try {
			et.begin();
			for (Student student2 : list) {
				student2.setSubjects(subjects);
				em.persist(student2);
				
			}
			et.commit();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
//	public List<Student2> saveStudentOnly(List<Student2> list,Subject2 subject2) {
//		int id=subject2.getId();
//		em.find(Subject2.class, id);
//	}
	
//	public List<Student2> saveStudentOnly(List<Student2> list,List<Subject2> subject2) {
//		for (Subject2 subject22 : subject2) {
//			int id=subject22.getId();
//			em.find(Subject2.class, id);
//			
//		}
//	}

}
