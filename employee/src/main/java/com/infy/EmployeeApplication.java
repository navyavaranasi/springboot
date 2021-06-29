package com.infy;

import java.util.List;

import org.springframework.boot.SpringApplication;
import com.infy.dto.*;
import com.infy.repository.*;
import com.infy.service.*;
import com.infy.util.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
		EmployeeServiceImpl Service = null;
		 AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class); 
		Service = (EmployeeServiceImpl) context.getBean("employeeServiceImpl");
		 EmployeeDTO emp = new EmployeeDTO(); 
		System.out.println( Service.insert(emp));
		List<EmployeeDTO> list=Service.getAllCustomer();
		for(EmployeeDTO dto:list) {
			System.out.println("name: "+dto.getEmpName()+" "+"Dept: "+dto.getDepartment());
		}
		
		context.close(); 
	}

}
