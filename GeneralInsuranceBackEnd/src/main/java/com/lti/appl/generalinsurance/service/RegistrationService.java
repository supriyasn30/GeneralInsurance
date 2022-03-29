package com.lti.appl.generalinsurance.service;

import java.util.List;

import com.lti.appl.generalinsurance.beans.Registration;

public interface RegistrationService 
{
	public int add(Registration r);
	
	public List<Registration> searchAll();

}
