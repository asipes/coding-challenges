package org.solutions.leetcode.medium;

/**
 * <a href="https://leetcode.com/problems/minimum-cost-for-tickets">983. Minimum Cost For Tickets: 1ms(79.50%), 41.48mb(68.60%)</a>
 */

public class MinimumCostForTickets {
    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        int lastDay = days[n - 1];
        int[] dp = new int[lastDay + 1];
        dp[0] = 0;
        int index = 0;

        for (int i = 1; i < dp.length; i++) {
            if (index < n && days[index] == i) {
                dp[i] = getMinCost(costs, dp, i);
                index++;
            } else {
                dp[i] = dp[i - 1];
            }
        }

        return dp[lastDay];
    }

    private static int getMinCost(int[] costs, int[] dp, int i) {
        int dayCost = dp[i - 1] + costs[0];

        int weekStartIndex = Math.max(0, i - 7);
        int weekCost = dp[weekStartIndex] + costs[1];

        int monthStartIndex = Math.max(0, i - 30);
        int monthCost = dp[monthStartIndex] + costs[2];

        return Math.min(
                dayCost,
                Math.min(
                        weekCost,
                        monthCost
                )
        );
    }
}
