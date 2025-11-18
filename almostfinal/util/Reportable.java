// FILE: util/Reportable.java
package util;

/**
 * Interface for generating text-based reports
 * Implemented by Admin class
 */
public interface Reportable {
    /**
     * Generates a report and returns it as a String
     * @return Report text
     */
    String generateReport();
}