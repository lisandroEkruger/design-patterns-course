package com.app.factorymethod.factory;

import com.app.factorymethod.Vehicle;
import com.app.factorymethod.models.Car;

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
