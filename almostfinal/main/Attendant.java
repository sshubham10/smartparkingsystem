// FILE: main/Attendant.java
package main;

import util.Constants;


/**
 * Attendant user class
 * Demonstrates: Hierarchical inheritance, Multiple inheritance
 */
public class Attendant extends User {
    private int vehiclesProcessed = 0;

    public Attendant(String username, String password, String name) {
        super(username, password, name, Constants.ROLE_ATTENDANT);
    }

    @Override
    public void showDashboard() {
        System.out.println("--- Attendant Dashboard: " + name + " ---");
        System.out.println("Vehicles processed today: " + vehiclesProcessed);
        System.out.println("Ready to process vehicle entry and exit.");
    }
    
    public void incrementProcessed() {
        vehiclesProcessed++;
    }
    
    public int getVehiclesProcessed() {
        return vehiclesProcessed;
    }
    
}