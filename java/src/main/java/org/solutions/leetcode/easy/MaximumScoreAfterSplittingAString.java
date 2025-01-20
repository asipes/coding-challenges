package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/maximum-score-after-splitting-a-string">1422. Maximum Score After Splitting a String: 1ms(97.36%), 41.86mb(18.04)</a>
 */

// Считаем префиксные суммы для левой части и постфиксные суммы для правой, потом выявляем максимальную сумму
public class MaximumScoreAfterSplittingAString {
    public int maxScore(String s) {
        int[] zeroPrefixSum = new int[s.length()];
        int[] onePostfixSum = new int[s.length()];
        char[] chars = s.toCharArray();

        zeroPrefixSum[0] = chars[0] == '0' ? 1 : 0;
        onePostfixSum[chars.length - 1] = chars[chars.length - 1] == '1' ? 1 : 0;

        for (int i = 1, j = chars.length - 2; i < chars.length - 1; i++, j--) {
            zeroPrefixSum[i] = zeroPrefixSum[i - 1];
            onePostfixSum[j] = onePostfixSum[j + 1];
            if (chars[i] == '0') {
                zeroPrefixSum[i]++;
            }
            if (chars[j] == '1') {
                onePostfixSum[j]++;
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < chars.length - 1; i++) {
            max = Math.max(max, zeroPrefixSum[i] + onePostfixSum[i + 1]);
        }

        return max;
    }
}
