package com.infy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.infy.dto.EmployeeDTO;
import com.infy.entity.Address;
import com.infy.entity.Employee;
import com.infy.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	 
 	@Autowired
 	private EmployeeRepository employeeRepository;

	@Override
	public void insertEmployee(EmployeeDTO Employee) {
		// TODO Auto-generated method stub
		 employeeRepository.saveAndFlush(EmployeeDTO.prepareEmployeeEntity(Employee));
		
	}

	
	
	//pagination
	@Override
	public Page<Employee> findAll(Pageable page) {
		// TODO Auto-generated method stub
		return employeeRepository.findAll(page);
	}

	@Override
	public List<Employee> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return employeeRepository.findAll(sort);
	}

	
	
	
	//crud
	
//	@Override
//	public EmployeeDTO getEmployee(long empId) {
//		// TODO Auto-generated method stub
//		Optional<Employee> employee=employeeRepository.findById((long) empId);
//		Employee employeeEntity=employee.get();
//		EmployeeDTO employeeDTO=Employee.prepareEmployeeDTO(employeeEntity);
//		
//		return employeeDTO;
//	}
//
//	@Override
//	public void removeEmployee(long empId) {
//		// TODO Auto-generated method stub
//		employeeRepository.deleteById(empId);
//		
//	}
//
//	@Override
//	public String updateAddress(long empId, Address address) {
//		// TODO Auto-generated method stub
//		Optional<Employee> employee=employeeRepository.findById(empId);
//		Employee employeeEntity=employee.get();
//		employeeEntity.setAddressId(456);
//		employeeEntity.setAddressId(567);
//		employeeRepository.save(employeeEntity);
//		return "Address for the employee " +empId+ " has been updated successfully";
//	}

}
