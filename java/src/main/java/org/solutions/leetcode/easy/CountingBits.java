package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/counting-bits">338. Counting Bits</a>
 */

public class CountingBits {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            calculate(res, i);
        }

        return res;
    }

    private void calculate(int[] res, int index) {
        int addend = index % 2 == 0 ? 0 : 1;
        int targetIndex = index / 2;
        res[index] = res[targetIndex] + addend;
    }
}
