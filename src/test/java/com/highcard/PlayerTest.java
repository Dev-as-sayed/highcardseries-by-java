// ==============================
// File: PlayerTest.java
// Path: src/test/java/com/highcard/PlayerTest.java
// ==============================

package com.highcard;

import com.highcard.enums.Rank;
import com.highcard.enums.Suit;
import com.highcard.models.Card;
import com.highcard.models.Player;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    void testPlayerCreation() {

        Player player =
                new Player("Sayed");

        assertEquals(
                "Sayed",
                player.getName()
        );
    }

    @Test
    void testScoreAddition() {

        Player player =
                new Player("Sayed");

        player.addPoints(10);

        assertEquals(
                10,
                player.getScore()
        );
    }

    @Test
    void testCollectCard() {

        Player player =
                new Player("Sayed");

        Card card =
                new Card(
                        Rank.ACE,
                        Suit.HEARTS
                );

        player.collectCard(card);

        assertEquals(
                1,
                player.getCollectedCardCount()
        );
    }
}