// FILE: exceptions/SlotUnavailableException.java
package exceptions;

/**
 * Exception thrown when a parking slot is not available
 */
public class SlotUnavailableException extends Exception {
    public SlotUnavailableException(String message) {
        super(message);
    }
}