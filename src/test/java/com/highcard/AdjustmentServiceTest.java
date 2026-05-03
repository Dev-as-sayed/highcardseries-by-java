// ==============================
// File: AdjustmentServiceTest.java
// Path: src/test/java/com/highcard/AdjustmentServiceTest.java
// ==============================

package com.highcard;

import com.highcard.enums.Rank;
import com.highcard.enums.Suit;
import com.highcard.models.Card;
import com.highcard.models.Deck;
import com.highcard.models.Player;
import com.highcard.services.AdjustmentService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdjustmentServiceTest {

    @Test
    void testReplaceCard() {

        Player player =
                new Player("Sayed");

        Deck deck = new Deck();

        Card oldCard =
                new Card(
                        Rank.TWO,
                        Suit.CLUBS
                );

        player.collectCard(oldCard);

        AdjustmentService service =
                new AdjustmentService();

        service.replaceCard(
                player,
                oldCard,
                deck
        );

        assertEquals(
                1,
                player.getCollectedCardCount()
        );
    }
}