package com.OptimisticChemicalMakers.MapFood.controllers;

import com.OptimisticChemicalMakers.MapFood.models.User;
import com.OptimisticChemicalMakers.MapFood.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    // Properties

    private UserRepository userRepository;

    // Constructors

    public UserController(UserRepository userRepository) {

        this.userRepository = userRepository;

    }

    // Methods (Actions)

    // GET /users
    // Return all users persisted on the database
    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json")
    public Iterable<User> getUsers() {

        return userRepository.findAll();

    }

}
