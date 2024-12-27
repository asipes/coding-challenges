package org.solutions.medium;

/**
 * <a href="https://leetcode.com/problems/best-sightseeing-pair/">1014. Best Sightseeing Pair: 4ms(89.46%), 53.63mb(32.43%)</a>
 */

public class BestSightseeingPair {
    public int maxScoreSightseeingPair(int[] values) {
        if (values == null || values.length < 2) {
            return -1;
        }

        int score = 0;
        int left = values[0];

        for (int i = 1; i < values.length; i++) {
            score = Math.max(score, left + values[i] - i);
            left = Math.max(left, values[i] + i);
        }

        return score;
    }
}
