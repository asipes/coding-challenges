package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing">1827. Minimum Operations to Make the Array Increasing</a>
 */

public class MinimumOperationsToMakeTheArrayIncreasing {
    public int minOperations(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }

        int operation = 0;

        for (int i = 1; i < nums.length;i++) {
            if (nums[i - 1] >= nums[i]) {
                int needOperation = nums[i - 1] - nums[i] + 1;
                operation += needOperation;
                nums[i] += needOperation;
            }
        }

        return operation;
    }
}
