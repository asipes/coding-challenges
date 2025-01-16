package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/n-th-tribonacci-number">1137. N-th Tribonacci Number</a>
 */

public class NthTribonacciNumber {
    public int tribonacci(int n) {
        int t0 = 0;
        int t1 = 1;
        int t2 = 1;

        if (n == 0) {
            return t0;
        }
        if (n == 1) {
            return t1;
        }
        if (n == 2) {
            return t2;
        }

        for (int i = 3; i <= n; i++) {
            int temp = t2 + t1 + t0;
            t0 = t1;
            t1 = t2;
            t2 = temp;
        }

        return t2;
    }
}
