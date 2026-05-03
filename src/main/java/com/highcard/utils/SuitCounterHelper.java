// ==============================
// File: SuitCounterHelper.java
// Path: src/main/java/com/highcard/utils/SuitCounterHelper.java
// ==============================

package com.highcard.utils;

import com.highcard.enums.Suit;
import com.highcard.models.Card;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SuitCounterHelper {

    /**
     * Count suits
     */
    public static Map<Suit, Integer> countSuits(List<Card> cards) {

        Map<Suit, Integer> suitCounts = new HashMap<>();

        for (Suit suit : Suit.values()) {
            suitCounts.put(suit, 0);
        }

        for (Card card : cards) {

            Suit suit = card.getSuit();

            suitCounts.put(
                    suit,
                    suitCounts.get(suit) + 1
            );
        }

        return suitCounts;
    }

    /**
     * Find highest suit count
     */
    public static int getHighestSuitCount(List<Card> cards) {

        Map<Suit, Integer> counts = countSuits(cards);

        int highest = 0;

        for (int count : counts.values()) {

            if (count > highest) {
                highest = count;
            }
        }

        return highest;
    }
}