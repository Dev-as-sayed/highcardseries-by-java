// ==============================
// File: BonusCalculator.java
// Path: src/main/java/com/highcard/interfaces/BonusCalculator.java
// ==============================

package com.highcard.interfaces;

import com.highcard.models.Player;

public interface BonusCalculator {

    /**
     * Calculate bonus points
     *
     * @param player target player
     * @return calculated bonus points
     */
    int calculateBonus(Player player);
}