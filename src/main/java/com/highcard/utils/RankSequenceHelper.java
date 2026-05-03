// ==============================
// File: RankSequenceHelper.java
// Path: src/main/java/com/highcard/utils/RankSequenceHelper.java
// ==============================

package com.highcard.utils;

import com.highcard.models.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RankSequenceHelper {

    /**
     * Find longest consecutive rank sequence
     *
     * Example:
     * Q-K => length 2
     */
    public static int findLongestSequence(List<Card> cards) {

        if (cards == null || cards.isEmpty()) {
            return 0;
        }

        List<Integer> ranks = new ArrayList<>();

        for (Card card : cards) {
            ranks.add(card.getRankValue());
        }

        Collections.sort(ranks);

        int longest = 1;
        int current = 1;

        for (int i = 1; i < ranks.size(); i++) {

            int previous = ranks.get(i - 1);
            int currentRank = ranks.get(i);

            if (currentRank == previous + 1) {

                current++;

            } else if (currentRank != previous) {

                current = 1;
            }

            longest = Math.max(longest, current);
        }

        return longest;
    }
}