package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/long-pressed-name">925. Long Pressed Name</a>
 */

public class LongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        if (name.charAt(0) != typed.charAt(0) || name.length() > typed.length()) {
            return false;
        }

        int firstIndex = 1;
        int secondIndex = 1;

        while (firstIndex < name.length() && secondIndex < typed.length()) {
            if (name.charAt(firstIndex) == typed.charAt(secondIndex)) {
                firstIndex++;
                secondIndex++;
            } else if (typed.charAt(secondIndex) == typed.charAt(secondIndex - 1)) {
                secondIndex++;
            } else {
                return false;
            }
        }

        while (secondIndex < typed.length()) {
            if (typed.charAt(secondIndex) != typed.charAt(secondIndex - 1)) {
                return false;
            }
            secondIndex++;
        }

        return firstIndex == name.length();
    }
}
