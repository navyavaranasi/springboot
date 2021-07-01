//package com.infy.repository;
//import java.io.FileInputStream;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.List;
//import java.util.Optional;
//import java.util.Properties;
//import org.apache.log4j.Logger;
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//
//import com.infy.entity.*;
//
//public  class EmployeeRepositoryImpl implements EmployeeRepository {
//   
//	static Logger logger=Logger.getLogger(EmployeeRepositoryImpl.class);
//	Connection con=null;
//	PreparedStatement stmt = null;
//	ResultSet rs = null;
//	
//	
//	
//	@Override
//	public void insert(Employee employee) {
//		// TODO Auto-generated method stub
//		try (FileInputStream fis = new FileInputStream("resources/application.properties");){
//			Properties p = new Properties();
//			p.load(fis);
//			String dname = (String) p.get("JDBC_DRIVER");
//			String url = (String) p.get("JDBC_URL");
//			String username = (String) p.get("USER");
//			String password = (String) p.get("PASSWORD");
//			Class.forName(dname);
//			// Register driver
//			con = DriverManager.getConnection(url, username, password);
//			// Create connection
//			String query = "insert into customer values (?,?,?,?,?)";
//			stmt=con.prepareStatement(query);
//			
//			stmt.setLong(1, employee.getEmpId());
//			stmt.setString(2,employee.getEmpName());
//			stmt.setString(3, employee.getDepartment());
////			stmt.setString(4,employee.getAddress());
//			
//		}catch (Exception e) {
//			logger.error(e.getMessage(), e);
//		} finally {
//			try {
//				// Close the prepared statement
//				stmt.close();
//				// Close the connection
//				con.close();
//			} catch (Exception e) {
//				logger.error(e.getMessage(), e);
//			}
//		}
//	}
//
// public int remove(Long empId) {
//	 int result = 1;
//		try (FileInputStream fis = new FileInputStream("resources/application.properties");) {
//			Properties p = new Properties();
//			p.load(fis);
//			String dname = (String) p.get("JDBC_DRIVER");
//			String url = (String) p.get("JDBC_URL");
//			String username = (String) p.get("USER");
//			String password = (String) p.get("PASSWORD");
//			Class.forName(dname);
//			// Create connection
//			con = DriverManager.getConnection(url, username, password);
//			String query = "DELETE FROM Customer WHERE phone_no = ?";
//			// Create prepared statement
//			stmt = con.prepareStatement(query);
//			stmt.setLong(1, empId);
//			// Execute query
//			result = stmt.executeUpdate();
//		} catch (Exception e) {
//			logger.error(e.getMessage(), e);
//		} finally {
//			try {
//				// Close the prepared statement
//				stmt.close();
//				// Close the connection
//				con.close();
//			} catch (Exception e) {
//				logger.error(e.getMessage(), e);
//			}
//		}
//		
//		return result;
// }	
//}
