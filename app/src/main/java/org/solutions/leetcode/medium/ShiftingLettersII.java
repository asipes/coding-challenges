package org.solutions.leetcode.medium;

/**
 * <a href="https://leetcode.com/problems/shifting-letters-ii">2381. Shifting Letters II: 6ms(95.28%), 76.00mb(17.45%)</a>
 */

public class ShiftingLettersII {
    private static final char[] ALPHABET = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] delta = new int[n + 1];

        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2] == 1 ? 1 : -1;

            delta[start] += direction;
            if (end + 1 < n) {
                delta[end + 1] -= direction;
            }
        }

        int currentShift = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < n; i++) {
            currentShift += delta[i];
            chars[i] = getActualLetter(chars[i], currentShift);
        }

        return new String(chars);
    }

    private char getActualLetter(char c, int shift) {
        int index = c - 'a';
        shift = (shift % 26 + 26) % 26;
        int newIndex = (index + shift) % 26;
        return ALPHABET[newIndex];
    }
}
