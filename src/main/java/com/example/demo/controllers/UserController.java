package com.example.demo.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

//this controller allows us to direct data between the models and the views(templates) 

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.models.User;
import com.example.demo.models.UserRepository;

import jakarta.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {

    @Autowired
    private UserRepository userRepo;
    // getmapping allows us to add an endpoint to our application
    //            endpoint
    //               |
    //               v
    @GetMapping("/users/view")

    // GetMapping will now tied to a function
    public String getAllUsers(Model model){
        System.out.println("Getting all users");
        //get all users from the database

        // l=this list will be from Java util
        //arraylist will also be from Java util
        // List<User> users = new ArrayList<>();
        // users.add(new User("bobby","1234", 25));
        // users.add(new User("sara", "1234", 15));
        // users.add(new User("Steve","1234",35));
        // users.add(new User("Jacob", "1234", 5));


        //get all users from the database
        List<User> users =userRepo.findAll();


        // end of database call
        model.addAttribute("us", users);

        // passing it of to a view
        return "users/showAll";

    }

    @PostMapping("/users/add")
    public String addUser(@RequestParam Map<String, String> newuser, HttpServletResponse response){
        System.out.println("ADD user");
        String newName = newuser.get("name");
        String newPwd = newuser.get("password");
        int newSize = Integer.parseInt(newuser.get("size"));
        userRepo.save(new User(newName, newPwd, newSize));
        response.setStatus(201);

        
         return "users/addedUser";
    }
    


    
    
}
