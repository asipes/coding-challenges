package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/clear-digits">3174. Clear Digits</a>
 */

public class ClearDigits {
    public String clearDigits(String s) {
        StringBuilder builder = new StringBuilder();
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                count++;
            } else {
                if (count > 0) {
                    count--;
                } else {
                    builder.append(c);
                }
            }
        }

        builder.reverse();
        return builder.toString();
    }
}
