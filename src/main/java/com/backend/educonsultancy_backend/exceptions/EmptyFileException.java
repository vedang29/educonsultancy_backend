package com.backend.educonsultancy_backend.exceptions;

public class EmptyFileException extends Throwable{
    public EmptyFileException(String message){
        super(message);
    }
}