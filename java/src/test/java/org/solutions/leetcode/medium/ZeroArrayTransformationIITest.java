package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ZeroArrayTransformationIITest {

    public static Stream<Arguments> provideMinZeroArrayTestCases() {
        return Stream.of(
                Arguments.of(
                        new int[]{2, 0, 2},
                        new int[][]{{0, 2, 1}, {0, 2, 1}, {1, 1, 3}},
                        2
                ),
                Arguments.of(
                        new int[]{4, 3, 2, 1},
                        new int[][]{{1, 3, 2}, {0, 2, 1}},
                        -1
                )
        );
    }

    @ParameterizedTest
    @MethodSource("provideMinZeroArrayTestCases")
    void minZeroArray(int[] nums, int[][] queries, int expected) {
        var actual = new ZeroArrayTransformationII().minZeroArray(nums, queries);
        assertEquals(expected, actual);
    }
}