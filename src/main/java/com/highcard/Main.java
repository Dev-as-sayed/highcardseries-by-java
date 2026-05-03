package com.highcard;

import com.highcard.constants.GameConstants;
import com.highcard.models.Game;
import com.highcard.models.Player;
import com.highcard.services.GameService;
import com.highcard.utils.ConsoleFormatter;
import com.highcard.utils.InputValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ==============================
        // GAME HEADER
        // ==============================

        ConsoleFormatter.printHeader(
                GameConstants.GAME_TITLE
        );

        // ==============================
        // PLAYER COUNT
        // ==============================

        int playerCount;

        while (true) {

            System.out.print(
                    "Enter number of players (2-5): "
            );

            playerCount = scanner.nextInt();

            scanner.nextLine();

            if (InputValidator
                    .isValidPlayerCount(playerCount)) {

                break;
            }

            System.out.println(
                    "Invalid player count. Please enter between 2 and 5."
            );
        }

        // ==============================
        // PLAYER NAMES
        // ==============================

        List<Player> players =
                new ArrayList<>();

        for (int i = 1;
             i <= playerCount;
             i++) {

            String playerName;

            while (true) {

                System.out.print(
                        "Enter Player "
                                + i
                                + " Name: "
                );

                playerName =
                        scanner.nextLine();

                if (InputValidator
                        .isValidPlayerName(playerName)) {

                    break;
                }

                System.out.println(
                        "Invalid name."
                );
            }

            players.add(
                    new Player(playerName)
            );
        }

        // ==============================
        // COMPUTER PLAYER
        // ==============================

        System.out.print(
                "Add computer player? (yes/no): "
        );

        String computerChoice =
                scanner.nextLine();

        if (computerChoice.equalsIgnoreCase("yes")) {

            players.add(
                    new Player(
                            GameConstants
                                    .COMPUTER_PLAYER_NAME
                    )
            );

            System.out.println(
                    "Computer player added."
            );
        }

        // ==============================
        // ROUND COUNT
        // ==============================

        int totalRounds;

        while (true) {

            System.out.print(
                    "Enter total rounds (5-10): "
            );

            totalRounds =
                    scanner.nextInt();

            scanner.nextLine();

            if (InputValidator
                    .isValidRoundCount(totalRounds)) {

                break;
            }

            System.out.println(
                    "Invalid round count."
            );
        }

        // ==============================
        // CREATE GAME
        // ==============================

        Game game =
                new Game(
                        players,
                        totalRounds
                );

        // ==============================
        // START GAME
        // ==============================

        GameService gameService =
                new GameService();

        gameService.startGame(game);

        // ==============================
        // GAME END
        // ==============================

        ConsoleFormatter.printHeader(
                GameConstants.GAME_END_MESSAGE
        );

        scanner.close();
    }
}