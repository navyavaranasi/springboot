package com.infy;
import java.util.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.infy.dto.*;
import com.infy.entity.Address;
import com.infy.entity.Employee;
import com.infy.repository.EmployeeRepository;
import com.infy.service.*;

@SpringBootApplication
public class DatajpaApplication implements CommandLineRunner {

	
 static	Logger logger = Logger.getLogger(DatajpaApplication.class);
	
	@Autowired
	ApplicationContext context;
	
	@Autowired
	EmployeeService service;
	
	
	@Autowired
	EmployeeRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(DatajpaApplication.class, args);
	}
		
		
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		EmployeeDTO emp1=new EmployeeDTO(101L,"jane","eta","hyd",456);
		
		EmployeeDTO emp2=new EmployeeDTO(102L,"mike","eta","mumbai",567);
		
		EmployeeDTO emp3=new EmployeeDTO(103L,"jake","eta","bangalore",879);
		
		EmployeeDTO emp4=new EmployeeDTO(104L,"ross","eta","mumbai",980);
		
		EmployeeDTO emp5=new EmployeeDTO(105L,"alan","eta","kerala",777);
		
		EmployeeDTO emp6=new EmployeeDTO(106L,"jack","eta","chennai",56);
		service.insertEmployee(emp1);
		service.insertEmployee(emp2);
		service.insertEmployee(emp3);
		service.insertEmployee(emp4);
		service.insertEmployee(emp5);
		service.insertEmployee(emp6);
		logger.info("Records are successfully added...");
		
		
		  int k=(int) (repository.count()/3);
	        for(int i=0;i<=k;i++){
	        Pageable pageable = PageRequest.of(i,3);
	        
	        logger.info("Records per page: ");
	        Iterable<Employee> emp = service.findAll(pageable);
	        for(Employee list:emp) {
	        	logger.info(list);
	        	}
	        }
		logger.info("Sorted records...");
		
		 Iterable<Employee> empSort = service.findAll(Sort.by(Sort.Direction.DESC,"empId"));
	        
	        for(Employee list : empSort){
	             logger.info(list);
	        }     
		
		
		//crud
//		System.out.println("enter empid of employee to delete ");
//		Scanner scanner=new Scanner(System.in);
//		Long empId=scanner.nextLong();
//		service.removeEmployee(empId);
//		logger.info("Deleted successfully...");
//		
//		logger.info("enter empid of the employee to display details: ");
//		Long empId1=scanner.nextLong();
//		EmployeeDTO employeeDTO=service.getEmployee(empId1);
//		
//		logger.info("Details...");
//		logger.info("Employee ID: " +employeeDTO.getEmpId());
//		logger.info("Employee Name: "+employeeDTO.getEmpName());
//		logger.info("Department: "+employeeDTO.getDepartment());
//		logger.info("Location: "+employeeDTO.getBaseLocation());
//		logger.info("Address: "+employeeDTO.getAddress());
//		logger.info("");
//		
		
	}
	

}
