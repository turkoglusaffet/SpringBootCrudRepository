package com.system.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.system.dao.EmployeeRepository;
import com.system.model.Employee;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	
	@RequestMapping(value = "/newUser", method = RequestMethod.GET)
	public String newRegistration(ModelMap model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "employee";
	}
	
	@RequestMapping(value = "/newUser", method = RequestMethod.POST)
	public String  saveRegistration(@Valid Employee employee,
			BindingResult result, ModelMap model) {
		try {
			employeeRepository.save(employee);
		} catch (Exception ex) {
			return "hello";
		}
		return "success";
	}
}
