package com.mav.bank.exception;

public class UserNotFoundException extends RuntimeException
{

	public UserNotFoundException(String message) 
    {
        super(message);
    }

}
