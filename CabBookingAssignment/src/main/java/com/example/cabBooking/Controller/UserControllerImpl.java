package main.java.com.example.cabBooking.Controller;

import main.java.com.example.cabBooking.Exceptions.DuplicateUserException;
import main.java.com.example.cabBooking.Models.User;

import java.util.ArrayList;
import java.util.List;

public class UserControllerImpl implements UserController{
    private List<User> users;
    private List<String> userNames;
    public UserControllerImpl(){
        users= new ArrayList<>();
        userNames=new ArrayList<>();
    }
    @Override
    public void addUser(String userDetails) {
        String[] details = userDetails.split(",");
        if(userNames.contains(details[0].trim())){
            throw new DuplicateUserException("User already exists");
        }
        users.add(new User(details[0].trim(), details[1].trim(), Integer.parseInt(details[2].trim())));
        userNames.add(details[0].trim());
        System.out.println("User " + details[0] + " added.");
    }
}
