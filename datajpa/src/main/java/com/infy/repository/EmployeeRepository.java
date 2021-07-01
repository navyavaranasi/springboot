package com.infy.repository;
import com.infy.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends  JpaRepository<Employee,Long> {
//	public void insert(Employee employee);
//	
//	public int remove(Long empId);
//	
//	public void getAll(Long empId);


}
