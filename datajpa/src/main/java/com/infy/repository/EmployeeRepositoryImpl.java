package com.infy.repository;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.infy.entity.*;

public class EmployeeRepositoryImpl implements EmployeeRepository {
   
	static Logger logger=Logger.getLogger(EmployeeRepositoryImpl.class);
	Connection con=null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	
	
	@Override
	public void insert(Employee employee) {
		// TODO Auto-generated method stub
		try (FileInputStream fis = new FileInputStream("resources/application.properties");){
			Properties p = new Properties();
			p.load(fis);
			String dname = (String) p.get("JDBC_DRIVER");
			String url = (String) p.get("JDBC_URL");
			String username = (String) p.get("USER");
			String password = (String) p.get("PASSWORD");
			Class.forName(dname);
			// Register driver
			con = DriverManager.getConnection(url, username, password);
			// Create connection
			String query = "insert into customer values (?,?,?,?,?)";
			stmt=con.prepareStatement(query);
			
			stmt.setLong(1, employee.getEmpId());
			stmt.setString(2,employee.getEmpName());
			stmt.setString(3, employee.getDepartment());
//			stmt.setString(4,employee.getAddress());
			
		}catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			try {
				// Close the prepared statement
				stmt.close();
				// Close the connection
				con.close();
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			}
		}
	}



	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<Employee> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<Employee> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public <S extends Employee> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public <S extends Employee> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public <S extends Employee> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void deleteAllInBatch(Iterable<Employee> entities) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Employee getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Employee getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public <S extends Employee> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public <S extends Employee> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Page<Employee> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public <S extends Employee> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Optional<Employee> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void delete(Employee entity) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void deleteAll(Iterable<? extends Employee> entities) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public <S extends Employee> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public <S extends Employee> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public <S extends Employee> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public <S extends Employee> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public void getAll(int empId) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void getAll(long empId) {
//		// TODO Auto-generated method stub
//		
//	}
//
}
