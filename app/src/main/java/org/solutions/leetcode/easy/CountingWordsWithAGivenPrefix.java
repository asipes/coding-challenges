package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/counting-words-with-a-given-prefix">2185. Counting Words With a Given Prefix</a>
 */

public class CountingWordsWithAGivenPrefix {
    public int prefixCount(String[] words, String pref) {
        int count = 0;

        for (String s : words) {
            if (s.startsWith(pref)) {
                count++;
            }
        }

        return count;
    }
}
