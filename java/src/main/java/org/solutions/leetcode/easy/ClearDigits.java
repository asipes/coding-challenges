package org.solutions.leetcode.easy;

import java.util.LinkedList;

/**
 * <a href="https://leetcode.com/problems/clear-digits">3174. Clear Digits</a>
 */

public class ClearDigits {

    public String clearDigits(String s) {
        int count = 0;

        var stack = new LinkedList<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                count++;
            } else {
                if (count > 0) {
                    count--;
                } else {
                    stack.push(c);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }

    public String clearDigitsV1(String s) {
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
