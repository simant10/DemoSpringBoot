package com.springboot.employee.dao;

import java.util.List;

import com.springboot.employee.model.Employee;

public interface EmployeeDao {
	List<Employee> get();
	Employee get(int id);
	void save(Employee employee);
	void delete(int id);
}
