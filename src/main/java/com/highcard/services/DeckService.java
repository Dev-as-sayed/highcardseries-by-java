// ==============================
// File: DeckService.java
// Path: src/main/java/com/highcard/services/DeckService.java
// ==============================

package com.highcard.services;

import com.highcard.exceptions.EmptyDeckException;
import com.highcard.models.Card;
import com.highcard.models.Deck;

public class DeckService {

    /**
     * Draw card safely
     */
    public Card drawCard(Deck deck) {

        try {

            return deck.dealCard();

        } catch (EmptyDeckException exception) {

            System.out.println(
                    "Deck Error: "
                            + exception.getMessage()
            );

            return null;
        }
    }

    /**
     * Shuffle deck
     */
    public void reshuffleDeck(Deck deck) {

        deck.shuffleDeck();

        System.out.println("Deck shuffled successfully.");
    }

    /**
     * Display remaining cards
     */
    public void displayRemainingCards(Deck deck) {

        System.out.println(
                "Remaining cards in deck: "
                        + deck.remainingCards()
        );
    }

    /**
     * Check if deck usable
     */
    public boolean canDraw(Deck deck) {

        return !deck.isEmpty();
    }
}