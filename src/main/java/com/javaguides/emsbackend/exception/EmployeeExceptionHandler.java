package com.javaguides.emsbackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeExceptionHandler {

    @ExceptionHandler(value = {ResourceNotFoundException.class, })
    public ResponseEntity<Object> handleEmployeeNotFoundException(ResourceNotFoundException resourceNotFoundException){
        EmployeeException employeeException = new EmployeeException(
                resourceNotFoundException.getMessage(),
                resourceNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );

        return  new ResponseEntity<>(employeeException, HttpStatus.NOT_FOUND);
    }
}
