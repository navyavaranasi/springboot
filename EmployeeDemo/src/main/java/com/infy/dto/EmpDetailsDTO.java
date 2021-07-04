package com.infy.dto;
import java.time.*;

public class EmpDetailsDTO {
 
	long calledBy;
	long calledTo;
	LocalDate calledOn;
	int duration;
	public long getCalledBy() {
		return calledBy;
	}
	public void setCalledBy(long calledBy) {
		this.calledBy = calledBy;
	}
	public long getCalledTo() {
		return calledTo;
	}
	public void setCalledTo(long calledTo) {
		this.calledTo = calledTo;
	}
	public LocalDate getCalledOn() {
		return calledOn;
	}
	public void setCalledOn(LocalDate calledOn) {
		this.calledOn = calledOn;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "EmpDetailsDTO [calledBy=" + calledBy + ", calledTo=" + calledTo + ", calledOn=" + calledOn
				+ ", duration=" + duration + "]";
	}
	
}
