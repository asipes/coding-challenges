package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/minimize-string-length">2716. Minimize String Length</a>
 */

public class MinimizeStringLength {
    public int minimizedStringLength(String s) {
        return (int) s.chars().mapToObj(c -> (char) c).distinct().count();
    }
}
