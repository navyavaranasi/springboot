package com.infy.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.repository.*;
import com.infy.dto.*;
import com.infy.exceptions.NoSuchEmpException;


@Service
public class EmployeeService {

	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public String createEmployee(EmployeeDTO employeeDTO) {
		employeeRepository.createEmployee(employeeDTO);
		return "Employee with "+employeeDTO.getEmpId()+" added successfully";
	}
	
	public List<EmployeeDTO> fetchEmployee(){
		return employeeRepository.fetchEmployee();
	}
	
	public String updateEmployee(int empId,EmployeeDTO employeeDTO) {
//		String response="Employee of: "+empId+"does not exists";
//		for(EmployeeDTO employee:employeeRepository.fetchEmployee()) {
//			if(employee.getEmpId()==empId) {
//				if(employeeDTO.getEmpName()!=null) 
//					employee.setEmpName(employeeDTO.getEmpName());
////					if(employeeDTO.getEmployeeContactNumber()!=null) {
////						employee.setEmployeeContactNumber(employeeDTO.getEmployeeContactNumber());
////					}
//					if(employeeDTO.getBaseLocation()!=null) 
//						employee.setBaseLocation(employeeDTO.getBaseLocation());
//					
//				response="employee with empID: "+employee.getEmpId()+" updated successfully";
//			}
//		}
//		
//		return response;
		return employeeRepository.updateEmployee(empId, employeeDTO);
	}
	
	
	public String deleteEmployee(int empId) throws NoSuchEmpException {
//		String response="Employee of:" +empId+"does not exists";
//		
//		for(EmployeeDTO employee:employeeRepository.fetchEmployee()) {
//			if(employee.getEmpId()==empId) {
//				employeeRepository.deleteEmployee(empId);
//				response="Employee with "+employee.getEmpId()+" deleted successfuly";
//				break;
//			}
//		}
//		
//		return response;
//		
		return employeeRepository.deleteEmployee(empId);
	}
}
