package com.example.services;

import com.example.interfaces.Speakers;
import com.example.interfaces.Tires;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class VehicleServices {

    @Autowired
    private Speakers speakers;
    private Tires tires;

    public VehicleServices() {
        System.out.println("VehicleServices object is created");
    }

    public void playMusic() {
        String music = speakers.makeSound();
        System.out.println(music);
    }

    public void moveVehicle() {
        String status = tires.rotate();
        System.out.println(status);
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tires getTires() {
        return tires;
    }

    @Autowired
    public void setTires(Tires tires) {
        this.tires = tires;
    }
}
