package org.solutions.leetcode.medium;

import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/count-vowel-strings-in-ranges">2559. Count Vowel Strings in Ranges: 8ms(48.29%), 94.09mb(5.01%)</a>
 */

public class CountVowelStringsInRanges {
    private final Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] ans = new int[queries.length];
        int[] vowelsPrefixSum = new int[words.length];

        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (startsAndEndsWithVowel(words[i])) {
                count++;
            }
            vowelsPrefixSum[i] = count;
        }

        for (int i = 0; i < queries.length; i++) {
            int li = queries[i][0];
            int ri = queries[i][1];

            if (li == 0) {
                ans[i] = vowelsPrefixSum[ri];
            } else {
                ans[i] = vowelsPrefixSum[ri] - vowelsPrefixSum[li - 1];
            }
        }

        return ans;
    }

    private boolean startsAndEndsWithVowel(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        char first = s.toCharArray()[0];
        char last = s.toCharArray()[s.length() - 1];

        return vowels.contains(first) && vowels.contains(last);
    }
}
