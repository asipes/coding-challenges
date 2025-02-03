package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestStrictlyIncreasingOrStrictlyDecreasingSubarrayTest {

    public static Stream<Arguments> provideLongestMonotonicSubarrayV1TestCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 4, 3, 3, 2}, 2),
                Arguments.of(new int[]{3, 3, 3, 3}, 1),
                Arguments.of(new int[]{3, 2, 1}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideLongestMonotonicSubarrayV1TestCases")
    void longestMonotonicSubarrayV1(int[] nums, int expected) {
        var actual = new LongestStrictlyIncreasingOrStrictlyDecreasingSubarray().longestMonotonicSubarrayV1(nums);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideLongestMonotonicSubarrayV1TestCases")
    void longestMonotonicSubarrayV2(int[] nums, int expected) {
        var actual = new LongestStrictlyIncreasingOrStrictlyDecreasingSubarray().longestMonotonicSubarray(nums);
        assertEquals(expected, actual);
    }
}