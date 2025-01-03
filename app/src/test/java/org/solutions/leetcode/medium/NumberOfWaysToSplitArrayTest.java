package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfWaysToSplitArrayTest {

    public static Stream<Arguments> provideNumberOfWaysToSplitArrayTestCases() {
        return Stream.of(
                Arguments.of(new int[]{10, 4, -8, 7}, 2),
                Arguments.of(new int[]{2, 3, 1, 0}, 2),
                Arguments.of(new int[]{-100000, 100000}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideNumberOfWaysToSplitArrayTestCases")
    void waysToSplitArray(int[] nums, int expected) {
        NumberOfWaysToSplitArray numberOfWaysToSplitArray = new NumberOfWaysToSplitArray();
        var actual = numberOfWaysToSplitArray.waysToSplitArray(nums);

        assertEquals(expected, actual);
    }
}