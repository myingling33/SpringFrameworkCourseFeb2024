package com.example.implementation;

import com.example.interfaces.Tires;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTires implements Tires {

    @Override
    public String rotate() {
        return "Vehicle moving with the help of BridgeStone tires";
    }

    @Override
    public String stop() {
        return "Vehicle stopped with the help of BridgeStone tires";
    }
}
