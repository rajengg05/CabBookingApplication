package main.java.com.example.cabBooking.Exceptions;

public class DuplicateDriverException extends RuntimeException {
    public DuplicateDriverException(String message) {
        super(message);
    }
}

