package com.infy.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infy.service.EmployeeServiceImpl;
import com.infy.repository.EmployeeRepository;
import com.infy.repository.EmployeeRepositoryImpl;

@Configuration 
public class SpringConfiguration {
	  
	 @Bean(name = "EmployeeRepositoryImpl")

	   public EmployeeRepositoryImpl employeeRepositoryImpl() {

	      return new EmployeeRepositoryImpl();

	   }
	
	 @Bean(name = "employeeServiceImpl")

	   public EmployeeServiceImpl employeeServiceImpl() {

	      return new EmployeeServiceImpl(employeeRepositoryImpl());

	   }
	 
	 

	

}
