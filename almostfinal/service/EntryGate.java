// FILE: service/EntryGate.java
package service;

import main.ParkingTicket;
import exceptions.SlotUnavailableException;

/**
 * Entry gate for processing vehicle entries
 */
public class EntryGate {
    private ParkingSystem system;

    public EntryGate(ParkingSystem system) {
        this.system = system;
    }

    public ParkingTicket processEntry(String username, String vehicleLicense, String vehicleType, String bookingId) throws SlotUnavailableException {
        return system.markEntry(username, vehicleLicense, vehicleType, bookingId);
    }
}