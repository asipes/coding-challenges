package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/move-zeroes">283. Move Zeroes</a>
 */

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        bzero(nums, index);
    }

    private void bzero(int[] nums, int index) {
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
