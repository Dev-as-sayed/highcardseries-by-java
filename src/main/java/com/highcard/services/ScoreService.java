// ==============================
// File: ScoreService.java
// Path: src/main/java/com/highcard/services/ScoreService.java
// ==============================

package com.highcard.services;

import com.highcard.models.Player;

import java.util.List;

public class ScoreService {

    private static final int ROUND_WIN_POINTS = 10;

    /**
     * Award round points
     */
    public static void awardRoundPoints(
            List<Player> winners
    ) {

        if (winners == null || winners.isEmpty()) {
            return;
        }

        int splitPoints =
                ROUND_WIN_POINTS / winners.size();

        for (Player player : winners) {

            player.addPoints(splitPoints);

            System.out.println(
                    player.getName()
                            + " gained "
                            + splitPoints
                            + " points."
            );
        }
    }

    /**
     * Find highest score player
     */
    public static Player findGameWinner(
            List<Player> players
    ) {

        Player bestPlayer = players.get(0);

        for (Player player : players) {

            if (player.getScore()
                    > bestPlayer.getScore()) {

                bestPlayer = player;
            }
        }

        return bestPlayer;
    }
}