package com.app.factorymethod;

import com.app.factorymethod.factory.CarFactory;
import com.app.factorymethod.factory.MotorcycleFactory;
import com.app.factorymethod.factory.PlaneFactory;
import com.app.factorymethod.factory.TruckFactory;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new CarFactory().createVehicle();
        Vehicle truck = new TruckFactory().createVehicle();
        Vehicle plane = new PlaneFactory().createVehicle();
        Vehicle motorcycle = new MotorcycleFactory().createVehicle();

        car.start();
        truck.start();
        plane.start();
        motorcycle.start();
    }
}
