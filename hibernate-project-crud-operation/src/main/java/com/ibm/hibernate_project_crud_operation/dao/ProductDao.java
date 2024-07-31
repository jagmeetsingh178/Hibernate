package com.ibm.hibernate_project_crud_operation.dao;

import java.util.List;

import com.ibm.hibernate_project_crud_operation.dto.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ProductDao {

	EntityManager em =Persistence.createEntityManagerFactory("hibernate-jakarta").createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public Product saveProductDao(Product product) {
		
		try {
			
			et.begin();
			em.persist(product);
			et.commit();
			return product;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Product getProductByIdDao(int productId)
	{
		try {
			
			Product product = em.find(Product.class, productId);
			return product;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean deleteProductByIdDao(int id) 
	{
		Product p = getProductByIdDao(id);
		if(p!=null) {
			try {
				et.begin();
				em.remove(p);
				et.commit();
				return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public Product updateProductNameByIdDao(int id, String name) 
	{
		Product p = getProductByIdDao(id);
		if(p!=null) {
			try {
				p.setName(name);
				et.begin();
				em.merge(p);
				et.commit();
				return p;
			}
			catch(Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		else {
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Product> getAllProductDao()
	{
		return em.createQuery("from Product").getResultList();
		//return em.createNativeQuery("select * from product",Product.class).getResultList();
	}
	
}
