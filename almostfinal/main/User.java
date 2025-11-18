// FILE: main/User.java
package main;

/**
 * Abstract base class for all user types
 * Demonstrates abstract class and hierarchical inheritance
 */
public abstract class User {
    protected String username;
    protected String password; // Changed from hashedPassword
    protected String name;
    protected String role;

    /**
     * Constructor with username and password only
     * Demonstrates constructor overloading
     */
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Full constructor with all user details
     * Demonstrates constructor overloading
     */
    public User(String username, String password, String name, String role) {
        this.username = username;
        this.password = password;
        this.name = name;
      
        this.role = role;
    }

    /**
     * Abstract method to be implemented by subclasses
     * Forces all users to have a dashboard
     */
    public abstract void showDashboard();

    /**
     * Checks if provided password matches the stored password
     */
    public boolean checkPassword(String password) {
        // Simplified password check
        return this.password.equals(password);
    }

    public String getUsername() { return username; }
    public String getRole() { return role; }
    public String getName() { return name; }
    public String getPassword() { return password; } // Renamed from getHashedPassword
   
}