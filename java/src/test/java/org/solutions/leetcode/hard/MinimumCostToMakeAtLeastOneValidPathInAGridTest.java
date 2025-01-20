package org.solutions.leetcode.hard;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumCostToMakeAtLeastOneValidPathInAGridTest {

    public static Stream<Arguments> provideMinCostTestCases() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 1, 1, 1}, {2, 2, 2, 2}, {1, 1, 1, 1}, {2, 2, 2, 2}}, 3),
                Arguments.of(new int[][]{{1, 1, 3}, {3, 2, 2}, {1, 1, 4}}, 0),
                Arguments.of(new int[][]{{1, 2}, {4, 3}}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideMinCostTestCases")
    void minCost(int[][] grid, int expected) {
        var actual = new MinimumCostToMakeAtLeastOneValidPathInAGrid().minCost(grid);

        assertEquals(expected, actual);
    }
}