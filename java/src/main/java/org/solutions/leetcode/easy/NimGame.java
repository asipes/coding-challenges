package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/nim-game">292. Nim Game</a>
 */

public class NimGame {
    public boolean canWinNim(int n) {
        if (n < 4) {
            return true;
        }

        if ((n - 1) % 4 == 0) {
            return true;
        }
        if ((n - 2) % 4 == 0) {
            return true;
        }

        return (n - 3) % 4 == 0;
    }
}
