package org.solutions.leetcode.medium;

/**
 * <a href="https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays">2657. Find the Prefix Common Array of Two Arrays</a>
 */

public class FindThePrefixCommonArrayOfTwoArrays {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] res = new int[n];
        int[] dp = new int[n + 1];

        for (int i = 0; i < n; i++) {
            dp[A[i]]++;
            dp[B[i]]++;

            if (dp[A[i]] == 2) {
                res[i]++;
            }

            if (dp[B[i]] == 2 && A[i] != B[i]) {
                res[i]++;
            }

            if (i > 0) {
                res[i] += res[i - 1];
            }
        }

        return res;
    }
}
