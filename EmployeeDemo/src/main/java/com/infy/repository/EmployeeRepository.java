package com.infy.repository;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.infy.dto.*;
import com.infy.exceptions.NoSuchEmpException;

@Component
public class EmployeeRepository {
	
	List<EmployeeDTO> employees=null;
	
	@PostConstruct
	public void initializer() {
		
		TrainingDTO training=new TrainingDTO(); 
		
		training.setCourseId(1);
		training.setCourseName("Java");
		employees=new ArrayList<>();
		EmployeeDTO employeeDTO=new EmployeeDTO();
		employeeDTO.setEmpId(101);
		employeeDTO.setEmpName("Betty");
		employeeDTO.setDepartment("ETA");
		employeeDTO.setBaseLocation("Bangalore");
		employeeDTO.setEmployeeSalary(25000.00);
		employeeDTO.setEmployeeContactNumber(9807645321L);
		employeeDTO.setTraining(training);
		employees.add(employeeDTO);
        TrainingDTO training1=new TrainingDTO(); 
		
		training1.setCourseId(1);
		training1.setCourseName("Java");  
		EmployeeDTO employeeDTO2=new EmployeeDTO();
		employeeDTO2.setEmpId(102);
		employeeDTO2.setEmpName("Jake");
		employeeDTO2.setDepartment("ETA");
		employeeDTO2.setBaseLocation("Chennai");
		employeeDTO2.setEmployeeSalary(28000.00);
		employeeDTO2.setEmployeeContactNumber(6758904321L);
		employeeDTO2.setTraining(training1);
		employees.add(employeeDTO2);
		
	}
	
	
	//adds the emp 
	public String createEmployee(EmployeeDTO employeeDTO) {
		employees.add(employeeDTO);
		return "Employee Details added..";
	}
	//to fetch emp
	public List<EmployeeDTO> fetchEmployee(){
		return employees;
	}
	
//	public EmployeeDTO fetch
	
	//to update
	public boolean updateEmployee(int empId,EmployeeDTO employeeDTO) {
		boolean response=false;
		for(EmployeeDTO employee:employees) {
			if(employee.getEmpId()==empId) {
				if(employeeDTO.getEmpName()!=null) 
					employee.setEmpName(employeeDTO.getEmpName());
					if(employeeDTO.getBaseLocation()!=null) 
						employee.setBaseLocation(employeeDTO.getBaseLocation());
					
				response=true;
				break;
			}
		}
		
		return response;
	}
	
	
	
	//to delete
	public boolean deleteEmployee(int empId) throws NoSuchEmpException {
//		employees.remove(employee);
		boolean response=false;
		
		for(EmployeeDTO employee:employees) {
			if(employee.getEmpId()==empId) {
				employees.remove(employee);
				
				response=true;
				break;
			}
		}
//		if(response) {
//			throw new NoSuchEmpException("Employee with: "+empId+" does not exists");
//			
//		}
		return response;
	}

}
