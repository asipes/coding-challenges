package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumCandiesAllocatedToKChildrenTest {

    public static Stream<Arguments> provideMaximumCandiesTestCases() {
        return Stream.of(
                Arguments.of(new int[]{5, 8, 6}, 3, 5),
                Arguments.of(new int[]{2, 5}, 11, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideMaximumCandiesTestCases")
    void maximumCandies(int[] candies, long k, int expected) {
        var actual = new MaximumCandiesAllocatedToKChildren().maximumCandies(candies, k);
        assertEquals(expected, actual);
    }
}