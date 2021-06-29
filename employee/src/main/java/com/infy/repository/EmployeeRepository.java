package com.infy.repository;

import java.util.List;

import com.infy.dto.EmployeeDTO;

public interface EmployeeRepository {
	 public String insertEmployee(EmployeeDTO emp) ;
	 public String removeEmployee(int empId);
	public List<EmployeeDTO> fetchCustomer();

}
