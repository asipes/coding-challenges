package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal">1790. Check if One String Swap Can Make Strings Equal</a>
 */

public class CheckIfOneStringSwapCanMakeStringsEqual {
    public boolean areAlmostEqual(String s1, String s2) {
        int count = 0;
        int idx = -1;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (count == 0) {
                    idx = i;
                } else if (count == 1 && !isValidSwap(s1.charAt(i), s2.charAt(idx), s1.charAt(idx), s2.charAt(i))) {
                    return false;
                } else if (count == 2) {
                    return false;
                }

                count++;
            }
        }

        return count == 0 || count == 2;
    }

    private boolean isValidSwap(char a1, char a2, char b1, char b2) {
        return a1 == a2 && b1 == b2;
    }
}
