package com.springboot.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.employee.model.Employee;
import com.springboot.employee.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employee")
	public List<Employee> get(){
		return 	employeeService.get();
	}
	@PostMapping("/employee")
	public Employee save(@RequestBody Employee employee) {
		employeeService.save(employee);
		return employee;
	}
}
