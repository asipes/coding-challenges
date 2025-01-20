package org.solutions.leetcode.medium;

/**
 * <a href="https://leetcode.com/problems/number-of-ways-to-split-array">2270. Number of Ways to Split Array: 2ms(100.00%), 58.49mb(
 * 60.21%)</a>
 */

public class NumberOfWaysToSplitArray {
    public int waysToSplitArray(int[] nums) {
        long leftSum = 0L;

        // тут был подсчет на стримах, но это вызывает переполнение инта в некоторых кейсах
        for (int num : nums) {
            leftSum += num;
        }
        long rightSum = 0;
        int count = 0;

        for (int i = nums.length - 1; i > 0 ; i--) {
            rightSum += nums[i];
            leftSum -= nums[i];

            if (leftSum >= rightSum) {
                count++;
            }

        }

        return count;
    }
}
