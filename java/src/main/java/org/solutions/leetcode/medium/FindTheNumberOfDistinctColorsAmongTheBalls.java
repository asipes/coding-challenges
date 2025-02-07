package org.solutions.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/find-the-number-of-distinct-colors-among-the-balls">3160. Find the Number of Distinct Colors Among the Balls</a>
 */

public class FindTheNumberOfDistinctColorsAmongTheBalls {
    public int[] queryResults(int limit, int[][] queries) {
        int[] result = new int[queries.length];
        Map<Integer, Integer> balls = new HashMap<>();
        Map<Integer, Integer> colors = new HashMap<>();

        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int ball = query[0];
            int color = query[1];

            if (balls.containsKey(ball)) {
                int currentColor = balls.get(ball);

                if (colors.get(currentColor) > 1) {
                    colors.put(currentColor, colors.get(currentColor) - 1);
                } else {
                    colors.remove(currentColor);
                }
            }

            colors.put(color, colors.getOrDefault(color, 0) + 1);
            balls.put(ball, color);

            result[i] = colors.size();
        }

        return result;
    }
}
