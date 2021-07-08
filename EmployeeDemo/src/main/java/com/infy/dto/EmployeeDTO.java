package com.infy.dto;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;
@Validated
public class EmployeeDTO {
  
	@NotNull(message="{employee.empId.must}")
	private int empId;
	@NotBlank(message="{employee.empName.must}")
    private String empName;
	private String department;
	private String baseLocation;
	private double employeeSalary;
	private long employeeContactNumber; 
	private TrainingDTO training;
	
	
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
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	public long getEmployeeContactNumber() {
		return employeeContactNumber;
	}
	public void setEmployeeContactNumber(long employeeContactNumber) {
		this.employeeContactNumber = employeeContactNumber;
	}
	
	public TrainingDTO getTraining() {
		return training;
	}
	public void setTraining(TrainingDTO training) {
		this.training = training;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [empId=" + empId + ", empName=" + empName + ", department=" + department + ", baseLocation="
				+ baseLocation + ", employeeSalary=" + employeeSalary + ", employeeContactNumber="
				+ employeeContactNumber + ", training=" + training + "]";
	}
	
	
	
}
