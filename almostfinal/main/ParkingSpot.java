// FILE: main/ParkingSpot.java
package main;

import util.Constants;

/**
 * ParkingSpot class representing individual parking spots
 * Demonstrates constructor overloading
 */
public class ParkingSpot {
    private String spotId;
    private String spotType;
    private String status;
    private String currentVehicleLicense;

    /**
     * Constructor with spot ID only (defaults to CAR type)
     * Demonstrates constructor overloading
     */
    public ParkingSpot(String spotId) {
        this.spotId = spotId;
        this.spotType = Constants.VEHICLE_CAR;
        this.status = Constants.SPOT_FREE;
        this.currentVehicleLicense = "";
    }

    /**
     * Constructor with spot ID and type
     * Demonstrates constructor overloading
     */
    public ParkingSpot(String spotId, String spotType) {
        this.spotId = spotId;
        this.spotType = spotType;
        this.status = Constants.SPOT_FREE;
        this.currentVehicleLicense = "";
    }

    /**
     * Marks spot as occupied by a vehicle
     */
    public boolean occupy(String vehicleLicense) {
        if (!status.equals(Constants.SPOT_FREE) && !status.equals(Constants.SPOT_RESERVED)) {
            return false;
        }
        this.currentVehicleLicense = vehicleLicense;
        this.status = Constants.SPOT_OCCUPIED;
        return true;
    }

    /**
     * Marks spot as vacant
     */
    public boolean vacate() {
        if (!status.equals(Constants.SPOT_OCCUPIED)) {
            return false;
        }
        this.currentVehicleLicense = "";
        this.status = Constants.SPOT_FREE;
        return true;
    }

    /**
     * Reserves the spot for a user
     */
    public boolean reserve(String username) {
        if (!status.equals(Constants.SPOT_FREE)) {
            return false;
        }
        this.status = Constants.SPOT_RESERVED;
        return true;
    }

    public boolean isFree() {
        return status.equals(Constants.SPOT_FREE);
    }

    public String getSpotId() {
        return spotId;
    }

    public String getStatus() {
        return status;
    }

    public String getCurrentVehicleLicense() {
        return currentVehicleLicense;
    }

    public void forceFree() {
        this.status = Constants.SPOT_FREE;
        this.currentVehicleLicense = "";
    }

    public String getSpotType() {
        return spotType;
    }
}