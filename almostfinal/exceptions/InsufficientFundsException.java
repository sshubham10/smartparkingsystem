// FILE: exceptions/InsufficientFundsException.java
package exceptions;

/**
 * Exception thrown when a customer has insufficient funds for payment
 */
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}