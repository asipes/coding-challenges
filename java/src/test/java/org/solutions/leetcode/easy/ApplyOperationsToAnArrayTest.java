package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ApplyOperationsToAnArrayTest {

    public static Stream<Arguments> provideApplyOperationsTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 2, 1, 1, 0}, new int[]{1, 4, 2, 0, 0, 0}),
                Arguments.of(new int[]{0, 1}, new int[]{1, 0})
        );
    }

    @ParameterizedTest
    @MethodSource("provideApplyOperationsTestCases")
    void applyOperations(int[] nums, int[] expected) {
        var actual = new ApplyOperationsToAnArray().applyOperations(nums);
        assertArrayEquals(expected, actual);
    }
}