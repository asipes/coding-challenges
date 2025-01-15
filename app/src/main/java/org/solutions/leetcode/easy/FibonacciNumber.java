package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/fibonacci-number">509. Fibonacci Number</a>
 */

public class FibonacciNumber {
    public int fib(int n) {
        if (n < 2) {
            return n;
        }

        int f = 2;
        int n1 = 0;
        int n2 = 1;

        while (f < n) {
            int temp = n1 + n2;
            n1 = n2;
            n2 = temp;
            f++;
        }

        return n1 + n2;
    }
}
