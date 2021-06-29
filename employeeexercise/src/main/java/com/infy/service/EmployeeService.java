package com.infy.service;

import java.util.List;

import com.infy.dto.EmployeeDTO;

public interface EmployeeService {
	public String insertEmployee(EmployeeDTO employeedto);
	
	public List<EmployeeDTO> fetchEmployee();
	
	public String deleteEmployee(int empId);

}
