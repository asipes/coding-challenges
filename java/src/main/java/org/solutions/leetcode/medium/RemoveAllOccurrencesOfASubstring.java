package org.solutions.leetcode.medium;

/**
 * <a href="https://leetcode.com/problems/remove-all-occurrences-of-a-substring">1910. Remove All Occurrences of a Substring</a>
 */

public class RemoveAllOccurrencesOfASubstring {
    public String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            s = s.replaceFirst(part, "");
        }
        return s;
    }
}
