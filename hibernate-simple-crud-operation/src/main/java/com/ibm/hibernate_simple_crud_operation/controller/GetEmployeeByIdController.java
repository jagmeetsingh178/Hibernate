package com.ibm.hibernate_simple_crud_operation.controller;

import com.ibm.hibernate_simple_crud_operation.dto.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class GetEmployeeByIdController 
{
	public static void main(String[] args) {
		
		EntityManager em =Persistence.createEntityManagerFactory("hibernate-jakarta").createEntityManager();
		
		Employee emp = em.find(Employee.class, 101);
		
		if(emp!=null)
		{
			System.out.println(emp);
		}
		else {
			System.out.println("Not Data Fetch");
		}
	}
}
