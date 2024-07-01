package com.app.factorymethod.models;

import com.app.factorymethod.Vehicle;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("--> Run car!!");
    }

    @Override
    public void stop() {
        System.out.println("--> Stop car!!");
    }
}
