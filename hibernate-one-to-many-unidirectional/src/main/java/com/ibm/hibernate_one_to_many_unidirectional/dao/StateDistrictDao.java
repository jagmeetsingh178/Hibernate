package com.ibm.hibernate_one_to_many_unidirectional.dao;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import com.ibm.hibernate_one_to_many_unidirectional.dto.*;
public class StateDistrictDao {

	EntityManager em = Persistence.createEntityManagerFactory("hibernate-jakarta").createEntityManager();

	EntityTransaction et = em.getTransaction();

	public State saveStateDistrictDao(State state, List<District> districts) {

		try {
			et.begin();
			for (District district : districts) {
				em.persist(district);
			}
			em.persist(state);
			et.commit();
			return state;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public State getStateAndDistrictByStateIdDao(int id) {
		return em.find(State.class, id);
	}

	public boolean deleteDistrictByIdDao(int id) {

		District district = em.find(District.class, id);
		if (district != null) {
			
			/*This Line of code will delete third table row data*/
			
			String DELETEDISTRICT = "delete from state_district where districts_id=?1";
			Query query = em.createNativeQuery(DELETEDISTRICT);
			query.setParameter(1, id);
			et.begin();
			query.executeUpdate();	
			em.remove(district);
			et.commit();
			return true;
		} else {
			return false;
		}
	}
	
	public State updateStateNameByIddao(int id,String name) {
		State state  = getStateAndDistrictByStateIdDao(id);
		try {
			state.setName(name);
			et.begin();
			em.merge(state);
			et.commit();
			return state;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<State> getAllStateDistrict(){
		
		try {
			return em.createQuery("FROM State").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
}
