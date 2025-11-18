// FILE: main/Floor.java
package main;

/**
 * Floor class representing a floor in the parking lot
 */
public class Floor {
    private int floorNumber;
    private ParkingSpot[] spots;
    private int spotCount;

    public Floor(int floorNumber, int capacity) {
        this.floorNumber = floorNumber;
        this.spots = new ParkingSpot[capacity];
        this.spotCount = 0;
    }

    /**
     * Adds a spot to this floor
     */
    public boolean addSpot(ParkingSpot spot) {
        if (spotCount >= spots.length) {
            return false;
        }
        spots[spotCount++] = spot;
        return true;
    }

    /**
     * Finds a spot by its ID
     */
    public ParkingSpot findSpotById(String spotId) {
        for (int i = 0; i < spotCount; i++) {
            if (spots[i] != null && spots[i].getSpotId().equals(spotId)) {
                return spots[i];
            }
        }
        return null;
    }

    /**
     * Finds first free spot of given type
     */
    public ParkingSpot findFirstFreeSpotForType(String spotType) {
        for (int i = 0; i < spotCount; i++) {
            if (spots[i] != null && spots[i].getSpotType().equals(spotType) && spots[i].isFree()) {
                return spots[i];
            }
        }
        return null;
    }

    public ParkingSpot[] getSpots() {
        return spots;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}