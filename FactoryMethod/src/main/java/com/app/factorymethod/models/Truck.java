package com.app.factorymethod.models;

import com.app.factorymethod.Vehicle;

public class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("--> Run Truck!!");
    }

    @Override
    public void stop() {
        System.out.println("--> Stop Truck!!");
    }
}
