package com.infy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.infy.dto.AddressDTO;
import com.infy.dto.EmployeeDTO;

//import statements
@Entity
public class Employee {
	@Id
	@Column(name="emp_Id")
    private Long empId;
    private String empName;
    private String department;
    private String baseLocation;
    @Column(name="address_id")
    private Integer addressId;
//    private Address address;
   // constructors
   // getter and setter methods
    


//	public static EmployeeDTO prepareEmployeeDTO(Employee employee) {
//		EmployeeDTO employeeDTO=new EmployeeDTO();
//		employeeDTO.setAddress(employee.getAddressId());
//		employeeDTO.setEmpId(employee.getEmpId());
//		employeeDTO.setEmpName(employee.getEmpName());
//		employeeDTO.setDepartment(employee.getDepartment());
//		employeeDTO.setBaseLocation(employee.getBaseLocation());
//		return employeeDTO;
//	}
public Employee(Long empId, String empName, String department, String baseLocation, Integer addressId) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.department = department;
	this.baseLocation = baseLocation;
	this.addressId = addressId;
}
public Employee() {
	super();
}
public Long getEmpId() {
	return empId;
}
public void setEmpId(Long empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getBaseLocation() {
	return baseLocation;
}
public void setBaseLocation(String baseLocation) {
	this.baseLocation = baseLocation;
}
public Integer getAddressId() {
	return addressId;
}
public void setAddressId(Integer addressId) {
	this.addressId = addressId;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", department=" + department + ", baseLocation="
			+ baseLocation + ", addressId=" + addressId + "]";
}


public static EmployeeDTO prepareEmployeeDTO(Employee employee) {
	EmployeeDTO employeeDTO=new EmployeeDTO();
	employeeDTO.setAddress(employee.getAddressId());
	employeeDTO.setEmpId(employee.getEmpId());
	employeeDTO.setEmpName(employee.getEmpName());
	employeeDTO.setDepartment(employee.getDepartment());
	employeeDTO.setBaseLocation(employee.getBaseLocation());
	return employeeDTO;
}
}
