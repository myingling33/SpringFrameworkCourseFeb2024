package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "personBean") // create a bean from Person Java class
public class Person {

    private String name = "Lucy";
    private final Vehicle vehicle;

    @Autowired // optional since there is only 1 constructor
    public Person(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    // because vehicle is set to be final, don't need a setter method.

}
