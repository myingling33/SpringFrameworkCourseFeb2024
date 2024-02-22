package com.example.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

public class Person {

    public Person() {
        System.out.println("Person bean created by Spring");
    }

    private String name;
    private Vehicle vehicle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public static interface Speakers {
        public String makeSound();
    }

    @Component
    @Primary
    public static class SonySpeakers implements Speakers {

        @Override
        public String makeSound() {
            return "Playing music with Sony speakers";
        }
    }
}
