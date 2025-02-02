package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/check-if-array-is-sorted-and-rotated">1752. Check if Array Is Sorted and Rotated</a>
 */

public class CheckIfArrayIsSortedAndRotated {
    public boolean check(int[] nums) {
        int gapCount = 0;

        for (int i = 0; i < nums.length; i++) {
            int idx = (i + 1) % nums.length;

            if (nums[idx] < nums[i]) {
                gapCount++;
                if (gapCount > 1) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean checkV1(int[] nums) {
        if (nums == null || nums.length < 2) {
            return true;
        }

        int prev = nums[0];
        boolean isRotated = false;

        for (int i = 1; i < nums.length; i++) {
            if (prev > nums[i]) {
                if (isRotated || nums[i] > nums[0] || i < nums.length - 1 && nums[i + 1] > nums[0] || nums[nums.length - 1] > nums[0]) {
                    return false;
                }
                isRotated = true;
            }

            prev = nums[i];
        }

        return true;
    }
}
