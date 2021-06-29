package com.infy.service;
import java.util.List;

import com.infy.dto.EmployeeDTO;
import com.infy.repository.EmployeeRepository;
import com.infy.repository.EmployeeRepositoryImpl;
import com.infy.service.EmployeeService;
public class EmployeeServiceImpl implements EmployeeService {

		
		
//		@Override
//		public void insert(EmployeeDTO emp) {
//			// TODO Auto-generated method stub
//			System.out.println("inserted");
//			
//		}
//
//		@Override
//		public void delete(int empId) {
//			// TODO Auto-generated method stub
//			System.out.println("deleted");
//			
//		}
//		EmployeeRepository employeeDAO = new EmployeeRepositoryImpl();     // Make necesserychanges
	 EmployeeRepository employeeDAO;



	   public EmployeeServiceImpl(EmployeeRepository employeeDAO) {

	      this.employeeDAO = employeeDAO;

	   }

		public String insert(EmployeeDTO emp) {
			return "Inserted:"+ employeeDAO.insertEmployee(emp);
		}
		public String delete(int empId) {
			return employeeDAO.removeEmployee(empId);
		}
		public List<EmployeeDTO> getAllCustomer() {
			
			return employeeDAO.fetchCustomer();
		}
}
