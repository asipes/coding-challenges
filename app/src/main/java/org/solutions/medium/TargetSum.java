package org.solutions.medium;

/**
 * <a href="https://leetcode.com/problems/target-sum">...</a>
 */

public class TargetSum {
    public int findTargetSumWays(int[] nums, int target) {
        return findTargetSumWays(nums, target, 0, 0);
    }

    private int findTargetSumWays(int[] nums, int target, int sum, int index) {
        if (nums.length == index) {
            if (sum == target) {
                return 1;
            } else {
                return 0;
            }
        }

        int add = findTargetSumWays(nums, target, sum + nums[index], index + 1);
        int subtract = findTargetSumWays(nums, target, sum - nums[index], index + 1);

        return add + subtract;
    }
}
