package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TupleWithSameProductTest {

    public static Stream<Arguments> provideTupleSameProductTestCases() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 4, 6}, 8),
                Arguments.of(new int[]{1, 2, 4, 5, 10}, 16)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTupleSameProductTestCases")
    void tupleSameProduct(int[] nums, int expected) {
        var actual = new TupleWithSameProduct().tupleSameProduct(nums);
        assertEquals(expected, actual);
    }
}