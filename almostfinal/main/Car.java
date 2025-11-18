// FILE: main/Car.java
package main;

import util.Constants;

/**
 * Car vehicle class
 * Demonstrates hierarchical inheritance from Vehicle
 */
public class Car extends Vehicle {
    public Car(String licensePlate, String ownerUsername) {
        super(licensePlate, ownerUsername, Constants.VEHICLE_CAR);
    }
}