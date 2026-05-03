// ==============================
// File: CardTest.java
// Path: src/test/java/com/highcard/CardTest.java
// ==============================

package com.highcard;

import com.highcard.enums.Rank;
import com.highcard.enums.Suit;
import com.highcard.models.Card;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CardTest {

    @Test
    void testCardCreation() {

        Card card =
                new Card(Rank.ACE, Suit.SPADES);

        assertEquals(Rank.ACE, card.getRank());

        assertEquals(Suit.SPADES, card.getSuit());
    }

    @Test
    void testRankValue() {

        Card card =
                new Card(Rank.KING, Suit.HEARTS);

        assertEquals(13, card.getRankValue());
    }

    @Test
    void testCompareCards() {

        Card ace =
                new Card(Rank.ACE, Suit.CLUBS);

        Card king =
                new Card(Rank.KING, Suit.DIAMONDS);

        assertTrue(
                ace.compareTo(king) > 0
        );
    }
}