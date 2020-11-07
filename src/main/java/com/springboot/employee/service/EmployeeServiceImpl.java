package com.springboot.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.employee.dao.EmployeeDao;
import com.springboot.employee.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDAO;
	
	@Transactional
	@Override
	public List<Employee> get() {
		return employeeDAO.get();
	}
	@Transactional
	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	@Override
	public void save(Employee employee) {
		employeeDAO.save(employee);
	}
	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
