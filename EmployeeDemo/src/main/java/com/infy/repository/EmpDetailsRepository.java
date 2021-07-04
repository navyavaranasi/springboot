package com.infy.repository;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import com.infy.dto.*;

@Component
public class EmpDetailsRepository {
	List<EmpDetailsDTO> empDetails=null;
	EmpDetailsDTO empDetailsDTO=null;
	EmpDetailsDTO empDetailsDTO1=null;
	LocalDate calledOn=null;
	
	@PostConstruct
	public void populatecallledOn() {
		empDetails=new ArrayList<>();
		empDetailsDTO=new EmpDetailsDTO();
		empDetailsDTO1=new EmpDetailsDTO();
		calledOn=LocalDate.now();
		empDetailsDTO.setCalledBy(8870106465l);
		empDetailsDTO.setCalledTo(9930508495l);
		empDetailsDTO.setCalledOn(calledOn);
		empDetailsDTO.setDuration(3);
		empDetailsDTO1.setCalledBy(8870106465l);
		empDetailsDTO1.setCalledTo(9930508495l);
		empDetailsDTO1.setCalledOn(calledOn);
		empDetailsDTO1.setDuration(5);
		empDetails.add(empDetailsDTO);
		empDetails.add(empDetailsDTO1);
		
	}
	public List<EmpDetailsDTO> fetchEmpDetails(long calledBy,LocalDate calledOn){
		List<EmpDetailsDTO> empDetailsResultSet=new ArrayList<>();
		for(EmpDetailsDTO empDetail:empDetails) {
			if(empDetail.getCalledBy()==calledBy && empDetail.getCalledOn().equals(calledOn))
				empDetailsResultSet.add(empDetail);
			
		}
		return empDetailsResultSet;
	}
	

}
