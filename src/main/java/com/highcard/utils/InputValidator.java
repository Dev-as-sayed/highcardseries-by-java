// ==============================
// File: InputValidator.java
// Path: src/main/java/com/highcard/utils/InputValidator.java
// ==============================

package com.highcard.utils;

public class InputValidator {

    /**
     * Validate player count
     * Allowed: 2 - 5
     */
    public static boolean isValidPlayerCount(int playerCount) {
        return playerCount >= 2 && playerCount <= 5;
    }

    /**
     * Validate round count
     * Allowed: 5 - 10
     */
    public static boolean isValidRoundCount(int roundCount) {
        return roundCount >= 5 && roundCount <= 10;
    }

    /**
     * Validate card replacement count
     * Allowed: 1 - 2
     */
    public static boolean isValidReplacementCount(int replacementCount) {
        return replacementCount >= 1 && replacementCount <= 2;
    }

    /**
     * Validate player name
     */
    public static boolean isValidPlayerName(String name) {
        return name != null && !name.trim().isEmpty();
    }
}