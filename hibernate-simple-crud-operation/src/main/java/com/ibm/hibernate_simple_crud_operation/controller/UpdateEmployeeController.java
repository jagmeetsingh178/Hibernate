package com.ibm.hibernate_simple_crud_operation.controller;

import com.ibm.hibernate_simple_crud_operation.dto.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateEmployeeController {

	public static void main(String[] args) {

		EntityManager em = Persistence.createEntityManagerFactory("hibernate-jakarta").createEntityManager();

		EntityTransaction et = em.getTransaction();

		Employee emp = em.find(Employee.class, 101);

		if (emp != null) {
			emp.setName("Akash");
			et.begin();
			em.merge(emp);
			et.commit();
		} else {
			
		}
	}
}
