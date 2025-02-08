package org.solutions.leetcode.easy;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * <a href="https://leetcode.com/problems/maximum-difference-by-remapping-a-digit">2566. Maximum Difference by Remapping a Digit</a>
 */

public class MaximumDifferenceByRemappingADigit {
    public int minMaxDifference(int num) {
        char[] charArray = String.valueOf(num).toCharArray();
        int[] digits = IntStream.range(0, charArray.length)
                .map(i -> charArray[i] - '0')
                .toArray();

        int firstNonNine = Arrays.stream(digits).filter(n -> n != 9).findFirst().orElse(9);
        int firstNonZero = digits[0];

        int maxDigit = Arrays.stream(digits)
                .map(n -> n == firstNonNine ? 9 : n)
                .reduce(0, (acc, d) -> acc * 10 + d);
        int minDigit = Arrays.stream(digits)
                .map(n -> n == firstNonZero ? 0 : n)
                .reduce(0, (acc, d) -> acc * 10 + d);

        return maxDigit - minDigit;
    }

    public int minMaxDifferenceV2(int num) {
        char[] maxArray = String.valueOf(num).toCharArray();
        char[] minArray = String.valueOf(num).toCharArray();
        int n = maxArray.length;
        char toUp = maxArray[0];
        char toDown = minArray[0];

        for (char c : maxArray) {
            if (c != '9') {
                toUp = c;
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            if (maxArray[i] == toUp) {
                maxArray[i] = '9';
            }
            if (minArray[i] == toDown) {
                minArray[i] = '0';
            }
        }

        return Integer.parseInt(new String(maxArray)) - Integer.parseInt(new String(minArray));
    }
}
