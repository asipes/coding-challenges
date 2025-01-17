package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/reverse-vowels-of-a-string">345. Reverse Vowels of a String</a>
 */

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        char[] letters = s.toCharArray();
        int left = 0;
        int right = letters.length - 1;

        while (left < right) {
            if (isVowel(letters[left]) && isVowel(letters[right])) {
                char temp = letters[left];
                letters[left] = letters[right];
                letters[right] = temp;
                left++;
                right--;
            } else if (isVowel(letters[left])) {
                right--;
            } else if (isVowel(letters[right])) {
                left++;
            } else {
                left++;
                right--;
            }
        }

        return new String(letters);
    }

    private boolean isVowel(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
