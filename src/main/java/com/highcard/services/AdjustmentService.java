// ==============================
// File: AdjustmentService.java
// Path: src/main/java/com/highcard/services/AdjustmentService.java
// ==============================

package com.highcard.services;

import com.highcard.exceptions.EmptyDeckException;
import com.highcard.models.Card;
import com.highcard.models.Deck;
import com.highcard.models.Player;

public class AdjustmentService {

    /**
     * Replace a player's card
     */
    public void replaceCard(
            Player player,
            Card oldCard,
            Deck deck
    ) {

        try {

            Card newCard = deck.dealCard();

            player.replaceCard(oldCard, newCard);

            deck.addCardToBottom(oldCard);

            System.out.println(
                    player.getName()
                            + " replaced "
                            + oldCard
                            + " with "
                            + newCard
            );

        } catch (EmptyDeckException exception) {

            System.out.println(
                    "Cannot replace card: "
                            + exception.getMessage()
            );
        }
    }

    /**
     * Replace weakest card
     */
    public void replaceWeakestCard(
            Player player,
            Deck deck
    ) {

        if (player.getCollectedCards().isEmpty()) {

            System.out.println(
                    player.getName()
                            + " has no cards to replace."
            );

            return;
        }

        Card weakestCard =
                player.getCollectedCards().get(0);

        for (Card card : player.getCollectedCards()) {

            if (card.compareTo(weakestCard) < 0) {

                weakestCard = card;
            }
        }

        replaceCard(player, weakestCard, deck);
    }
}