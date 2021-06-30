package com.infy.dto;
import com.infy.entity.*;
public class EmployeeDTO {
	 private Long empId;
	    private String empName;
	    private String department;
	    private String baseLocation;
	    private Integer addressId;
	   // constructors
	   // getter and setter methods
	    
		public EmployeeDTO(Long empId, String empName, String department, String baseLocation, Integer addressId) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.department = department;
			this.baseLocation = baseLocation;
			this.addressId =addressId ;
		}
		
		public EmployeeDTO() {}
		
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
//		public AddressDTO getAddress() {
//			return address;
//		}
//		public void setAddress(Address address2) {
//			this.address = address2;
//		}
		
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", department=" + department + ", baseLocation="
					+ baseLocation + ", address=" + addressId + "]";
		}
		public Integer getAddress() {
			return addressId;
		}

		public void setAddress(Integer addressId) {
			this.addressId = addressId;
		}

		public static Employee prepareEmployeeEntity(EmployeeDTO employeeDTO) {
			Employee employeeEntity=new Employee();
			
			employeeEntity.setEmpId(employeeDTO.getEmpId());
			employeeEntity.setEmpName(employeeDTO.getEmpName());
			employeeEntity.setDepartment(employeeDTO.getDepartment());
			
			employeeEntity.setAddressId(employeeDTO.getAddress());
			employeeEntity.setBaseLocation(employeeDTO.getBaseLocation());
			
			return employeeEntity;
		}
	    

}
