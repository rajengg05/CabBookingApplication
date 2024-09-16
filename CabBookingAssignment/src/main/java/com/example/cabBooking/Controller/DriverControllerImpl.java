package main.java.com.example.cabBooking.Controller;

import main.java.com.example.cabBooking.Exceptions.DuplicateDriverException;
import main.java.com.example.cabBooking.Models.Driver;
import main.java.com.example.cabBooking.Models.Location;

import java.util.ArrayList;
import java.util.List;

public class DriverControllerImpl implements DriverController{
    private List<Driver> drivers;
    private List<String> driverNames;
    public DriverControllerImpl(){
      drivers= new ArrayList<>();
      driverNames= new ArrayList<>();
    }
    @Override
    public void addDriver(String driverDetails, String vehicleDetails, Location location) {
        String[] details = driverDetails.split(",");
        String[] vehicle = vehicleDetails.split(",");
        if(driverNames.contains(details[0].trim())){
            throw new DuplicateDriverException("Driver already exists");
        }
        drivers.add(new Driver(details[0].trim(), details[1].trim(), Integer.parseInt(details[2].trim()),
                vehicle[0].trim(), vehicle[1].trim(), location));
        driverNames.add(details[0].trim());
        System.out.println("Driver " + details[0] + " added.");
    }

    @Override
    public List<Driver> getDriversList() {
        return drivers;
    }
}
