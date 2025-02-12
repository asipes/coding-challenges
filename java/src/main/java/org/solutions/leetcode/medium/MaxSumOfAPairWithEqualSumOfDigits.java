package org.solutions.leetcode.medium;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * <a href="https://leetcode.com/problems/max-sum-of-a-pair-with-equal-sum-of-digits">2342. Max Sum of a Pair With Equal Sum of Digits</a>
 */

public class MaxSumOfAPairWithEqualSumOfDigits {
    public int maximumSum(int[] nums) {
        int max = -1;
        Map<Integer, int[]> map = new HashMap<>();

        for (int num : nums) {
            int sum = sumDigit(num);

            int[] maxPair = map.getOrDefault(sum, new int[]{-1, -1});

            if (num > maxPair[0]) {
                maxPair[1] = maxPair[0];
                maxPair[0] = num;
            } else if (num > maxPair[1]) {
                maxPair[1] = num;
            }

            map.put(sum, maxPair);
        }

        for (int[] pair : map.values()) {
            if (pair[1] != -1) {
                max = Math.max(max, pair[0] + pair[1]);
            }
        }

        return max;
    }

    public int maximumSumV1(int[] nums) {
        int max = -1;
        int n = nums.length;
        Map<Integer, PriorityQueue<Integer>> freq = new HashMap<>();

        for (int num : nums) {
            int sum = sumDigit(num);
            freq.computeIfAbsent(sum, k -> new PriorityQueue<>(Comparator.reverseOrder())).add(num);
        }

        for (Map.Entry<Integer, PriorityQueue<Integer>> entry : freq.entrySet()) {
            if (entry.getValue().size() > 1) {
                int first = entry.getValue().poll();
                int second = entry.getValue().poll();
                max = Math.max(max, first + second);
            }
        }


        return max;
    }

    private int sumDigit(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return Math.abs(sum);
    }
}
