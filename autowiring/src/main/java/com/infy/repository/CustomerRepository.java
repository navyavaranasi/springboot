package com.infy.repository;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import com.infy.dto.CustomerDTO;
@Repository
public class CustomerRepository {
	List<CustomerDTO> customers = null;
//Equivalent/similar to constructor. Here, populates the DTOs in a hard-coded way
	@PostConstruct
	public void initializer()
	{
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setAddress("Chennai");
		customerDTO.setName("Jack"); 
		customerDTO.setEmail("Jack@infy.com");
		customerDTO.setPhoneNo(9951212222l);
		customers = new ArrayList<>();
		customers.add(customerDTO);
	}
	
	//adds the received customer object to customers list
	public void createCustomer(CustomerDTO customerDTO)
	{
		customers.add(customerDTO);
	}
	
	//returns a list of customers
	public List<CustomerDTO> fetchCustomer()
	{
		return customers;
	}
}
