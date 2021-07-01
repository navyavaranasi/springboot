package com.infy.service;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.infy.dto.*;
import com.infy.entity.Address;
import com.infy.entity.Employee;

public interface EmployeeService {
	public void insertEmployee(EmployeeDTO Employee);
//	public EmployeeDTO getEmployee(long empId);
//	public void removeEmployee(long empId);
//	public String updateAddress(long empId,Address address);
	
	//pagination
	Page<Employee> findAll(Pageable page);
	List<Employee> findAll(Sort sort);

}
