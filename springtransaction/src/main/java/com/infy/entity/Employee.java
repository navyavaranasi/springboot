package com.infy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;
import com.infy.dto.AddressDTO;
import com.infy.dto.EmployeeDTO;
import com.infy.entity.*;

@Entity
public class Employee {
	@Id
	@Column(name="emp_id")
	    private int empId;
	    private String empName;
	    private String department;
	    private String baseLocation;
	    @OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name="address_id")
	    private Address address;
	    private double employeeSalary;
	    private String employeeBandLevel;
	    @Column(name="ph_no")
	    private String employeeContactNumber;
		public Employee(int empId, String empName, String department, String baseLocation, Address address,
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
		public Employee() {}
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
		public static EmployeeDTO prepareDTO(Employee empEntity) {
			Address address=new Address(empEntity.getAddress().getAddressId(),empEntity.getAddress().getCity(),empEntity.getAddress().getPincode());
			AddressDTO addressDTO=Address.prepareaddressDTO(address);
			return new EmployeeDTO(empEntity.getEmpId(),empEntity.getEmpName(),empEntity.getDepartment(),empEntity.getBaseLocation(),address,empEntity.getEmployeeSalary(),empEntity.getEmployeeBandLevel(),empEntity.getEmployeeContactNumber());
		}
		
		
	    

}
