package main.java.com.example.cabBooking;

import main.java.com.example.cabBooking.Controller.DriverController;
import main.java.com.example.cabBooking.Controller.DriverControllerImpl;
import main.java.com.example.cabBooking.Controller.UserController;
import main.java.com.example.cabBooking.Controller.UserControllerImpl;
import main.java.com.example.cabBooking.Models.Driver;
import main.java.com.example.cabBooking.Models.Location;

import java.util.List;

public class CabBookingApplicationLoader {
    public static void main(String[] args) {
        DriverController driverController= new DriverControllerImpl();
        UserController userController= new UserControllerImpl();
        RideManger rideManager = new RideManger(driverController);

        // Onboard users

        userController.addUser("Abhishek, M, 23");
        userController.addUser("Rahul, M, 29");
        userController.addUser("Nandini, F, 22");

        // Onboard drivers
        driverController.addDriver("Driver1, M, 22", "Swift, KA-01-12345", new Location(10, 1));
        driverController.addDriver("Driver2, M, 29", "Swift, KA-01-12345", new Location(11, 10));
        driverController.addDriver("Driver3, M, 24", "Swift, KA-01-12345", new Location(5, 3));

        // Find and book rides
        rideManager.findRide("Abhishek", new Location(0, 0), new Location(20, 1)); // No ride found
        List<Driver> availableRides = rideManager.findRide("Rahul", new Location(10, 0), new Location(15, 3)); // Driver1 found
        if (!availableRides.isEmpty()) {
            rideManager.chooseRide("Rahul", availableRides.get(0).getName()); // Rahul chooses Driver1
        }

        rideManager.findRide("Nandini", new Location(15, 6), new Location(20, 4)); // No ride found
    }

}
