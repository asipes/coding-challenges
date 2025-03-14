package org.solutions.leetcode.medium;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/maximum-candies-allocated-to-k-children">2226. Maximum Candies Allocated to K Children</a>
 */

public class MaximumCandiesAllocatedToKChildren {
    public int maximumCandies(int[] candies, long k) {
        int result = 0;
        int left = 1;
        int right = Arrays.stream(candies).max().orElse(0);

        while (left <= right) {
            int mid = (left + right) / 2;
            int count = calculateBunch(candies, mid);

            if (count >= k) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    private int calculateBunch(int[] candies, int mid) {
        int result = 0;
        for (int candy : candies) {
            result += candy / mid;
        }

        return result;
    }
}
