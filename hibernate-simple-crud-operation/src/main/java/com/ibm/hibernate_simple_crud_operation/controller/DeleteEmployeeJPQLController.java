package com.ibm.hibernate_simple_crud_operation.controller;

import com.mysql.cj.Query;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleteEmployeeJPQLController {

		public static void main(String[] args) {
			EntityManager em = Persistence.createEntityManagerFactory("hibernate-jakarta").createEntityManager();
			EntityTransaction et = em.getTransaction();
			
			String deleteQuery = "delete Employee e where e.id=?1";
			
			jakarta.persistence.Query query = em.createQuery(deleteQuery);
			
			query.setParameter(1, 102);
			
			et.begin();
			
			int a = query.executeUpdate();
			if(a!=0) {
				et.commit();
				System.out.println("Data Deleted Successfully");
			}
			else {
				System.out.println("Given id is Not valid");
			}
		}
}
