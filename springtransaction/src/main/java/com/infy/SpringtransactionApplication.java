package com.infy;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.dao.DataAccessException;

import com.infy.dto.*;
import com.infy.entity.Address;
import com.infy.entity.Employee;
import com.infy.service.*;

@SpringBootApplication
public class SpringtransactionApplication implements CommandLineRunner {
   
	@Autowired
	AbstractApplicationContext context;
	static Logger logger = Logger.getLogger(SpringtransactionApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringtransactionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		  
		//to insert
		
		EmployeeService empServ=(EmployeeService)context.getBean("employeeService");
		Address add=new Address(123,"Bangalore","530089");
		EmployeeDTO emp=new EmployeeDTO(1001,"Jake","ETA","Bangalore",add,25000.00,"A","876543219");
		
		Address add1=new Address(890,"chennai","530019");
		EmployeeDTO emp1=new EmployeeDTO(1002,"Alan","ETA","Bangalore",add1,57000.00,"A","9807654321");
        empServ.insert(emp);
        empServ.insert(emp1);
		logger.info("Records added..........");
		
		
		//to update contact number
		
//		String phno="86543217890";
//		emp1.setEmployeeContactNumber(phno);
		System.out.println("enter empid of employee to update ");
	    Scanner scanner=new Scanner(System.in);
        Long empId=scanner.nextLong();
        System.out.println("enter contact no : ");
        Scanner scanner1=new Scanner(System.in);
        String phno1=scanner1.next();
		try {
			emp1.setEmployeeContactNumber(phno1);
			empServ.updateCustomer(emp1);
			logger.info("Success : Contact Updated!");
		} catch (DataAccessException exp) {
			
			logger.error("ERROR : "+exp.getMessage());
			logger.error(exp.getMessage(),exp);
		}
		finally
		{
			context.close();
		}
		
	}

}
