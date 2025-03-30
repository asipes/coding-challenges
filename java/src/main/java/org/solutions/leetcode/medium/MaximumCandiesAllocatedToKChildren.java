package org.solutions.leetcode.medium;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/maximum-candies-allocated-to-k-children">2226. Maximum Candies Allocated to K Children</a>
 */

public class MaximumCandiesAllocatedToKChildren {
    public int maximumCandies(int[] candies, long k) {
        int result = 0;
        long left = 1;
        long right = Arrays.stream(candies).max().orElse(0);

        while (left <= right) {
            long mid = (left + right) / 2;
            long count = calculateBunch(candies, mid);

            if (count >= k) {
                result = (int) mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    private long calculateBunch(int[] candies, long mid) {
        long result = 0;
        for (long candy : candies) {
            result += candy / mid;
        }

        return result;
    }
}
