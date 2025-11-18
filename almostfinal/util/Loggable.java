// FILE: util/Loggable.java
package util;

/**
 * Interface for logging activity messages with optional parameters
 * Demonstrates varargs usage in interface
 */
public interface Loggable {
    /**
     * Logs an activity message
     * @param message The log message (can include format specifiers)
     * @param args Optional arguments to fill into the message (varargs)
     */
    void logActivity(String message, Object... args);
}