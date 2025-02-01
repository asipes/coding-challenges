package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumOperationsToMakeTheArrayIncreasingTest {

    public static Stream<Arguments> provideMinOperationsTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 1}, 3),
                Arguments.of(new int[]{1, 5, 2, 4, 1}, 14),
                Arguments.of(new int[]{8}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideMinOperationsTestCases")
    void minOperations(int[] nums, int expected) {
        var actual = new MinimumOperationsToMakeTheArrayIncreasing().minOperations(nums);
        assertEquals(expected, actual);
    }
}
