package com.example.services;

import com.example.interfaces.Speakers;
import com.example.interfaces.Tires;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {

    @Autowired
    private Speakers speakers;
    private Tires tires;

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
