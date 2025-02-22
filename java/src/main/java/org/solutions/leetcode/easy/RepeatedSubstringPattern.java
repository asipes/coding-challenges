package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/repeated-substring-pattern">459. Repeated Substring Pattern</a>
 */

public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        return (s + s).substring(1, 2 * s.length() - 1).contains(s);
    }
}
