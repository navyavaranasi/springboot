package com.infy.repository;
import com.infy.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends  JpaRepository<Employee,Long> {
	public void insert(Employee employee);
	
	public void getAll(int empId);


}
