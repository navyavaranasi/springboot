package com.infy.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.infy.dto.*;

@RestControllerAdvice
public class ExceptionControllerAdvice {
     @ExceptionHandler(Exception.class)
     public String exceptionHandler(Exception e) {
    	 return e.getMessage();
     }
     
     @ExceptionHandler(NoSuchEmpException.class)
     public ResponseEntity<ErrorMessage> exceptionHandler2(NoSuchEmpException e2){
    	 ErrorMessage err=new ErrorMessage();
     	 err.setErrorCode(HttpStatus.BAD_REQUEST.value());
    	 err.setMessage(e2.getMessage());
    	 return new ResponseEntity<>(err,HttpStatus.OK);
     }
}
