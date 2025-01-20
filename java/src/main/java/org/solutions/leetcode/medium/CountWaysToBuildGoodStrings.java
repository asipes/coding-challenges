package org.solutions.leetcode.medium;

/**
 * <a href="https://leetcode.com/problems/count-ways-to-build-good-strings">2466. Count Ways To Build Good Strings: 8ms(76.17%), 43.29(77.18%)</a>
 */

public class CountWaysToBuildGoodStrings {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int[] dp = new int[high + 1];
        dp[0] = 1;
        int mod = 1_000_000_007;

        for (int i = 0; i < dp.length; i++) {
            if (i + zero <= high) {
                dp[i + zero] = (dp[i + zero] + dp[i]) % mod;
            }
            if (i + one <= high) {
                dp[i + one] = (dp[i + one] + dp[i]) % mod;
            }
        }

        int res = 0;
        for (int i = low; i <= high; i++) {
            res = (res + dp[i]) % mod;
        }

        return res;
    }
}
