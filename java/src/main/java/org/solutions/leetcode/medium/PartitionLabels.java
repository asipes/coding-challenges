package org.solutions.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/partition-labels">763. Partition Labels</a>
 */

public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        int[] lastIndex = new int[26];
        Arrays.fill(lastIndex, -1);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            lastIndex[c - 'a'] = i;
        }

        List<Integer> result = new ArrayList<>();
        int end = -1;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, lastIndex[s.charAt(i) - 'a']);
            if (end == i) {
                result.add(end - start + 1);
                start = end + 1;
            }
        }

        return result;
    }
}
