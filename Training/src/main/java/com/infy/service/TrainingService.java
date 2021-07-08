package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.TrainingDTO;
import com.infy.repository.TrainingRepository;

@Service
public class TrainingService {

	@Autowired
	public TrainingRepository trainingRepo;
	
	public TrainingDTO fetchTraining(int courseId) {
		return trainingRepo.fetchTraining(courseId);
		
	}
}
