package com.infy.util;

public enum EmployeeConstants {
	




	//messages
	EMPLOYEE_NOT_FOUND("employee.not.found"),
	GENERAL_EXCEPTION_MESSAGE("general.exception"),
	
	EMPLOYEE_UPDATE_SUCCESS("employee.update.success"),
	EMPLOYEE_DELETE_SUCCESS("employee.delete.success");
	
	
	private final String type;
	
	
	
	private EmployeeConstants(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return this.type;
	}

	
	

}
