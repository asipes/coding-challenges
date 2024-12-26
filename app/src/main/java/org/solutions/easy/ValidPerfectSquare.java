package org.solutions.easy;

/**
 * <a href="https://leetcode.com/problems/valid-perfect-square/">367. Valid Perfect Square: 0ms (100%), 40.39mb (55.67%)</a>
 *
 */

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (mid * mid == num) {
                return true;
            }

            if (mid * mid < num) {
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }

        return false;
    }
}
