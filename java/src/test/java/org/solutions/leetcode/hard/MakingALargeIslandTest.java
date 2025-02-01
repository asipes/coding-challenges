package org.solutions.leetcode.hard;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MakingALargeIslandTest {

    public static Stream<Arguments> provideLargestIslandTestCases() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 0}, {0, 1}}, 3),
                Arguments.of(new int[][]{{1, 1}, {0, 1}}, 4),
                Arguments.of(new int[][]{{1, 1}, {1, 1}}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("provideLargestIslandTestCases")
    void largestIsland(int[][] grid, int expected) {
        var actual = new MakingALargeIsland().largestIsland(grid);
        assertEquals(expected, actual);
    }
}