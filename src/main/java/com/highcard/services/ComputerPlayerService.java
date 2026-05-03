// ==============================
// File: ComputerPlayerService.java
// Path: src/main/java/com/highcard/services/ComputerPlayerService.java
// ==============================

package com.highcard.services;

import com.highcard.models.Card;
import com.highcard.models.Player;

public class ComputerPlayerService {

    /**
     * Choose weakest card
     */
    public Card chooseWeakestCard(Player player) {

        if (player.getCollectedCards().isEmpty()) {
            return null;
        }

        Card weakest =
                player.getCollectedCards().get(0);

        for (Card card :
                player.getCollectedCards()) {

            if (card.getRankValue()
                    < weakest.getRankValue()) {

                weakest = card;
            }
        }

        return weakest;
    }
}