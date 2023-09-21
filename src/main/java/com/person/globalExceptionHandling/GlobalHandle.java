package com.person.globalExceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.person.customexception.NameNotFoundException;

@RestControllerAdvice
public class GlobalHandle {
@ExceptionHandler(NameNotFoundException.class)
public ResponseEntity<Object> handlingNameNotFound() {
	return new ResponseEntity<Object>("Name is Empty",HttpStatus.BAD_GATEWAY);
}
}
