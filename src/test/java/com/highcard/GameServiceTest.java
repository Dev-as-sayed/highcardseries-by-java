// ==============================
// File: GameServiceTest.java
// Path: src/test/java/com/highcard/GameServiceTest.java
// ==============================

package com.highcard;

import com.highcard.models.Game;
import com.highcard.models.Player;
import com.highcard.services.GameService;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GameServiceTest {

    @Test
    void testGameInitialization() {

        List<Player> players =
                new ArrayList<>();

        players.add(new Player("A"));
        players.add(new Player("B"));

        Game game =
                new Game(players, 5);

        assertEquals(
                2,
                game.getPlayers().size()
        );
    }

    @Test
    void testGameServiceCreation() {

        GameService gameService =
                new GameService();

        assertNotNull(gameService);
    }
}