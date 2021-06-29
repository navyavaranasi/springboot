package com.infy.repository;
import com.infy.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.infy.dto.EmployeeDTO;
@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
	List<EmployeeDTO> employee=null;
	@PostConstruct
	public void initializer() {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setEmpId(101);
		employeeDTO.setEmpName("Jack");
		employeeDTO.setDepartment("ETA");
		employee = new ArrayList<>();
		employee.add(employeeDTO);
	}
	public String insertEmployee(EmployeeDTO employeeDTO) {
		return "Inserted Emp:"+employee.add(employeeDTO);
	
	}
	public String removeEmployee(int empId) {
		return "Deleted emp:"+employee.remove(empId);
	}
	public List<EmployeeDTO> fetchCustomer() {
		return employee;
	}
}
