package com.ibm.hibernate_simple_crud_operation.controller;

import java.time.LocalDate;

import com.ibm.hibernate_simple_crud_operation.dto.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmployeeInsertController {
	public static void main(String[] args) {
		
		EntityManager em = Persistence.createEntityManagerFactory("hibernate-jakarta").createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employee emp = new Employee(104, "Manish", "manish@gmail.com", 789456, 500000, LocalDate.parse("2003-08-17"), LocalDate.parse("2020-08-15"));
		
		try {
			et.begin();
			em.persist(emp);
			et.commit();
			System.out.println("Data Will be Inserted Successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Data will be be not Insert");
		}
	}
}
