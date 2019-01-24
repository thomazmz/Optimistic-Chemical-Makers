package com.OptimisticChemicalMakers.MapFood.models;

import javax.persistence.*;

@Entity
public class User {

    // Properties

    @Id                                                 // It tells the JPA that it is an ID
    @GeneratedValue(strategy = GenerationType.AUTO)     // It tells the JPA how to autogenerate the ID value
    private Long id;

    private String name;

    private String email;

    // Constructors

    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Get Methods

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Set Methods

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}