package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RedundantConnectionTest {

    public static Stream<Arguments> provideFindRedundantConnectionTestCases() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 2}, {1, 3}, {2, 3}}, new int[]{2, 3}),
                Arguments.of(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}}, new int[]{1, 4})
        );
    }

    @ParameterizedTest
    @MethodSource("provideFindRedundantConnectionTestCases")
    void findRedundantConnection(int[][] edges, int[] expected) {
        var actual = new RedundantConnection().findRedundantConnection(edges);

        assertArrayEquals(expected, actual);
    }
}