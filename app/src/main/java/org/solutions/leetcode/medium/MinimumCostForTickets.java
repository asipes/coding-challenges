package org.solutions.leetcode.medium;

/**
 * <a href="https://leetcode.com/problems/minimum-cost-for-tickets">983. Minimum Cost For Tickets: 1ms(79.50%), 41.70mb(50.10%)</a>
 */

public class MinimumCostForTickets {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[366];
        dp[0] = 0;
        int index = 0;

        for (int i = 1; i < dp.length; i++) {
            if (index < days.length && days[index] == i) {
                dp[i] = Math.min(
                        dp[i - 1] + costs[0],
                        Math.min(
                                dp[Math.max(0, i - 7)] + costs[1],
                                dp[Math.max(0, i - 30)] + costs[2]
                        )
                );
                index++;
            } else {
                dp[i] = dp[i - 1];
            }
        }

        return dp[365];
    }
}
