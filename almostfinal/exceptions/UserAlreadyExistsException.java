// FILE: exceptions/UserAlreadyExistsException.java
package exceptions;

/**
 * Exception thrown when attempting to register a username that already exists
 */
public class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}