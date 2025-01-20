package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/min-cost-climbing-stairs">746. Min Cost Climbing Stairs</a>
 */

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        dp[n - 1] = cost[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            dp[i] = cost[i] + Math.min(dp[i + 1], dp[i + 2]);
        }

        return Math.min(dp[0], dp[1]);
    }
}
