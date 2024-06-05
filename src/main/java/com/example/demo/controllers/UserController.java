package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

//this controller allows us to direct data between the models and the views(templates) 

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.models.Users;

@Controller
public class UserController {

    // getmapping allows us to add an endpoint to our application
    //            endpoint
    //               |
    //               v
    @GetMapping("/users/view")

    // GetMapping will now tied to a function
    public String getAllUsers(Model model){
        System.out.println("Getting all users");
        //TODO: get all users from the database

        // l=this list will be from Java util
        //arraylist will also be from Java util
        List<Users> users = new ArrayList<>();
        users.add(new Users("bobby","1234", 25));
        users.add(new Users("sara", "1234", 15));
        users.add(new Users("Steve","1234",35));
        users.add(new Users("Jacob", "1234", 5));

        // end of database call
        model.addAttribute("us", users);

        // passing it of to a view
        return "users/showAll";

    }


    
    
}
