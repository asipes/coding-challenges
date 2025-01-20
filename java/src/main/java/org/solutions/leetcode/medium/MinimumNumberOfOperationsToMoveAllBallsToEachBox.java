package org.solutions.leetcode.medium;

/**
 * <a href="https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/solutions/6236487/beats-prefix-suffix-array-detailed-explanation">...</a>
 */

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] res = new int[n];

        int balls = 0;
        int cost = 0;

        for (int i = 0; i < n; i++) {
            res[i] += cost;
            balls += boxes.charAt(i) == '1' ? 1 : 0;
            cost += balls;
        }

        balls = 0;
        cost = 0;

        for (int i = n - 1; i >= 0; i--) {
            res[i] += cost;
            balls += boxes.charAt(i) == '1' ? 1 : 0;
            cost += balls;
        }

        return res;
    }
}
