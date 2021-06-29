package com.infy.repository;
import com.infy.dto.*;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
    List<EmployeeDTO> employee=null;
    
    @PostConstruct
	public void initializer() {
		EmployeeDTO employeedto = new EmployeeDTO();		
		employeedto.setDepartment("eta");
		employeedto.setEmpId(11223344);
		employeedto.setEmpName("jake");
		employee = new ArrayList<>();
		employee.add(employeedto);
	}
    //to insert emp
    public void createEmployee(EmployeeDTO employeedto) {
    	employee.add(employeedto);
    }
    //search emp
    public List<EmployeeDTO> fetchEmployee(){
    	return employee;
    }
    // delete emp
    public String deleteEmployee(int empId) {
    	String response="Employee of:"+ empId + " does not exist";
    	for(EmployeeDTO emp:employee) {
    		if(emp.getEmpId()==empId) {
    			((List<EmployeeDTO>) emp).remove(employee);
    			response=emp.getEmpId() + " has been deleted successfully";
    			break;
    		}
    	}
    	return response;
    }

}
