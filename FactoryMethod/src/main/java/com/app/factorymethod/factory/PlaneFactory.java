package com.app.factorymethod.factory;

import com.app.factorymethod.Vehicle;
import com.app.factorymethod.models.Plane;

public class PlaneFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Plane();
    }
}
