// ==============================
// File: Deck.java
// Path: src/main/java/com/highcard/models/Deck.java
// ==============================

package com.highcard.models;

import com.highcard.exceptions.EmptyDeckException;
import com.highcard.interfaces.Shuffleable;
import com.highcard.enums.Rank;
import com.highcard.enums.Suit;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Deck implements Shuffleable  {

    private final LinkedList<Card> cards;

    /**
     * Constructor
     */
    public Deck() {

        cards = new LinkedList<>();

        createDeck();

        shuffleDeck();
    }

    /**
     * Create standard 52-card deck
     */
    private void createDeck() {

        for (Suit suit : Suit.values()) {

            for (Rank rank : Rank.values()) {

                cards.add(new Card(rank, suit));
            }
        }
    }

    /**
     * Shuffle deck
     */
    public void shuffleDeck() {

        Collections.shuffle(cards);
    }

    /**
     * Deal top card
     */
    public Card dealCard() throws EmptyDeckException {
        if (cards.isEmpty()) {
            throw new EmptyDeckException("Cannot deal card. Deck is empty.");
        }

        return cards.removeFirst();
    }

    /**
     * Add card to bottom of deck
     */
    public void addCardToBottom(Card card) {

        if (card != null) {

            cards.addLast(card);
        }
    }

    /**
     * Check if deck empty
     */
    public boolean isEmpty() {

        return cards.isEmpty();
    }

    /**
     * Remaining cards count
     */
    public int remainingCards() {

        return cards.size();
    }

    /**
     * Reset deck
     */
    public void resetDeck() {

        cards.clear();

        createDeck();

        shuffleDeck();
    }

    /**
     * Get all cards
     */
    public List<Card> getCards() {

        return cards;
    }

    /**
     * Display deck cards
     */
    public void displayDeck() {

        for (Card card : cards) {

            System.out.println(card);
        }
    }
}