// ==============================
// File: CardComparator.java
// Path: src/main/java/com/highcard/utils/CardComparator.java
// ==============================

package com.highcard.utils;

import com.highcard.models.Card;

public class CardComparator {

    /**
     * Compare two cards by rank
     *
     * Returns:
     * positive -> first higher
     * negative -> second higher
     * zero -> equal
     */
    public static int compare(Card firstCard, Card secondCard) {

        return Integer.compare(
                firstCard.getRankValue(),
                secondCard.getRankValue()
        );
    }

    /**
     * Check if cards are tied
     */
    public static boolean isTie(Card firstCard, Card secondCard) {

        return firstCard.getRankValue() == secondCard.getRankValue();
    }
}