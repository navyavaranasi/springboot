package com.infy.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infy.dto.*;
import com.infy.repository.*;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	

	@Override
	public String insertEmployee(EmployeeDTO employeedto) {
		// TODO Auto-generated method stub
		employeeRepository.createEmployee(employeedto);
		return "Employee with "+ employeedto.getEmpId() + " added successfully";
		
	}


	@Override
	public List<EmployeeDTO> fetchEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.fetchEmployee();
	}


	@Override
	public String deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return employeeRepository.deleteEmployee(empId);
	}
	
	
	

}
