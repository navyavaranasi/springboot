package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infy.dto.*;
import com.infy.repository.*;


@Transactional
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
   
	@Autowired
	EmployeeRepository empRepository;
	
	@Autowired
	AddressRepository addRepository;
	
	
	@Override
	public void insert(EmployeeDTO employeeDTO) {
		// TODO Auto-generated method stub
		empRepository.saveAndFlush(EmployeeDTO.prepareEntity(employeeDTO));
	}

	@Override
	public void updateCustomer(EmployeeDTO employeeDTO) {
		// TODO Auto-generated method stub
		empRepository.updatePhno(employeeDTO.getEmployeeContactNumber(), employeeDTO.getEmpId());
	}

}
