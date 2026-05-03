// ==============================
// File: Game.java
// Path: src/main/java/com/highcard/models/Game.java
// ==============================

package com.highcard.models;

import java.util.List;

public class Game {

    private final List<Player> players;

    private final Deck deck;

    private final int totalRounds;

    /**
     * Constructor
     */
    public Game(List<Player> players, int totalRounds) {

        this.players = players;

        this.totalRounds = totalRounds;

        this.deck = new Deck();
    }

    /**
     * Get players
     */
    public List<Player> getPlayers() {

        return players;
    }

    /**
     * Get deck
     */
    public Deck getDeck() {

        return deck;
    }

    /**
     * Get total rounds
     */
    public int getTotalRounds() {

        return totalRounds;
    }

    /**
     * Display scores
     */
    public void displayScores() {

        System.out.println("\n========== CURRENT SCORES ==========");

        for (Player player : players) {

            System.out.println(
                    player.getName()
                            + " : "
                            + player.getScore()
            );
        }
    }

    /**
     * Display final results
     */
    public void displayFinalResults() {

        System.out.println("\n========== FINAL RESULTS ==========");

        for (Player player : players) {

            System.out.println(
                    player.getName()
                            + " | Final Score: "
                            + player.getScore()
            );
        }
    }

    /**
     * Display all player cards
     */
    public void displayAllPlayerCards() {

        System.out.println("\n========== PLAYER CARD COLLECTIONS ==========");

        for (Player player : players) {

            player.showCollectedCards();
        }
    }
}