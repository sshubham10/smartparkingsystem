// FILE: main/Motorcycle.java
package main;

import util.Constants;

/**
 * Motorcycle vehicle class
 * Demonstrates hierarchical inheritance from Vehicle
 */
public class Motorcycle extends Vehicle {
    public Motorcycle(String licensePlate, String ownerUsername) {
        super(licensePlate, ownerUsername, Constants.VEHICLE_MOTORCYCLE);
    }
}