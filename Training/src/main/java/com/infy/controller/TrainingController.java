package com.infy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.dto.TrainingDTO;
import com.infy.service.TrainingService;

@RestController
@RequestMapping("/trainings")
public class TrainingController {
	
	@Autowired
	public TrainingService trainingServ;
	
	@GetMapping("/{courseId}")
	public TrainingDTO fetchTrainig(@PathVariable ("courseId") int courseId) {
		return trainingServ.fetchTraining(courseId);
	}

}
