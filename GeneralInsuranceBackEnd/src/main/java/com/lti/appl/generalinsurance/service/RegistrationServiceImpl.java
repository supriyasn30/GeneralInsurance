package com.lti.appl.generalinsurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.appl.generalinsurance.beans.Registration;
import com.lti.appl.generalinsurance.dao.RegistrationDao;

@Service("regService")
public class RegistrationServiceImpl implements RegistrationService {
	
	@Autowired
	RegistrationDao dao;
	
	

	public RegistrationDao getDao() {
		return dao;
	}



	public void setDao(RegistrationDao dao) {
		this.dao = dao;
	}



	@Override
	public int add(Registration r) {
		System.out.println("Inside Service layer : Registration Method called");
		dao.add(r);
		return dao.add(r);
	}



	@Override
	public List<Registration> searchAll() {
		 List<Registration> regList= dao.searchAll();
		 return regList;
	}

}
