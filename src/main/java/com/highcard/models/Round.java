// ==============================
// File: Round.java
// Path: src/main/java/com/highcard/models/Round.java
// ==============================

package com.highcard.models;

import java.util.HashMap;
import java.util.Map;

public class Round {

    private final int roundNumber;

    // Player -> Card
    private final Map<Player, Card> playedCards;

    /**
     * Constructor
     */
    public Round(int roundNumber) {

        this.roundNumber = roundNumber;

        this.playedCards = new HashMap<>();
    }

    /**
     * Get round number
     */
    public int getRoundNumber() {

        return roundNumber;
    }

    /**
     * Get played cards
     */
    public Map<Player, Card> getPlayedCards() {

        return playedCards;
    }

    /**
     * Add player's dealt card
     */
    public void addPlayedCard(Player player, Card card) {

        playedCards.put(player, card);
    }

    /**
     * Display round information
     */
    public void displayRoundCards() {

        System.out.println("\n========== ROUND "
                + roundNumber
                + " ==========");

        for (Map.Entry<Player, Card> entry : playedCards.entrySet()) {

            System.out.println(
                    entry.getKey().getName()
                            + " -> "
                            + entry.getValue()
            );
        }
    }
}