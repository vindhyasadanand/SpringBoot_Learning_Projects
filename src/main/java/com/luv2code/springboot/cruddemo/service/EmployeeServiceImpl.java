package com.luv2code.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.cruddemo.dao.EmployeeDAO;
import com.luv2code.springboot.cruddemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO)
	{
		employeeDAO = theEmployeeDAO;
	}
	
	@Transactional
	public List<Employee> findAll() {
		
		return employeeDAO.findAll();
	}


	@Transactional
	public Employee findById(int theId) {
		// TODO Auto-generated method stub
		return employeeDAO.findById(theId);
	}

	@Transactional
	public void save(Employee theEmployee) {
		employeeDAO.save(theEmployee);

	}

	
	@Transactional
	public void deleteById(int theId) {
		employeeDAO.deleteById(theId);

	}

}
