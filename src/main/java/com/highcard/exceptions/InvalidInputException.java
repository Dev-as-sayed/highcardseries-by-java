// ==============================
// File: InvalidInputException.java
// Path: src/main/java/com/highcard/exceptions/InvalidInputException.java
// ==============================

package com.highcard.exceptions;

public class InvalidInputException extends Exception {

    /**
     * Default constructor
     */
    public InvalidInputException() {
        super("Invalid input provided.");
    }

    /**
     * Custom message constructor
     */
    public InvalidInputException(String message) {
        super(message);
    }
}