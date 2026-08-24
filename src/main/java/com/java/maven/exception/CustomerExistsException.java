package com.java.maven.exception;

public class CustomerExistsException extends RuntimeException {
    public CustomerExistsException(String message) {
        super(message);
    }
}
