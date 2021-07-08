package com.infy.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.infy.dto.TrainingDTO;


@Repository
public class TrainingRepository {
	
	private List<TrainingDTO> trainingList;
	
	@PostConstruct
	public void populateTraining() {
		trainingList=new ArrayList<>();
		TrainingDTO training=new TrainingDTO(); 
		
		training.setCourseId(1);
		training.setCourseName("Java");
		trainingList.add(training);
		TrainingDTO training1=new TrainingDTO();
		
		training1.setCourseId(2);
		training1.setCourseName("DBMS");
		trainingList.add(training1);
	}
	public TrainingDTO fetchTraining(int courseId) {
		Optional<TrainingDTO> opt=trainingList.stream().filter(fil->fil.getCourseId()==courseId).findFirst();
		return opt.orElse(trainingList.get(0));
		
	}

}
