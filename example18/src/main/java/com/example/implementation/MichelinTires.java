package com.example.implementation;

import com.example.interfaces.Tires;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTires implements Tires {

    @Override
    public String rotate() {
        return "Vehicle moving with the help of Michelin tires";
    }

    @Override
    public String stop() {
        return "Vehicle stopped with the help of Michelin tires";
    }
}
