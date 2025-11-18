// FILE: main/Account.java
package main;

import exceptions.InsufficientFundsException;
import util.PaymentGateway;

/**
 * Account class for managing customer balance and payments
 * Demonstrates: Interface implementation (PaymentGateway)
 * Uses wrapper class (Double) for balance
 */
public class Account implements PaymentGateway {
    private Double balance; // Wrapper class usage
    private String ownerUsername;

    /**
     * Constructor with initial balance
     * Demonstrates constructor overloading
     */
    public Account(String ownerUsername, double initialBalance) {
        this.ownerUsername = ownerUsername;
        this.balance = Double.valueOf(initialBalance); // Boxing
    }

    /**
     * Constructor with zero balance
     * Demonstrates constructor overloading
     */
    public Account(String ownerUsername) {
        this(ownerUsername, 0.0);
    }

    /**
     * Deposits money into the account
     */
    public void deposit(double amount) {
        balance = Double.valueOf(balance.doubleValue() + amount); // Unboxing and boxing
        System.out.println("[Account] " + ownerUsername + " deposited " + amount);
    }

    /**
     * Withdraws money from the account
     * @throws InsufficientFundsException if balance is insufficient
     */
    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance.doubleValue() < amount) { // Unboxing
            throw new InsufficientFundsException("Insufficient funds for user: " + ownerUsername);
        }
        balance = Double.valueOf(balance.doubleValue() - amount); // Unboxing and boxing
    }

    /**
     * Implementation of PaymentGateway interface
     */
    @Override
    public boolean processPayment(String username, double amount) {
        if (!username.equals(ownerUsername)) {
            System.out.println("Wrong account user: " + username);
            return false;
        }
        try {
            withdraw(amount);
            System.out.println("[Account] " + ownerUsername + " paid " + amount);
            return true;
        } catch (InsufficientFundsException e) {
            return false;
        }
    }

    public Double getBalance() {
        return balance;
    }

    public String getOwnerUsername() {
        return ownerUsername;
    }
}