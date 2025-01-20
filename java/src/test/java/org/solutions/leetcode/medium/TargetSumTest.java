package org.solutions.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TargetSumTest {

    @Test
    void invertTree() {
        int[] arr = {1,1,1,1,1};

        TargetSum targetSum = new TargetSum();
        var actual = targetSum.findTargetSumWays(arr, 3);
        var expected = 5;

        assertEquals(expected, actual);
    }
}