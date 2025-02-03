package org.solutions.leetcode.easy;

import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray">3105. Longest Strictly Increasing or Strictly Decreasing Subarray</a>
 */

public class LongestStrictlyIncreasingOrStrictlyDecreasingSubarray {
    public int longestMonotonicSubarray(int[] nums) {
        int max = 1;
        int increasing = 1;
        int decreasing = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                decreasing++;
                increasing = 1;
            } else if (nums[i] < nums[i - 1]) {
                increasing++;
                decreasing = 1;
            } else {
                increasing = 1;
                decreasing = 1;
            }

            max = Math.max(max, Math.max(increasing, decreasing));
        }

        return max;
    }

    public int longestMonotonicSubarrayV1(int[] nums) {
        Queue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);
        int increasing = 1;
        int decreasing = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                increasing++;
                heap.offer(decreasing);
                decreasing = 1;
            } else if (nums[i - 1] > nums[i]) {
                decreasing++;
                heap.offer(increasing);
                increasing = 1;
            } else {
                heap.offer(increasing);
                heap.offer(decreasing);
                increasing = 1;
                decreasing = 1;
            }
        }

        heap.offer(increasing);
        heap.offer(decreasing);

        return Optional.ofNullable(heap.poll()).orElse(0);
    }


}
