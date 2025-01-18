package org.solutions.leetcode.easy;

import java.util.LinkedHashMap;
import java.util.Map;

/**]
 * <a href="https://leetcode.com/problems/first-unique-character-in-a-string">387. First Unique Character in a String</a>
 */

public class FirstUniqueCharacterInAString {
    public int firstUniqCharV1(String s) {
        Map<Character, Integer> freq = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            int count = freq.getOrDefault(c, 0);
            freq.put(c, count + 1);
        }

        return freq.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .map(entry -> s.indexOf(entry.getKey()))
                .orElse(-1);
    }

    // Быстрее в два раза
    public int firstUniqCharV2(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (freq[c - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
