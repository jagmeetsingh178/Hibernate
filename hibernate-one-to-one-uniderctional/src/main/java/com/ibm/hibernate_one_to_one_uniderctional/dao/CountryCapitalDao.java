package com.ibm.hibernate_one_to_one_uniderctional.dao;

import java.util.List;

import com.ibm.hibernate_one_to_one_uniderctional.dto.Capital;
import com.ibm.hibernate_one_to_one_uniderctional.dto.Country;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CountryCapitalDao {
	EntityManager em = Persistence.createEntityManagerFactory("hibernate-jakarta").createEntityManager();
	EntityTransaction et = em.getTransaction();

	public Country saveCountryCapital(Country c, Capital c1) {

		try {

			et.begin();
			em.persist(c1);
			// c.setCapital(c1); //it will Pass to Setter Method
			em.persist(c);
			et.commit();

			return c;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Country getCountryCapitalByCountryId(int id) {

		try {
			Country country = em.find(Country.class, id);
			return country;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public boolean deleteCountryById(int id) 
	{
		Country country = getCountryCapitalByCountryId(id);
		if(country!=null) {
			try {
				et.begin();
				em.remove(country);
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
	
	public boolean deleteCapitalById(int id,int countryid) {
		
		Capital  capital = em.find(Capital.class, id);
		Country  country = em.find(Country.class, countryid);
		if(capital!=null) {
			try {
				country.setCapital(null);
				et.begin();
				em.merge(country);
				em.remove(capital);
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
	
	@SuppressWarnings("unchecked")
	public List<Country> getAllCountryAndAllCapitalDao(){
		
		try {
			return em.createQuery("FROM Country").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@SuppressWarnings("unused")
	public Country updateCapitalNameByCountryId(int countryid,String name) {
		
		Country country = getCountryCapitalByCountryId(countryid);
		Capital capital = country.getCapital();
		if(country!=null) {
			try {
				
				capital.setName(name);
				et.begin();
				em.merge(capital);
				et.commit();
				return country;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		else {
			return null;
		}
	}
}

















