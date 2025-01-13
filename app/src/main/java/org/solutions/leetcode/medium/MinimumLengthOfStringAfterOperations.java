package org.solutions.leetcode.medium;

/**
 * <a href="https://leetcode.com/problems/minimum-length-of-string-after-operations">3223. Minimum Length of String After Operations</a>
 * 10ms(80.00%)
 * 46.09MB(86.00%)
 */

public class MinimumLengthOfStringAfterOperations {
    public int minimumLength(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c -'a']++;
        }

        int count = 0;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 2) {
                freq[i] = freq[i] % 2 == 0 ? 2 : 1;
            }
            count += freq[i];
        }

        return count;
    }
}
