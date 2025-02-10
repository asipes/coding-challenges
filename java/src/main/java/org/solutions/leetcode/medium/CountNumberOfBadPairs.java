package org.solutions.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/count-number-of-bad-pairs">2364. Count Number of Bad Pairs</a>
 */

public class CountNumberOfBadPairs {
    public long countBadPairs(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        long count = 0;

        for (int i = 0; i < nums.length; i++) {
            int res = nums[i] - i;
            count += freq.getOrDefault(res, 0) + 1;
            freq.put(res, freq.getOrDefault(res, 0) + 1);
        }

        return (long) nums.length * (nums.length + 1) / 2 - count;
    }
}
