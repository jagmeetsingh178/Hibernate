package com.ibm.hibernate_many_to_one_unidirectional.dao;

import java.util.List;

import com.ibm.hibernate_many_to_one_unidirectional.dto.ClassRoom;
import com.ibm.hibernate_many_to_one_unidirectional.dto.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentDao {

	EntityManager em = Persistence.createEntityManagerFactory("hibernate-jakarta").createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public Student saveStudentDao(Student student, int classRoomId) {
		ClassRoom classRoom = em.find(ClassRoom.class, classRoomId);
		try {
			student.setClassRoom(classRoom);
			et.begin();
			em.persist(student);
			et.commit();
			return student;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Student getStudentByIdDao(int studentId) {
		return em.find(Student.class, studentId);
	}
	
	public boolean deleteStudentByIdDao(int studentId) {
		
		Student student = getStudentByIdDao(studentId);
		try {
			et.begin();
			em.remove(student);
			et.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Student updateStudentNameByStudentIdDao(int id, String name) {
		Student  student  = getStudentByIdDao(id);
		try {
			student.setName(name);
			et.begin();
			em.merge(student);
			et.commit();
			return student;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Student> getAllStudentDao(){
		
		try {
			return em.createQuery("FROM Student").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
