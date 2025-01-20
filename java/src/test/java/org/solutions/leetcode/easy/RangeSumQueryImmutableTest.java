package org.solutions.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class RangeSumQueryImmutableTest {

    @Test
    public void checkNumArray() {
        var newNumArray = new RangeSumQueryImmutable.NumArray(new int[] {-2, 0, 3, -5, 2, -1});
        var actual = newNumArray.sumRange(0, 2);
        assertEquals(1, actual);
        actual = newNumArray.sumRange(2, 5);
        assertEquals(-1, actual);
        actual = newNumArray.sumRange(0, 5);
        assertEquals(-3, actual);
    }
}