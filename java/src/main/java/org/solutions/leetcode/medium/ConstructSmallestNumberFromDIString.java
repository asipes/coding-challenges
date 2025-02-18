package org.solutions.leetcode.medium;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <a href="https://leetcode.com/problems/construct-smallest-number-from-di-string">2375. Construct Smallest Number From DI String</a>
 */

public class ConstructSmallestNumberFromDIString {
    public String smallestNumber(String pattern) {
        Deque<Character> stack = new ArrayDeque<>();
        char count = '1';
        StringBuilder result = new StringBuilder();

        for (char c : pattern.toCharArray()) {
            stack.push(count);
            count++;
            if (c == 'I') {
                while (!stack.isEmpty()) {
                    result.append(stack.poll());
                }
            }
        }

        stack.push(count);
        while (!stack.isEmpty()) {
            result.append(stack.poll());
        }

        return result.toString();
    }
}
