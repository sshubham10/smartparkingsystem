// FILE: main/ParkingLot.java
package main;

/**
 * ParkingLot class managing multiple floors
 */
public class ParkingLot {
    private Floor[] floors;

    public ParkingLot(int maxFloors, int spotsPerFloor) {
        this.floors = new Floor[maxFloors];
        for (int i = 0; i < maxFloors; i++) {
            floors[i] = new Floor(i + 1, spotsPerFloor);
        }
    }

    /**
     * Adds a spot to a specific floor
     */
    public boolean addSpotToFloor(int floorNumber, ParkingSpot spot) {
        if (floorNumber < 1 || floorNumber > floors.length) return false;
        return floors[floorNumber - 1].addSpot(spot);
    }

    /**
     * Finds a free spot for specific vehicle type
     */
    public ParkingSpot findFreeSpotForVehicle(String vehicleType) {
        for (Floor floor : floors) {
            for (ParkingSpot spot : floor.getSpots()) {
                if (spot != null && spot.isFree() && spot.getSpotType().equalsIgnoreCase(vehicleType)) {
                    return spot;
                }
            }
        }
        return null;
    }

    /**
     * Finds a spot by its ID across all floors
     */
    public ParkingSpot findSpot(String spotId) {
        for (Floor f : floors) {
            ParkingSpot p = f.findSpotById(spotId);
            if (p != null) return p;
        }
        return null;
    }

    public Floor[] getFloors() { 
        return floors; 
    }
}