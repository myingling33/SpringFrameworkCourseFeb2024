package com.example.implementation;

import com.example.interfaces.Tires;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTires implements Tires {

    public String rotate() {
        return "Vehicle moving with BridgeStone tires";
    }
}
