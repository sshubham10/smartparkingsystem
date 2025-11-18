// FILE: main/Customer.java
package main;

import util.Constants;
import java.util.Arrays;

/**
 * Customer user class
 * Demonstrates: Hierarchical inheritance, Multiple inheritance
 * Simplified: Removed nested non-static Preferences class
 */
public class Customer extends User {
    private String[] vehiclePlates;
    private int vehicleCount;
    private Account account;
    
    // Removed nested Preferences class for simplicity

    /**
     * Constructor with basic details
     * Demonstrates constructor overloading
     */
    public Customer(String username, String password, String name) {
        super(username, password, name, Constants.ROLE_CUSTOMER);
        this.vehiclePlates = new String[5];
        this.vehicleCount = 0;
        this.account = new Account(username, 0.0);
    }

    /**
     * Constructor with initial balance
     * Demonstrates constructor overloading
     */
    public Customer(String username, String password, String name,double initialBalance) {
        super(username, password, name, Constants.ROLE_CUSTOMER);
        this.vehiclePlates = new String[5];
        this.vehicleCount = 0;
        this.account = new Account(username, initialBalance);
    }

    @Override
    public void showDashboard() {
        System.out.println("--- Customer Dashboard for " + name + " ---");
        System.out.println("Registered vehicles:");
        for (int i = 0; i < vehicleCount; i++) {
            System.out.println((i + 1) + ". " + vehiclePlates[i]);
        }
        System.out.println("Account balance: ₹" + account.getBalance());
        // Removed preferences display
    }

    public void addVehicle(String plate) {
        if (vehicleCount >= vehiclePlates.length) {
            throw new IllegalStateException("Max vehicles reached");
        }
        vehiclePlates[vehicleCount++] = plate;
    }

    public String[] getVehiclePlates() {
        return Arrays.copyOf(vehiclePlates, vehicleCount);
    }

    public Account getAccount() {
        return account;
    }
    
    // Removed getPreferences()

}