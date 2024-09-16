package main.java.com.example.cabBooking.Exceptions;

public class InvalidLocationException extends RuntimeException {
    public InvalidLocationException(String message) {
        super(message);
    }
}

