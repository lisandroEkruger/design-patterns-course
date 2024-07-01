package com.app.factorymethod.models;

import com.app.factorymethod.Vehicle;

public class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("--> Run Motorcycle!!");
    }

    @Override
    public void stop() {
        System.out.println("--> Stop Motorcycle!!");
    }
}
