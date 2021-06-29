package com.infy.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;

import com.infy.service.CustomerService;
import com.infy.service.CustomerServiceImpl;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringbootApplication.class, args);
		CustomerServiceImpl service = null;
		AbstractApplicationContext context = (AbstractApplicationContext) SpringApplication.run(SpringbootApplication.class, args);
		service = (CustomerServiceImpl) context.getBean("customerService");
		System.out.println(service.fetchCustomer());
        context.close();
	}

}
