package org.solutions.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/longest-unequal-adjacent-groups-subsequence-i">2900. Longest Unequal Adjacent Groups Subsequence I</a>
 */

public class LongestUnequalAdjacentGroupsSubsequenceI {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int n = words.length;
        List<String> res = new ArrayList<>();
        res.add(words[0]);

        for (int i = 1; i < n; i++) {
            if (groups[i - 1] != groups[i]) {
                res.add(words[i]);
            }
        }

        return res;
    }
}
