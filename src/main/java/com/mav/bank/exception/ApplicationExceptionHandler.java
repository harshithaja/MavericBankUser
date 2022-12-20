package com.mav.bank.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mav.bank.entity.ApplicationError;



@ControllerAdvice
public class ApplicationExceptionHandler 
{
	
	@ExceptionHandler({UserNotFoundException.class})
	public ResponseEntity<ApplicationError> handleException(UserNotFoundException e)
	{
		ApplicationError error = new ApplicationError(e.getMessage(), HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(error, error.getHttpstatus());	
	}
	
	@ExceptionHandler({MethodArgumentNotValidException.class})
	public ResponseEntity<ApplicationError> handleInvalidRequestException(MethodArgumentNotValidException e) 
	{
        ApplicationError error = new ApplicationError(e.getBindingResult().getFieldError().getField() + " " + e.getBindingResult().getFieldError().getDefaultMessage(), HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(error, error.getHttpstatus());
    }
	
    @ExceptionHandler({Exception.class})
	public ResponseEntity<ApplicationError> handleAllOtherException(Exception e) 
    {
        ApplicationError error = new ApplicationError(e.getLocalizedMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(error, error.getHttpstatus());
    }

}
