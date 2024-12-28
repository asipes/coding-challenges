package org.solutions.easy;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/find-the-difference/">389. Find the Difference: 2ms(63.19%), 41.96mb(33.02%)</a>
 */

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        var sArr = s.toCharArray();
        var tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        for (int i = 0; i < s.length(); i++) {
            if (sArr[i] != tArr[i]) {
                return tArr[i];
            }
        }

        return tArr[tArr.length - 1];
    }
}
