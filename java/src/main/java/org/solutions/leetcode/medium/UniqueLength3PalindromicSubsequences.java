package org.solutions.leetcode.medium;

/**
 * <a href="https://leetcode.com/problems/unique-length-3-palindromic-subsequences">1930. Unique Length-3 Palindromic Subsequences: 40ms(87.21%), 45.49(60.57%)</a>
 */

public class UniqueLength3PalindromicSubsequences {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int count = 0;
        int[][] occurrences = {
                {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1},
                {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1},
                {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1},
                {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1},
                {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1},
                {-1, -1}
        };

        for (int i = 0; i < n; i++) {
            int index = s.charAt(i) - 'a';

            if (occurrences[index][0] == -1) {
                occurrences[index][0] = i;
            }
            occurrences[index][1] = i;
        }

        for (int i = 0; i < 26; i++) {
            if (occurrences[i][0] != -1 && occurrences[i][0] < occurrences[i][1]) {
                boolean[] inWindow = new boolean[26];

                for (int j = occurrences[i][0] + 1; j < occurrences[i][1]; j++) {
                    int index = s.charAt(j) - 'a';
                    inWindow[index] = true;
                }

                for (int j = 0; j < 26; j++) {
                    if (inWindow[j]) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
