package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.EmployeeDao;
import com.model.Employee;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeDao edao;
	
	
	@RequestMapping(value="hello")
	public String test() {
		Employee e=new Employee("anil", "9876543562", "anil123@gmail.com");
	edao.insert(e);	
	System.out.println("data added");
		return "hello";
	}
	
}
