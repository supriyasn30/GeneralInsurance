package com.lti.appl.generalinsurance.dao;

import java.util.List;

import com.lti.appl.generalinsurance.beans.Registration;


public interface RegistrationDao 
{
	public int add(Registration r);
	
	public List<Registration> searchAll();

}
