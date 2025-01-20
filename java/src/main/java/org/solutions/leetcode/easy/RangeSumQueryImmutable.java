package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/range-sum-query-immutable">303. Range Sum Query - Immutable</a>
 */

public class RangeSumQueryImmutable {
    static class NumArray {

        private final int[] nums;

        public NumArray(int[] nums) {
            this.nums = new int[nums.length];
            this.nums[0] = nums[0];

            for (int i = 1; i < this.nums.length; i++) {
                this.nums[i] = this.nums[i - 1] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            if (left == 0) {
                return nums[right];
            }

            return nums[right] - nums[left - 1];
        }
    }
}
