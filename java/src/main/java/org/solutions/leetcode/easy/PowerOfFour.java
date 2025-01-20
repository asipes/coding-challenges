package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/power-of-four/solutions">342. Power of Four</a>
 */

public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 4 == 0) {
            n /= 4;
        }

        return n == 1;
    }
}
