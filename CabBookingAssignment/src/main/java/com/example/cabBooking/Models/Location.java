package main.java.com.example.cabBooking.Models;

public class Location {
    int x, y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Function to calculate distance between two locations
    public static double distance(Location l1, Location l2) {
        return Math.sqrt(Math.pow(l1.x - l2.x, 2) + Math.pow(l1.y - l2.y, 2));
    }

}
