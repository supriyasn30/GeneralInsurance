package com.lti.appl.generalinsurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.appl.generalinsurance.beans.Registration;
import com.lti.appl.generalinsurance.service.RegistrationServiceImpl;


@CrossOrigin(origins="*")
@RestController
@RequestMapping("/reg")
public class RegistrationController {
	
	@Autowired
	RegistrationServiceImpl regService;
	
	// http://localhost:8787/reg/add
	
	
		@PostMapping(path="/add",consumes="application/json",produces="application/json")
		public int add(@RequestBody Registration r)
		{
			return regService.add(r);
		}
	
	// http://localhost:8787/reg/allreg
	
		@GetMapping("/allreg")
		public List<Registration> searchAll()
		{
			return regService.searchAll();
		}
}
