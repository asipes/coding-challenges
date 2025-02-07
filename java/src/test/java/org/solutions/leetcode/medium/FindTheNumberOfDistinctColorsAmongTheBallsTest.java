package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindTheNumberOfDistinctColorsAmongTheBallsTest {

    public static Stream<Arguments> provideQueryResultsTestCases() {
        return Stream.of(
                Arguments.of(
                        4,
                        new int[][]{{1, 4}, {2, 5}, {1, 3}, {3, 4}},
                        new int[]{1, 2, 2, 3}
                ),
                Arguments.of(
                        4,
                        new int[][]{{0, 1}, {1, 2}, {2, 2}, {3, 4}, {4, 5}},
                        new int[]{1, 2, 2, 3, 4}
                ),
                Arguments.of(
                        4,
                        new int[][]{{0, 1}, {1, 2}, {1, 4}, {0, 5}, {0, 3}},
                        new int[]{1, 2, 2, 2, 2}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("provideQueryResultsTestCases")
    void queryResults(int limit, int[][] queries, int[] expected) {
        var actual = new FindTheNumberOfDistinctColorsAmongTheBalls().queryResults(limit, queries);
        assertArrayEquals(expected, actual);
    }
}