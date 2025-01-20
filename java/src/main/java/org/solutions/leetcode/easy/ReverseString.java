package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/reverse-string">344. Reverse String</a>
 */

public class ReverseString {
    public void reverseString(char[] s) {
        int n = s.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = s[i];
            s[i] = s[n - i - 1];
            s[n - i - 1] = temp;
        }
    }
}
