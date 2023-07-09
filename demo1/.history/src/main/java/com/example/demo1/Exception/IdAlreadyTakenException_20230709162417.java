package com.example.demo1.Exception;

public class IdAlreadyTakenException extends RuntimeException {
    public IdAlreadyTakenException(String message) {
        super(message);
    }
}
