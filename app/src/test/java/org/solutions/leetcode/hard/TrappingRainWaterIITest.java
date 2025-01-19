package org.solutions.leetcode.hard;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrappingRainWaterIITest {
    public static Stream<Arguments> provideTrapRainWaterTestCases() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 4, 3, 1, 3, 2}, {3, 2, 1, 3, 2, 4}, {2, 3, 3, 2, 3, 1}}, 4),
                Arguments.of(new int[][]{{3, 3, 3, 3, 3}, {3, 2, 2, 2, 3}, {3, 2, 1, 2, 3}, {3, 2, 2, 2, 3}, {3, 3, 3, 3, 3}}, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTrapRainWaterTestCases")
    void trapRainWater(int[][] heightMap, int expected) {
        var actual = new TrappingRainWaterII().trapRainWater(heightMap);

        assertEquals(expected, actual);
    }
}