package com.infy.exceptions;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.infy.dto.*;
import com.infy.util.EmployeeConstants;
import org.springframework.validation.ObjectError;

import java.util.stream.Collectors;

import javax.validation.ConstraintViolationException;
import javax.validation.ConstraintViolation;


@RestControllerAdvice
public class ExceptionControllerAdvice {
	@Autowired
	private Environment environment;
	
//     @ExceptionHandler(Exception.class)
//     public String exceptionHandler(Exception e) {
//    	 return e.getMessage();
//     }
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorMessage> exceptionHandler2(Exception ex) 
 	{
		 ErrorMessage error = new ErrorMessage();
	     error.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
	     error.setMessage(environment.getProperty(EmployeeConstants.GENERAL_EXCEPTION_MESSAGE.toString()));
	     return new ResponseEntity<>(error, HttpStatus.OK);
	}
     
     @ExceptionHandler(NoSuchEmpException.class)
     public ResponseEntity<ErrorMessage> exceptionHandler2(NoSuchEmpException e2){
    	 ErrorMessage err=new ErrorMessage();
     	 err.setErrorCode(HttpStatus.BAD_REQUEST.value());
    	 err.setMessage(e2.getMessage());
    	 return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
     }
     
    //validations in dto
 	@ExceptionHandler(MethodArgumentNotValidException.class)
 	public ResponseEntity<ErrorMessage> handleValidationExceptions(MethodArgumentNotValidException ex) 
 	{
 		 ErrorMessage error = new ErrorMessage();
 	     error.setErrorCode(HttpStatus.BAD_REQUEST.value());
 	     error.setMessage(ex.getBindingResult().getAllErrors()
 	    		 		  	.stream().map(ObjectError::getDefaultMessage)
 	    		 		  	.collect(Collectors.joining(", ")));
 	        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
 	}
 	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<ErrorMessage> handleConstraintValidationExceptions(ConstraintViolationException ex) 
	{
		 ErrorMessage error = new ErrorMessage();
	     error.setErrorCode(HttpStatus.BAD_REQUEST.value());
	     error.setMessage(ex.getConstraintViolations()
	    		 			.stream().map(ConstraintViolation::getMessage)
	    		 			.collect(Collectors.joining(", ")));
	     return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
}
