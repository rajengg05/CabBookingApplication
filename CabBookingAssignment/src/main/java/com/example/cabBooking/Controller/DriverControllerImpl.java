package main.java.com.example.cabBooking.Controller;

import main.java.com.example.cabBooking.Models.Driver;
import main.java.com.example.cabBooking.Models.Location;

import java.util.ArrayList;
import java.util.List;

public class DriverControllerImpl implements DriverController{
    private List<Driver> drivers;

    public DriverControllerImpl(){
      drivers= new ArrayList<>();
    }
    @Override
    public void addDriver(String driverDetails, String vehicleDetails, Location location) {
        String[] details = driverDetails.split(",");
        String[] vehicle = vehicleDetails.split(",");
        drivers.add(new Driver(details[0].trim(), details[1].trim(), Integer.parseInt(details[2].trim()),
                vehicle[0].trim(), vehicle[1].trim(), location));
        System.out.println("Driver " + details[0] + " added.");
    }

    @Override
    public List<Driver> getDriversList() {
        return drivers;
    }
}
