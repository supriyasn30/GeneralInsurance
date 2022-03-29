package com.lti.appl.generalinsurance.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.appl.generalinsurance.beans.Registration;
@Repository
public class RegistrationDaoImpl implements RegistrationDao{
	
	@PersistenceContext
	private EntityManager em;

	
	@Override
	@Transactional
	public int add(Registration r) {
		
System.out.println("Inside dao layer");
		
		em.persist(r);
		
		return r.getRegID();
	}


	@Override
	public List<Registration> searchAll() {
		Query qry = em.createQuery("Select r from Registration r");
		List<Registration> regList = qry.getResultList();
		return regList;
	}
	

}
