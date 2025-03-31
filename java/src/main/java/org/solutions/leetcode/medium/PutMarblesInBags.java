package org.solutions.leetcode.medium;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/put-marbles-in-bags">2551. Put Marbles in Bags</a>
 */

public class PutMarblesInBags {
    public long putMarbles(int[] weights, int k) {
        long[] pairSums = computePairSums(weights);
        Arrays.sort(pairSums);
        return sumLargest(pairSums, k - 1) - sumSmallest(pairSums, k - 1);
    }

    private long[] computePairSums(int[] weights) {
        int n = weights.length;
        long[] result = new long[n - 1];
        for (int i = 0; i < n - 1; i++) {
            result[i] = weights[i] + weights[i + 1];
        }
        return result;
    }

    private long sumSmallest(long[] arr, int count) {
        long total = 0;
        for (int i = 0; i < count; i++) {
            total += arr[i];
        }
        return total;
    }

    private long sumLargest(long[] arr, int count) {
        int n = arr.length;
        long total = 0;
        for (int i = n - count; i < n; i++) {
            total += arr[i];
        }
        return total;
    }
}
