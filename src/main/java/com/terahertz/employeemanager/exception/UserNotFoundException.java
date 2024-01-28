package com.terahertz.employeemanager.exception;


//creating exception
public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message){
        super(message);
    }
}
