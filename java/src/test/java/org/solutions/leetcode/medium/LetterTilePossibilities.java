package org.solutions.leetcode.medium;

/**
 * <a href="https://leetcode.com/problems/letter-tile-possibilities">1079. Letter Tile Possibilities</a>
 */

public class LetterTilePossibilities {
    public int numTilePossibilities(String tiles) {
        int[] freq = new int[26];
        char[] chars = tiles.toCharArray();
        
        for (char c : chars) {
            freq[c - 'A']++;
        }

        return backtrack(freq);
    }

    private int backtrack(int[] freq) {
        int total = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                freq[i]--;
                total += 1 + backtrack(freq);
                freq[i]++;
            }
        }

        return total;
    }
}
