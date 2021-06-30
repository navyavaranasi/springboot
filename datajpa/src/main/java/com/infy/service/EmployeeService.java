package com.infy.service;
import com.infy.dto.*;
import com.infy.entity.Address;

public interface EmployeeService {
	public void insertEmployee(EmployeeDTO Employee);
	public EmployeeDTO getEmployee(long empId);
	public void removeEmployee(long empId);
	public String updateAddress(long empId,Address address);

}
