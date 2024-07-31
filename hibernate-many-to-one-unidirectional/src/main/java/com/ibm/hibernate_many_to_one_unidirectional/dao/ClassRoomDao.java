package com.ibm.hibernate_many_to_one_unidirectional.dao;

import java.util.List;

import com.ibm.hibernate_many_to_one_unidirectional.dto.ClassRoom;
import com.ibm.hibernate_many_to_one_unidirectional.dto.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ClassRoomDao {

	EntityManager em = Persistence.createEntityManagerFactory("hibernate-jakarta").createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public ClassRoom saveClassRoomDao(ClassRoom classRoom) {
		try {
			et.begin();
			em.persist(classRoom);
			et.commit();
			return classRoom;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public ClassRoom getClassRoomById(int id) {
		return em.find(ClassRoom.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<ClassRoom> getAllClassRoom(){
		try {
			return em.createQuery("FROM ClassRoom").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean deleteClassRoomByStudentId(int studentId) {
		Student student = em.find(Student.class, studentId);
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
}
