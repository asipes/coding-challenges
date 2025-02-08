package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/valid-palindrome-ii">680. Valid Palindrome II</a>
 */

public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        boolean leftShift = leftShift(s);
        if (!leftShift) return rightShift(s);

        return true;
    }

    private boolean rightShift(String s) {
        int left = 0;
        int right = s.length() - 1;
        int count = 0;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                if (count == 1) {
                    return false;
                }
                count++;
                if (s.charAt(left + 1) == s.charAt(right)) {
                    left++;
                } else if (s.charAt(left) == s.charAt(right - 1)) {
                    right--;
                } else {
                    return false;
                }
            }

            left++;
            right--;
        }

        return true;
    }

    private static boolean leftShift(String s) {
        int left = 0;
        int right = s.length() - 1;
        int count = 0;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                if (count == 1) {
                    return false;
                }
                count++;
                if (s.charAt(left) == s.charAt(right - 1)) {
                    right--;
                } else if (s.charAt(left + 1) == s.charAt(right)) {
                    left++;
                } else {
                    return false;
                }
            }

            left++;
            right--;
        }

        return true;
    }
}
