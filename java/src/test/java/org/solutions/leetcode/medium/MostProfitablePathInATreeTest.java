package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MostProfitablePathInATreeTest {

    public static Stream<Arguments> provideMostProfitablePathTestCases() {
        return Stream.of(
                Arguments.of(new int[][]{{0,1}, {1,2}, {1,3}, {3,4}}, 3, new int[]{-2,4,2,-4,6}, 6),
                Arguments.of(new int[][]{{0,1}}, 1, new int[]{-7280,2350}, -7280)
        );
    }

    @ParameterizedTest
    @MethodSource("provideMostProfitablePathTestCases")
    void mostProfitablePath(int[][] edges, int bob, int[] amount, int expected) {
        var actual = new MostProfitablePathInATree().mostProfitablePath(edges, bob, amount);
        assertEquals(expected, actual);
    }
}