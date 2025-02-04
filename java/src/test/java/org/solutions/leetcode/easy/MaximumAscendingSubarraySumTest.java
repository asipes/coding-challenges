package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAscendingSubarraySumTest {

    public static Stream<Arguments> provideMaxAscendingSumV1TestCases() {
        return Stream.of(
                Arguments.of(new int[]{10, 20, 30, 5, 10, 50}, 65),
                Arguments.of(new int[]{10, 20, 30, 40, 50}, 150),
                Arguments.of(new int[]{12, 17, 15, 13, 10, 11, 12}, 33)
        );
    }

    @ParameterizedTest
    @MethodSource("provideMaxAscendingSumV1TestCases")
    void maxAscendingSumV1(int[] nums, int expected) {
        var actual = new MaximumAscendingSubarraySum().maxAscendingSumV1(nums);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideMaxAscendingSumV1TestCases")
    void maxAscendingSumV2(int[] nums, int expected) {
        var actual = new MaximumAscendingSubarraySum().maxAscendingSum(nums);
        assertEquals(expected, actual);
    }
}