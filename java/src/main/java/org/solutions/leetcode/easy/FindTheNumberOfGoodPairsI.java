package org.solutions.leetcode.easy;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/find-the-number-of-good-pairs-i">3162. Find the Number of Good Pairs I</a>
 */

public class FindTheNumberOfGoodPairsI {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        return Arrays.stream(nums1)
                .flatMap(i -> Arrays.stream(nums2)
                        .filter(j -> i % (j * k) == 0)
                        .map(j -> 1))
                .sum();
    }

    public int numberOfPairsV2(int[] nums1, int[] nums2, int k) {
        int count = 0;

        for (int value : nums1) {
            for (int i : nums2) {
                if (value % (i * k) == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
