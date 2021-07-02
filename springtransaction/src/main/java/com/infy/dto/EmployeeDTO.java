package com.infy.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.infy.entity.*;


public class EmployeeDTO {

	
	    private int empId;
	    private String empName;
	    private String department;
	    private String baseLocation;
	  
	    private Address address;
	    private double employeeSalary;
	    private String employeeBandLevel;
	    private String employeeContactNumber;
		
		public EmployeeDTO(int empId, String empName, String department, String baseLocation, Address address,
				double employeeSalary, String employeeBandLevel, String employeeContactNumber) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.department = department;
			this.baseLocation = baseLocation;
			this.address = address;
			this.employeeSalary = employeeSalary;
			this.employeeBandLevel = employeeBandLevel;
			this.employeeContactNumber = employeeContactNumber;
		}
		
		public EmployeeDTO() {}

		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
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
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		public double getEmployeeSalary() {
			return employeeSalary;
		}
		public void setEmployeeSalary(double employeeSalary) {
			this.employeeSalary = employeeSalary;
		}
		public String getEmployeeBandLevel() {
			return employeeBandLevel;
		}
		public void setEmployeeBandLevel(String employeeBandLevel) {
			this.employeeBandLevel = employeeBandLevel;
		}
		public String getEmployeeContactNumber() {
			return employeeContactNumber;
		}
		public void setEmployeeContactNumber(String employeeContactNumber) {
			this.employeeContactNumber = employeeContactNumber;
		}
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", department=" + department
					+ ", baseLocation=" + baseLocation + ", address=" + address + ", employeeSalary=" + employeeSalary
					+ ", employeeBandLevel=" + employeeBandLevel + ", employeeContactNumber=" + employeeContactNumber
					+ "]";
		}
		
		
		
		public static Employee prepareEntity(EmployeeDTO empDTO) {
			Address address=new Address(empDTO.getAddress().getAddressId(),empDTO.getAddress().getCity(),empDTO.getAddress().getPincode());
			return new Employee(empDTO.getEmpId(),empDTO.getEmpName(),empDTO.getDepartment(),empDTO.getBaseLocation(),address,empDTO.getEmployeeSalary(),empDTO.getEmployeeBandLevel(),empDTO.getEmployeeContactNumber());
		}

//		public static String prepareEntity(String employeeContactNumber2, int empId2) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//		
}
