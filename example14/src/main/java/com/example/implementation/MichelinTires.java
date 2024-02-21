package com.example.implementation;

import com.example.interfaces.Tires;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTires implements Tires {
    public String rotate() {
        return "Vehicle moving with Michelin tires";
    }
}
