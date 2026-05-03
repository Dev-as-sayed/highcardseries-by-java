// ==============================
// File: BonusService.java
// Path: src/main/java/com/highcard/services/BonusService.java
// ==============================

package com.highcard.services;

import com.highcard.models.Player;
import com.highcard.utils.RankSequenceHelper;
import com.highcard.utils.SuitCounterHelper;

public class BonusService {

    /**
     * Apply all bonuses
     */
    public void applyAllBonuses(Player player) {

        applySequenceBonus(player);

        applySuitBonus(player);
    }

    /**
     * Consecutive rank bonus
     */
    public void applySequenceBonus(Player player) {

        int longestSequence =
                RankSequenceHelper.findLongestSequence(
                        player.getCollectedCards()
                );

        if (longestSequence >= 2) {

            int bonus = longestSequence * 5;

            player.addPoints(bonus);

            System.out.println(
                    player.getName()
                            + " received sequence bonus: "
                            + bonus
            );
        }
    }

    /**
     * Same suit bonus
     */
    public void applySuitBonus(Player player) {

        int highestSuitCount =
                SuitCounterHelper.getHighestSuitCount(
                        player.getCollectedCards()
                );

        if (highestSuitCount >= 3) {

            int bonus = highestSuitCount * 3;

            player.addPoints(bonus);

            System.out.println(
                    player.getName()
                            + " received suit bonus: "
                            + bonus
            );
        }
    }
}