package org.solutions.easy;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/valid-anagram/">...</a>
 */

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        int[] sArr = new int[26];
        int[] tArr = new int[26];

        for (char c : s.toCharArray()) {
            sArr[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            tArr[c - 'a']++;
        }

        return Arrays.equals(sArr, tArr);
    }
}
