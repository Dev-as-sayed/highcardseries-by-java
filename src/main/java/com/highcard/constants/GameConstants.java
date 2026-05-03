// ==============================
// File: GameConstants.java
// Path: src/main/java/com/highcard/constants/GameConstants.java
// ==============================

package com.highcard.constants;

public final class GameConstants {

    // Prevent object creation
    private GameConstants() {
    }

    // ==============================
    // GAME CONFIGURATION
    // ==============================

    public static final int MIN_PLAYERS = 2;

    public static final int MAX_PLAYERS = 5;

    public static final int DEFAULT_ROUNDS = 5;

    public static final int MAX_ROUNDS = 10;

    public static final int TOTAL_DECK_CARDS = 52;

    // ==============================
    // SCORING
    // ==============================

    public static final int ROUND_WIN_POINTS = 10;

    // ==============================
    // BONUS SYSTEM
    // ==============================

    // Sequence bonus multiplier
    public static final int SEQUENCE_BONUS_MULTIPLIER = 5;

    // Suit bonus multiplier
    public static final int SUIT_BONUS_MULTIPLIER = 3;

    // Minimum consecutive cards required
    public static final int MIN_SEQUENCE_LENGTH = 2;

    // Minimum same suit cards required
    public static final int MIN_SUIT_MATCH = 3;

    // ==============================
    // ADJUSTMENT SYSTEM
    // ==============================

    public static final int MAX_CARD_REPLACEMENTS = 2;

    // ==============================
    // COMPUTER PLAYER
    // ==============================

    public static final String COMPUTER_PLAYER_NAME = "Computer";

    // ==============================
    // DISPLAY TEXT
    // ==============================

    public static final String GAME_TITLE =
            "HIGH CARD SERIES";

    public static final String GAME_START_MESSAGE =
            "===== GAME STARTED =====";

    public static final String GAME_END_MESSAGE =
            "===== GAME FINISHED =====";

    public static final String SCOREBOARD_TITLE =
            "===== CURRENT SCORES =====";

    public static final String FINAL_RESULT_TITLE =
            "===== FINAL RESULTS =====";
}