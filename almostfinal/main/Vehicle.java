// FILE: main/Vehicle.java
package main;

/**
 * Abstract base class for all vehicle types
 * Demonstrates abstract class and hierarchical inheritance
 */
public abstract class Vehicle {
    protected String licensePlate;
    protected String ownerUsername;
    protected String vehicleType;

    public Vehicle(String licensePlate, String ownerUsername, String vehicleType) {
        this.licensePlate = licensePlate;
        this.ownerUsername = ownerUsername;
        this.vehicleType = vehicleType;
    }

    public String getLicensePlate() { 
        return licensePlate; 
    }
    
    public String getOwnerUsername() { 
        return ownerUsername; 
    }
    
    public String getVehicleType() { 
        return vehicleType; 
    }
}