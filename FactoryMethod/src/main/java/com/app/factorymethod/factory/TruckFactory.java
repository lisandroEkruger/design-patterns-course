package com.app.factorymethod.factory;

import com.app.factorymethod.Vehicle;
import com.app.factorymethod.models.Truck;

public class TruckFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}
