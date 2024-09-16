package main.java.com.example.cabBooking;

import main.java.com.example.cabBooking.Controller.DriverController;
import main.java.com.example.cabBooking.Exceptions.NoAvailableDriversException;
import main.java.com.example.cabBooking.Exceptions.RideNotFoundException;
import main.java.com.example.cabBooking.Models.Driver;
import main.java.com.example.cabBooking.Models.Location;

import java.util.ArrayList;
import java.util.List;

public class RideManger {
    private DriverController driverController;
    private List<Driver> drivers;
    RideManger(DriverController driverController){
        this.driverController= driverController;
        this.drivers= driverController.getDriversList();
    }
    // Finds available rides for the user based on source and destination
    public List<Driver> findRide(String username, Location source, Location destination) {
        List<Driver> availableDrivers = new ArrayList<>();
        for (Driver driver : drivers) {
            if (driver.getIsAvailable() && Location.distance(driver.getCurrentLocation(), source) <= 5.0) {
                availableDrivers.add(driver);
            }
        }

        if (availableDrivers.isEmpty()) {
            throw new RideNotFoundException("No Ride found for the route.");
        } else {
            System.out.println("Available drivers:");
            for (Driver driver : availableDrivers) {
                System.out.println(driver.getName());
            }
        }
        return availableDrivers;
    }

    // Allows the user to choose a driver
    public void chooseRide(String username, String driverName) {
        for (Driver driver : drivers) {
            if (driver.getName().equals(driverName) && driver.getIsAvailable()) {
                driver.setIsAvailable(false);
                System.out.println(username + " chose ride with " + driverName);
                return;
            }
        }
        throw new NoAvailableDriversException("No available drivers found for the route");
    }

}
