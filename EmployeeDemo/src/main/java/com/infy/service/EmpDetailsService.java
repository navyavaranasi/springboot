package com.infy.service;
import java.time.LocalDate;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.*;
import com.infy.repository.*;

@Service
public class EmpDetailsService {
	
	@Autowired
	private EmpDetailsRepository empDetailsRepo;
	
	public List<EmpDetailsDTO> fetchEmpDetails(long calledBy,LocalDate calledOn){
		return empDetailsRepo.fetchEmpDetails(calledBy, calledOn);
	}

}
