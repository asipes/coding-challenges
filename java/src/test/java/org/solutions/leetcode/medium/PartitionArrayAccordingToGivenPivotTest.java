package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PartitionArrayAccordingToGivenPivotTest {

    public static Stream<Arguments> providePivotArrayTestCases() {
        return Stream.of(
                Arguments.of(new int[]{9, 12, 5, 10, 14, 3, 10}, 10, new int[]{9, 5, 3, 10, 10, 12, 14}),
                Arguments.of(new int[]{-3, 4, 3, 2}, 2, new int[]{-3, 2, 4, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("providePivotArrayTestCases")
    void pivotArray(int[] nums, int pivot, int[] expected) {
        var actual = new PartitionArrayAccordingToGivenPivot().pivotArray(nums, pivot);
        assertArrayEquals(expected, actual);
    }
}