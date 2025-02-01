package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/count-distinct-numbers-on-board">2549. Count Distinct Numbers on Board</a>
 */

public class CountDistinctNumbersOnBoard {
    public int distinctIntegers(int n) {
        if (n < 2) {
            return 0;
        }

        return n - 1;
    }
}
