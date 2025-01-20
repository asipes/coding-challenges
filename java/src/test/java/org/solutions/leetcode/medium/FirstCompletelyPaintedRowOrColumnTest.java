package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstCompletelyPaintedRowOrColumnTest {

    public static Stream<Arguments> provideFirstCompleteIndexTestCases() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, 3, 4, 2},
                        new int[][]{{1, 4}, {2, 3}},
                        2
                ),
                Arguments.of(
                        new int[]{2, 8, 7, 4, 1, 3, 5, 6, 9},
                        new int[][]{{3, 2, 5}, {1, 4, 6}, {8, 7, 9}},
                        3
                ),
                Arguments.of(
                        new int[]{1, 4, 5, 2, 6, 3},
                        new int[][]{{4, 3, 5}, {1, 2, 6}},
                        1
                )
        );
    }

    @ParameterizedTest
    @MethodSource("provideFirstCompleteIndexTestCases")
    void firstCompleteIndex(int[] arr, int[][] mat, int expected) {
        var actual = new FirstCompletelyPaintedRowOrColumn().firstCompleteIndex(arr, mat);

        assertEquals(expected, actual);
    }
}