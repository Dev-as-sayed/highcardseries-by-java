// ==============================
// File: RoundService.java
// Path: src/main/java/com/highcard/services/RoundService.java
// ==============================

package com.highcard.services;

import com.highcard.exceptions.EmptyDeckException;
import com.highcard.models.Card;
import com.highcard.models.Deck;
import com.highcard.models.Game;
import com.highcard.models.Player;
import com.highcard.models.Round;
import com.highcard.utils.ConsoleFormatter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RoundService {

    /**
     * Play one complete round
     */
    public Round playRound(Game game, int roundNumber) {

        ConsoleFormatter.printHeader(
                "ROUND " + roundNumber
        );

        Round round = new Round(roundNumber);

        Deck deck = game.getDeck();

        // Deal cards
        for (Player player : game.getPlayers()) {

            try {

                Card dealtCard = deck.dealCard();

                round.addPlayedCard(player, dealtCard);

                System.out.println(
                        player.getName()
                                + " drew "
                                + dealtCard
                );

            } catch (EmptyDeckException exception) {

                System.out.println(
                        "Deck Error: "
                                + exception.getMessage()
                );
            }
        }

        // Determine winners
        List<Player> winners =
                determineWinners(round);

        // Display winners
        displayRoundWinners(winners);

        // Award points
        ScoreService.awardRoundPoints(winners);

        // Collect winning cards
        collectWinningCards(round, winners);

        // Return losing cards
        returnLosingCards(round, winners, deck);

        return round;
    }

    /**
     * Determine highest rank winners
     */
    public List<Player> determineWinners(Round round) {

        List<Player> winners = new ArrayList<>();

        int highestRank = -1;

        for (Map.Entry<Player, Card> entry :
                round.getPlayedCards().entrySet()) {

            int currentRank =
                    entry.getValue().getRankValue();

            if (currentRank > highestRank) {

                highestRank = currentRank;

                winners.clear();

                winners.add(entry.getKey());

            } else if (currentRank == highestRank) {

                winners.add(entry.getKey());
            }
        }

        return winners;
    }

    /**
     * Winners collect cards
     */
    private void collectWinningCards(
            Round round,
            List<Player> winners
    ) {

        for (Player winner : winners) {

            Card winningCard =
                    round.getPlayedCards().get(winner);

            winner.collectCard(winningCard);
        }
    }

    /**
     * Return losing cards to deck
     */
    private void returnLosingCards(
            Round round,
            List<Player> winners,
            Deck deck
    ) {

        for (Map.Entry<Player, Card> entry :
                round.getPlayedCards().entrySet()) {

            if (!winners.contains(entry.getKey())) {

                deck.addCardToBottom(
                        entry.getValue()
                );
            }
        }
    }

    /**
     * Display winners
     */
    private void displayRoundWinners(
            List<Player> winners
    ) {

        ConsoleFormatter.printSubHeader(
                "ROUND WINNER(S)"
        );

        for (Player player : winners) {

            System.out.println(
                    player.getName()
                            + " wins this round."
            );
        }
    }
}