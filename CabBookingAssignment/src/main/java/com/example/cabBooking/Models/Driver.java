package main.java.com.example.cabBooking.Models;

public class Driver {
    String name;
    String gender;
    int age;
    String vehicle;
    String vehicleNumber;
    Location currentLocation;
    boolean isAvailable;

    public Driver(String name, String gender, int age, String vehicle, String vehicleNumber, Location location) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.vehicle = vehicle;
        this.vehicleNumber = vehicleNumber;
        this.currentLocation = location;
        this.isAvailable = true;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
    public String getVehicle(){
        return vehicle;
    }
    public String getVehicleNumber(){
        return vehicleNumber;
    }
    public Location getCurrentLocation(){
        return currentLocation;
    }
    public boolean getIsAvailable(){
        return isAvailable;
    }
    public void setIsAvailable(boolean isAvailable){
        this.isAvailable= isAvailable;
    }
}
