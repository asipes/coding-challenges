package org.solutions.leetcode.medium;

/**
 * <a href="https://leetcode.com/problems/bitwise-xor-of-all-pairings">2425. Bitwise XOR of All Pairings</a>
 */

public class BitwiseXOROfAllPairings {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor1 = 0;
        int xor2 = 0;

        for (int num : nums1) {
            xor1 ^= num;
        }

        for (int num : nums2) {
            xor2 ^= num;
        }

        int res = 0;

        if (nums2.length % 2 != 0) {
            res ^= xor1;
        }
        if (nums1.length % 2 != 0) {
            res ^= xor2;
        }

        return res;
    }
}
