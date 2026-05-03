// ==============================
// File: BonusServiceTest.java
// Path: src/test/java/com/highcard/BonusServiceTest.java
// ==============================

package com.highcard;

import com.highcard.enums.Rank;
import com.highcard.enums.Suit;
import com.highcard.models.Card;
import com.highcard.models.Player;
import com.highcard.services.BonusService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @Test
    void testSequenceBonus() {

        Player player =
                new Player("Sayed");

        player.collectCard(
                new Card(
                        Rank.QUEEN,
                        Suit.HEARTS
                )
        );

        player.collectCard(
                new Card(
                        Rank.KING,
                        Suit.CLUBS
                )
        );

        BonusService bonusService =
                new BonusService();

        bonusService.applySequenceBonus(player);

        assertTrue(
                player.getScore() > 0
        );
    }

    @Test
    void testSuitBonus() {

        Player player =
                new Player("Sayed");

        player.collectCard(
                new Card(
                        Rank.TWO,
                        Suit.HEARTS
                )
        );

        player.collectCard(
                new Card(
                        Rank.FIVE,
                        Suit.HEARTS
                )
        );

        player.collectCard(
                new Card(
                        Rank.EIGHT,
                        Suit.HEARTS
                )
        );

        BonusService bonusService =
                new BonusService();

        bonusService.applySuitBonus(player);

        assertTrue(
                player.getScore() > 0
        );
    }
}