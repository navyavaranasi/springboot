package com.infy.controller;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infy.dto.*;
import com.infy.service.EmpDetailsService;

@RestController
@RequestMapping("/empdetails")
public class EmpDetailsController {

	@Autowired
	private EmpDetailsService empDetailsServ;
	
	@GetMapping(produces="application/json")
	public List<EmpDetailsDTO> fetchEmpDetails(@RequestParam("calledBy") long calledBy,@RequestParam("calledOn") String calledOn){
		return empDetailsServ.fetchEmpDetails(calledBy, LocalDate.parse(calledOn, DateTimeFormatter.ofPattern("MM-dd-yyyy")));   
	}
}
