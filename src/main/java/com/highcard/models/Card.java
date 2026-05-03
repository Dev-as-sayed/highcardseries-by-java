// ==============================
// File: Card.java
// Path: src/main/java/com/highcard/models/Card.java
// ==============================

package com.highcard.models;

import com.highcard.enums.Rank;
import com.highcard.enums.Suit;

public class Card implements Comparable<Card> {

    private final Rank rank;
    private final Suit suit;

    /**
     * Constructor
     */
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * Get rank
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * Get suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Get numeric rank value
     */
    public int getRankValue() {
        return rank.getValue();
    }

    /**
     * Compare cards by rank
     */
    @Override
    public int compareTo(Card otherCard) {

        return Integer.compare(
                this.getRankValue(),
                otherCard.getRankValue()
        );
    }

    /**
     * Check same rank
     */
    public boolean hasSameRank(Card otherCard) {

        return this.getRankValue() == otherCard.getRankValue();
    }

    /**
     * String representation
     */
    @Override
    public String toString() {

        return rank + " of " + suit;
    }
}