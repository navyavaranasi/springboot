package com.infy.controller;
import java.util.*;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.dto.*;
import com.infy.exceptions.NoSuchEmpException;
import com.infy.service.*;


@RestController
@RequestMapping("/employees")
@Validated
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	//to get emp details
	@GetMapping(produces="application/json")
	public List<EmployeeDTO> fetchEmployee(){
		return employeeService.fetchEmployee();
	}
	
	//to add emp
	@PostMapping(consumes="application/json")
	public ResponseEntity<String> createEmployee(@Valid @RequestBody EmployeeDTO employeeDTO,Errors err){
		
	    String response=employeeService.createEmployee(employeeDTO);
		return ResponseEntity.ok(response);
		
	}
	
	
	//to update emp
	@PutMapping(value="/{empId}",consumes="application/json")
	public String updateEmployee(@PathVariable("empId")int empId,@RequestBody EmployeeDTO employeeDTO) throws NoSuchEmpException
	{
		return employeeService.updateEmployee(empId, employeeDTO);
	}
	
	//to delete emp
	@DeleteMapping(value="/{empId}",produces="text/plain")
	public String deleteEmployee(@PathVariable("empId")int empId) throws NoSuchEmpException
	{
		return employeeService.deleteEmployee(empId);
	}
}
	
	
	

