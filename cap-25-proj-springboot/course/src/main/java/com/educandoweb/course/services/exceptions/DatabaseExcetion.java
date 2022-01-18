package com.educandoweb.course.services.exceptions;

public class DatabaseExcetion extends RuntimeException{
    public DatabaseExcetion(String msg){
        super(msg);
    }
}
