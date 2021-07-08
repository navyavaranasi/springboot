package com.infy.dto;

public class TrainingDTO {
	
	
	private String courseName;
	private int courseId;
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	@Override
	public String toString() {
		return "TrainingDTO [courseName=" + courseName + ", courseId=" + courseId + "]";
	}

}
