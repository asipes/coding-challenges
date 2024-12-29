package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/arranging-coins/description/">441. Arranging Coins: 1ms(98.83%), 41.44mb(8.02%) </a>
 */

public class ArrangingCoins {
    public int arrangeCoins(int n) {
        int low = 1;
        int high = Math.min(n , (int) Math.sqrt(2L * n)); // финальное значение не может превышать корень из 2n

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
