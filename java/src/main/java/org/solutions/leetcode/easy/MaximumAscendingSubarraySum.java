package org.solutions.leetcode.easy;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/maximum-ascending-subarray-sum">1800. Maximum Ascending Subarray Sum</a>
 */

public class MaximumAscendingSubarraySum {
    public int maxAscendingSumV1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        Queue<List<Integer>> heap = new PriorityQueue<>(
                (a, b) -> Integer.compare(
                        b.stream().mapToInt(Integer::intValue).sum(),
                        a.stream().mapToInt(Integer::intValue).sum()
                )
        );

        List<Integer> sums = new ArrayList<>();
        sums.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] >= nums[i]) {
                heap.offer(sums);
                sums = new ArrayList<>();
            }
            sums.add(nums[i]);
        }

        heap.offer(sums);

        return Objects.requireNonNull(heap.poll()).stream().mapToInt(Integer::intValue).sum();
    }

    public int maxAscendingSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        int sum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                currentSum += nums[i];
            } else {
                currentSum = nums[i];
            }

            sum = Math.max(sum, currentSum);
        }

        return sum;
    }
}
