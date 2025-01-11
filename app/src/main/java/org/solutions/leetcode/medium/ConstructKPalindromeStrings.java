package org.solutions.leetcode.medium;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/construct-k-palindrome-strings">1400. Construct K Palindrome Strings</a>
 * 6ms(44.96%)
 * 45.93MB(5.40%)
 */

public class ConstructKPalindromeStrings {
    public boolean canConstruct(String s, int k) {
        int n = s.length();
        
        if (n < k) {
            return false;
        }
        
        int[] freq = new int[26];

        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        long oddCount = Arrays.stream(freq)
                .filter(num -> num > 0 && num % 2 != 0)
                .count();

        return oddCount <= k;
    }
}
