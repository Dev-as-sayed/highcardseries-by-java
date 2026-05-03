package com.highcard;

import com.highcard.exceptions.EmptyDeckException;
import com.highcard.models.Card;
import com.highcard.models.Deck;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DeckTest {

    @Test
    void testDeckCreation() {

        Deck deck = new Deck();

        assertEquals(
                52,
                deck.remainingCards()
        );
    }

    @Test
    void testDealCard() throws EmptyDeckException {

        Deck deck = new Deck();

        Card card = deck.dealCard();

        assertNotNull(card);

        assertEquals(
                51,
                deck.remainingCards()
        );
    }

    @Test
    void testDeckNotEmptyInitially() {

        Deck deck = new Deck();

        assertFalse(deck.isEmpty());
    }
}