package com.infy;

import org.springframework.boot.SpringApplication;

import com.infy.dto.EmployeeDTO;
import com.infy.service.*;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
@SpringBootApplication
public class EmployeeexerciseApplication {

	public static void main(String[] args) {
		 SpringApplication.run(EmployeeexerciseApplication.class, args);
		EmployeeServiceImpl service=null;
		AbstractApplicationContext context =  (AnnotationConfigApplicationContext)  SpringApplication.run(EmployeeexerciseApplication.class, args);
	    service=(EmployeeServiceImpl) context.getBean("employeeService");
	    service.fetchEmployee();
	    EmployeeDTO emp1=new EmployeeDTO();
	    emp1.setEmpId(11220);
	    emp1.setDepartment("ETA");
	    emp1.setEmpName("jane");
	    System.out.println("Employee " + emp1.getEmpName()+" with empid: "+emp1.getEmpId() +" has beed added to dept: " +emp1.getDepartment());
	    context.close();
		
	}

}
