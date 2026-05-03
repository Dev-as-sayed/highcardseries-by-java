// ==============================
// File: Player.java
// Path: src/main/java/com/highcard/models/Player.java
// ==============================

package com.highcard.models;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private final String name;

    private int score;

    private final List<Card> collectedCards;

    private final boolean computerPlayer;

    /**
     * Constructor
     */
    public Player(String name) {

        this.name = name;

        this.score = 0;

        this.collectedCards = new ArrayList<>();

        this.computerPlayer =
                name.equalsIgnoreCase("Computer");
    }

    /**
     * Get player name
     */
    public String getName() {

        return name;
    }

    /**
     * Get score
     */
    public int getScore() {

        return score;
    }

    /**
     * Get collected cards
     */
    public List<Card> getCollectedCards() {

        return collectedCards;
    }

    /**
     * Check computer player
     */
    public boolean isComputerPlayer() {

        return computerPlayer;
    }

    /**
     * Add points
     */
    public void addPoints(int points) {

        score += points;
    }

    /**
     * Collect card
     */
    public void collectCard(Card card) {

        if (card != null) {

            collectedCards.add(card);
        }
    }

    /**
     * Remove card
     */
    public void removeCard(Card card) {

        collectedCards.remove(card);
    }

    /**
     * Replace card
     */
    public void replaceCard(Card oldCard, Card newCard) {

        collectedCards.remove(oldCard);

        if (newCard != null) {

            collectedCards.add(newCard);
        }
    }

    /**
     * Total collected cards
     */
    public int getCollectedCardCount() {

        return collectedCards.size();
    }

    /**
     * Clear cards
     */
    public void clearCollectedCards() {

        collectedCards.clear();
    }

    /**
     * Display collected cards
     */
    public void showCollectedCards() {

        System.out.println("\n" + name + "'s Cards:");

        if (collectedCards.isEmpty()) {

            System.out.println("No cards collected.");

            return;
        }

        for (Card card : collectedCards) {

            System.out.println("- " + card);
        }
    }

    /**
     * Player summary
     */
    @Override
    public String toString() {

        return name +
                " | Score: " + score +
                " | Cards: " + collectedCards.size();
    }
}