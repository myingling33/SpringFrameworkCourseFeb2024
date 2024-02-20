package com.example.config;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Toyota");
        return vehicle;
    }

    /*
    Here in the below code, we are trying to wire or establish a relationship
    between Person and Vehicle, by passing the vehicle as a method parameter to the
    person() bean method.

    Spring injects the vehicle bean to the person bean using DI. Spring will make sure
    to have only 1 vehicle bean created and that the vehicle bean will be created first
    since the person bean has a dependency to it.
     */

    @Bean
    public Person person(Vehicle vehicle) {
        Person person = new Person();
        person.setName("Lucy");
        person.setVehicle(vehicle);
        return person;
    }
}
