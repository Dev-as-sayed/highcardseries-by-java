// ==============================
// File: RoundServiceTest.java
// Path: src/test/java/com/highcard/RoundServiceTest.java
// ==============================

package com.highcard;

import com.highcard.models.*;
import com.highcard.services.RoundService;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RoundServiceTest {

    @Test
    void testRoundCreation() {

        List<Player> players =
                new ArrayList<>();

        players.add(new Player("A"));
        players.add(new Player("B"));

        Game game =
                new Game(players, 5);

        RoundService roundService =
                new RoundService();

        Round round =
                roundService.playRound(
                        game,
                        1
                );

        assertEquals(
                2,
                round.getPlayedCards().size()
        );
    }

    @Test
    void testWinnerExists() {

        List<Player> players =
                new ArrayList<>();

        players.add(new Player("A"));
        players.add(new Player("B"));

        Game game =
                new Game(players, 5);

        RoundService roundService =
                new RoundService();

        Round round =
                roundService.playRound(
                        game,
                        1
                );

        assertFalse(
                roundService
                        .determineWinners(round)
                        .isEmpty()
        );
    }
}