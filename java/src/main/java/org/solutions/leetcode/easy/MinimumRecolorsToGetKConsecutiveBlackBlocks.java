package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks">2379. Minimum Recolors to Get K Consecutive Black Blocks</a>
 */

public class MinimumRecolorsToGetKConsecutiveBlackBlocks {
    public int minimumRecolors(String blocks, int k) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= blocks.length() - k; i++) {
            int count = 0;
            for (int j = i; j < i + k; j++) {
                if (blocks.charAt(j) == 'W') {
                    count++;
                }
            }

            min = Math.min(min, count);
        }

        return min;
    }
}
