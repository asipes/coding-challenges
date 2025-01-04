package org.solutions.leetcode.medium;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/unique-length-3-palindromic-subsequences">1930. Unique Length-3 Palindromic Subsequences: 40ms(87.21%), 45.51(48.30%)</a>
 */

public class UniqueLength3PalindromicSubsequences {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, -1);
        Arrays.fill(last, -1);

        for (int i = 0; i < n; i++) {
            int index = s.charAt(i) - 'a';
            if (first[index] == -1) {
                first[index] = i;
            }
            last[index] = i;
        }

        int count = 0;

        for (int i = 0; i < 26; i++) {
            if (first[i] != -1 && last[i] != -1 && first[i] < last[i]) {
                boolean[] isExist = new boolean[26];

                for (int j = first[i] + 1; j < last[i]; j++) {
                    int index = s.charAt(j) - 'a';
                    isExist[index] = true;
                }

                for (int leftIndex = 0; leftIndex < 26; leftIndex++) {
                    if (isExist[leftIndex]) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
