package main.java.com.example.cabBooking.Controller;

import main.java.com.example.cabBooking.Models.Driver;
import main.java.com.example.cabBooking.Models.Location;

import java.util.List;

public interface DriverController {
    public void addDriver(String driverDetails, String vehicleDetails, Location location);
    public List<Driver> getDriversList();
    //can add more methods here
}
