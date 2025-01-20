package org.solutions.leetcode.medium;

/**
 * <a href="https://leetcode.com/problems/check-if-a-parentheses-string-can-be-valid">2116. Check if a Parentheses String Can Be Valid</a>
 * 15ms(83.40%)
 * 45.71MB(50.21%)
 */

public class CheckIfAParenthesesStringCanBeValid {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();

        if (n % 2 != 0 || n == 0) {
            return false;
        }

        int free = 0;
        int balance = 0;

        for (int i = 0; i < n; i++) {
            if (locked.charAt(i) == '0') {
                free++;
            } else if (s.charAt(i) == '(') {
                balance++;
            } else {
                balance--;
            }

            if (balance < 0) {
                if (free > 0) {
                    free--;
                    balance++;
                } else {
                    return false;
                }
            }
        }

        balance = 0;
        free = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (locked.charAt(i) == '0') {
                free++;
            } else if (s.charAt(i) == ')') {
                balance++;
            } else {
                balance--;
            }

            if (balance < 0) {
                if (free > 0) {
                    free--;
                    balance++;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
