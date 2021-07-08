package com.infy.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.core.env.Environment;
import com.infy.repository.*;
import com.infy.dto.*;
import com.infy.exceptions.NoSuchEmpException;
import com.infy.util.*;


@Service
@PropertySource("classpath:ValidationsMessages.properties")
public class EmployeeService {

	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private Environment environment;
	
	public String createEmployee(EmployeeDTO employeeDTO) {
		return employeeRepository.createEmployee(employeeDTO);
		
	}
	
	public List<EmployeeDTO> fetchEmployee(){
		return employeeRepository.fetchEmployee();
	}
	
	public String updateEmployee(int empId,EmployeeDTO employeeDTO) throws NoSuchEmpException {
		boolean response=employeeRepository.updateEmployee(empId, employeeDTO);
		if(!response)
			throw new NoSuchEmpException(environment.getProperty(EmployeeConstants.EMPLOYEE_NOT_FOUND.toString()));
		return environment.getProperty(EmployeeConstants.EMPLOYEE_UPDATE_SUCCESS.toString());	}
	
	
	public String deleteEmployee(int empId) throws NoSuchEmpException {

		boolean response=employeeRepository.deleteEmployee(empId);
		if(!response)
			throw new NoSuchEmpException(environment.getProperty(EmployeeConstants.EMPLOYEE_NOT_FOUND.toString()));
		return environment.getProperty(EmployeeConstants.EMPLOYEE_DELETE_SUCCESS.toString());
			

	}
}
