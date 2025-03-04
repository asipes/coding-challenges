package org.solutions.leetcode.medium;

/**
 * <a href="https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three">1780. Check if Number is a Sum of Powers of Three</a>
 */

public class CheckIfNumberIsASumOfPowersOfThree {
    public boolean checkPowersOfThree(int n) {
        return !Integer.toString(n).contains("2");
    }
}
