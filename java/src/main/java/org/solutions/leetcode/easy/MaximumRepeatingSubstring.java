package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/maximum-repeating-substring">1668. Maximum Repeating Substring</a>
 */

public class MaximumRepeatingSubstring {
    public int maxRepeating(String sequence, String word) {
        int count = 0;

        StringBuilder builder = new StringBuilder(word);

        while (sequence.contains(builder.toString())) {
            count++;
            builder.append(word);
        }

        return count;
    }
}
