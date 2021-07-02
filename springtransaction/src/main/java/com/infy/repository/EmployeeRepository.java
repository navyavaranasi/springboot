package com.infy.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.infy.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
@Transactional
	@Modifying
	@Query(value = "update  Employee set ph_no = ? " + " where emp_id = ?", nativeQuery = true)
       public void updatePhno(String employeeContactNumber,int empId);

}


