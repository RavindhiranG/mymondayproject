package com.mymondayproject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandling {
	
	@ExceptionHandler(value = NoAgeException.class)
	public ResponseEntity<Object> ageException(NoAgeException a) {
		return new ResponseEntity <> (a.getMessage(), HttpStatus.NOT_FOUND);
	}

}
