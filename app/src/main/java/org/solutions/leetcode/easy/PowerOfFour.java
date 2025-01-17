package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/power-of-four/solutions">342. Power of Four</a>
 */

public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        if (n >= 4) {
            return n % 4 == 0 && isPowerOfFour(n / 4);
        } else {
            return false;
        }
    }
}
