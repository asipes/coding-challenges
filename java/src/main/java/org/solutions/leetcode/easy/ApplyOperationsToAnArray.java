package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/apply-operations-to-an-array">2460. Apply Operations to an Array</a>
 */

public class ApplyOperationsToAnArray {
    public int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[left] = nums[i];
                left++;
            }
        }

        for (int i = left; i < nums.length; i++) {
            nums[i] = 0;
        }

        return nums;
    }
}
