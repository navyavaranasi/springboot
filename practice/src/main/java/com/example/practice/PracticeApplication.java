package com.example.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
		System.out.println("In Main app...");
//xmlconfig
//		ApplicationContext context=new ClassPathXmlApplicationContext("NewFile.xml");  
//		Vehicle obj=(Vehicle)context.getBean("vehicle");
//		obj.drive();
		
		
		//Annotationbased
		
		ApplicationContext context=new ClassPathXmlApplicationContext("NewFile.xml");  
		Vehicle obj=(Vehicle)context.getBean("car");
		obj.drive();  
		Vehicle obj2=(Vehicle)context.getBean("bike");
		obj2.drive();
		Tyre t=(Tyre)context.getBean("tyre");
		System.out.println(t);
	}

}
