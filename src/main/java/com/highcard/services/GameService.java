// ==============================
// File: GameService.java
// Path: src/main/java/com/highcard/services/GameService.java
// ==============================

package com.highcard.services;

import com.highcard.models.Game;
import com.highcard.models.Player;
import com.highcard.models.Round;

public class GameService {

    private final RoundService roundService;

    private final BonusService bonusService;

    public GameService() {

        roundService = new RoundService();

        bonusService = new BonusService();
    }

    /**
     * Start game
     */
    public void startGame(Game game) {

        System.out.println("\n===== GAME STARTED =====");

        // Play rounds
        for (int round = 1;
             round <= game.getTotalRounds();
             round++) {

            Round currentRound =
                    roundService.playRound(
                            game,
                            round
                    );

            currentRound.displayRoundCards();

            game.displayScores();
        }

        // Apply bonuses
        for (Player player : game.getPlayers()) {

            bonusService.applyAllBonuses(player);
        }

        // Final results
        game.displayFinalResults();

        game.displayAllPlayerCards();

        Player winner =
                ScoreService.findGameWinner(
                        game.getPlayers()
                );

        System.out.println(
                "\nGAME WINNER: "
                        + winner.getName()
        );
    }
}