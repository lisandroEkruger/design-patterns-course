package com.app.factorymethod.factory;

import com.app.factorymethod.Vehicle;
import com.app.factorymethod.models.Motorcycle;

public class MotorcycleFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
}
