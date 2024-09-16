package main.java.com.example.cabBooking.Exceptions;

public class RideAlreadyChosenException extends RuntimeException {
    public RideAlreadyChosenException(String message) {
        super(message);
    }
}

