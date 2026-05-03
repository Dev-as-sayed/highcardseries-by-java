// ==============================
// File: InvalidCardException.java
// Path: src/main/java/com/highcard/exceptions/InvalidCardException.java
// ==============================

package com.highcard.exceptions;

public class InvalidCardException extends Exception {

    /**
     * Default constructor
     */
    public InvalidCardException() {
        super("Invalid card detected.");
    }

    /**
     * Custom message constructor
     */
    public InvalidCardException(String message) {
        super(message);
    }
}