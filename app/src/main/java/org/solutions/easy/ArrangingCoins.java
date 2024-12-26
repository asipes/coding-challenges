package org.solutions.easy;

/**
 * <a href="https://leetcode.com/problems/arranging-coins/description/">441. Arranging Coins: 1ms(98.83%), 41.44mb(8.02%) </a>
 */

public class ArrangingCoins {
    public int arrangeCoins(int n) {
        int low = 1;
        int high = n;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (mid * (mid + 1) / 2 <= n) {
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }

        return high;
    }
}
