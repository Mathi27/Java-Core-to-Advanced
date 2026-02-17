package com.mathi27.marvel.app;

import com.mathi27.marvel.base.Vehicle;
import com.mathi27.marvel.vehicle.Car;

public class TestFieldHiding {

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.color);
        System.out.println(car.horsePower);
        System.out.println(car.turningRadius);
        System.out.println(car.isAutomatic);
        car.printCarDetails();

        Vehicle vehicle = car;
        System.out.println(vehicle.color);
        System.out.println(vehicle.horsePower);
        System.out.println(vehicle.turningRadius);

    }

}
