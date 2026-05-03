// ==============================
// File: EmptyDeckException.java
// Path: src/main/java/com/highcard/exceptions/EmptyDeckException.java
// ==============================

package com.highcard.exceptions;

public class EmptyDeckException extends Exception {

    /**
     * Default constructor
     */
    public EmptyDeckException() {
        super("Deck is empty.");
    }

    /**
     * Custom message constructor
     */
    public EmptyDeckException(String message) {
        super(message);
    }
}