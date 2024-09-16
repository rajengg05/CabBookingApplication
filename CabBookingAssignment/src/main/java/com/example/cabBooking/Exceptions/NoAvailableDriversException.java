package main.java.com.example.cabBooking.Exceptions;

public class NoAvailableDriversException extends RuntimeException {
    public NoAvailableDriversException(String message) {
        super(message);
    }
}

