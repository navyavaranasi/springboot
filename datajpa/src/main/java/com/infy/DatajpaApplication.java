package com.infy;
import java.util.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.infy.dto.*;
import com.infy.entity.Address;
import com.infy.service.*;

@SpringBootApplication
public class DatajpaApplication implements CommandLineRunner {

	
 static	Logger logger = Logger.getLogger(DatajpaApplication.class);
	
	@Autowired
	ApplicationContext context;
	
	@Autowired
	EmployeeService service;
	
	public static void main(String[] args) {
		SpringApplication.run(DatajpaApplication.class, args);
	}
		
		
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Address add1=new Address(456,"hitech","5432167");
		EmployeeDTO emp1=new EmployeeDTO(101L,"jane","eta","hyd",456);
		Address add2=new Address(567,"jubliee","5032145");
		EmployeeDTO emp2=new EmployeeDTO(102L,"mike","eta","mumbai",567);
		service.insertEmployee(emp1);
		service.insertEmployee(emp2);
		logger.info("Records are successfully added...");
	}
	

}
