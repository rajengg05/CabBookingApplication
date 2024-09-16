package main.java.com.example.cabBooking.Controller;

import main.java.com.example.cabBooking.Models.User;

import java.util.ArrayList;
import java.util.List;

public class UserControllerImpl implements UserController{
    private List<User> users;

    public UserControllerImpl(){
        users= new ArrayList<>();
    }
    @Override
    public void addUser(String userDetails) {
        String[] details = userDetails.split(",");
        users.add(new User(details[0].trim(), details[1].trim(), Integer.parseInt(details[2].trim())));
        System.out.println("User " + details[0] + " added.");
    }
}
