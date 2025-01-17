package org.solutions.leetcode.easy;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/word-pattern">290. Word Pattern</a>
 */

public class WordPattern {

    @SuppressWarnings("unchecked")
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        Set<Character> uniqueChars = new HashSet<>();
        for (char c : pattern.toCharArray()) {
            uniqueChars.add(c);
        }

        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }

        if (uniqueChars.size() != uniqueWords.size()) {
            return false;
        }

        Set<String>[] charToWord = (Set<String>[]) new HashSet[26];
        for (int i = 0; i < 26; i++) {
            charToWord[i] = new HashSet<>();
        }

        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            charToWord[c - 'a'].add(words[i]);

            if (charToWord[c - 'a'].size() > 1) {
                return false;
            }
        }

        return true;
    }
}
