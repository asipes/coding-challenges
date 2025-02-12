package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxSumOfAPairWithEqualSumOfDigitsTest {

    public static Stream<Arguments> provideMaximumSumTestCase() {
        return Stream.of(
//                Arguments.of(new int[]{18,43,36,13,7}, 54),
//                Arguments.of(new int[]{10,12,19,14}, -1),
                Arguments.of(new int[]{4,6,10,6}, 12)
        );
    }

    @ParameterizedTest
    @MethodSource("provideMaximumSumTestCase")
    void maximumSum(int[] nums, int expected) {
        var actual = new MaxSumOfAPairWithEqualSumOfDigits().maximumSum(nums);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideMaximumSumTestCase")
    void maximumSumV1(int[] nums, int expected) {
        var actual = new MaxSumOfAPairWithEqualSumOfDigits().maximumSumV1(nums);
        assertEquals(expected, actual);
    }
}