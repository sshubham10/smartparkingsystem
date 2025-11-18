// FILE: main/Admin.java
package main;

import util.*;
import service.ParkingSystem;

/**
 * Admin user class with multiple interface implementation
 * Demonstrates: Hierarchical inheritance, Multiple inheritance (4 interfaces)
 * Implements: Reportable, Loggable, Notifiable, Auditable
 */
public class Admin extends User implements Reportable, Loggable{
    private String[] auditLogs = new String[500];
    private int logCount = 0;
    private ParkingSystem system;
    
    /**
     * NESTED STATIC CLASS: Configuration settings for Admin
     * Demonstrates nested static class requirement
     */
    public static class AdminConfig {
        private final String department;
        private final int accessLevel;
        private final boolean canModifyRates;
        
        public AdminConfig(String department, int accessLevel, boolean canModifyRates) {
            this.department = department;
            this.accessLevel = accessLevel;
            this.canModifyRates = canModifyRates;
        }
        
        public String getDepartment() { return department; }
        public int getAccessLevel() { return accessLevel; }
        public boolean canModifyRates() { return canModifyRates; }
        
        @Override
        public String toString() {
            return String.format("AdminConfig[dept=%s, level=%d, canModify=%b]", 
                                 department, accessLevel, canModifyRates);
        }
    }
    


    public Admin(String username, String password, String name) {
        super(username, password, name, Constants.ROLE_ADMIN);
    }
    
    public void setSystem(ParkingSystem system) {
        this.system = system;
    }



    @Override
    public void showDashboard() {
        System.out.println("--- Admin Dashboard for " + name + " ---");
       
    }

    // Implementation of Reportable interface
    @Override
    public String generateReport() {
        if (system == null) {
            return "Report (stub): System not linked.";
        }
        return system.generateSystemReport();
    }

    // Implementation of Loggable interface
    @Override
    public void logActivity(String message, Object... args) {
        String m = String.format(message, args);
        if (logCount < auditLogs.length) {
            auditLogs[logCount++] = m;
        }
        System.out.println("[ADMIN] " + m);
    }
    
    /**
     * VARARG OVERLOADING #1: Add spots with floor number
     * Demonstrates varargs method overloading
     */
    public void addSpots(int floorNumber, String... spotIds) {
        logActivity("Add %d spots to floor %d", spotIds.length, floorNumber);
        System.out.println("Adding " + spotIds.length + " spots to floor " + floorNumber);
    }
    
    /**
     * VARARG OVERLOADING #2: Add spots with floor number and spot type
     * Demonstrates varargs method overloading
     */
    public void addSpots(int floorNumber, String spotType, String... spotIds) {
        logActivity("Add %d %s spots to floor %d", spotIds.length, spotType, floorNumber);
        System.out.println("Adding " + spotIds.length + " " + spotType + " spots to floor " + floorNumber);
    }

    

    

}