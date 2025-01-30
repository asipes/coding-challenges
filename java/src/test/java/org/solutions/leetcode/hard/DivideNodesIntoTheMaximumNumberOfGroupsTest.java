package org.solutions.leetcode.hard;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DivideNodesIntoTheMaximumNumberOfGroupsTest {

    public static Stream<Arguments> provideMagnificentSetsTestCases() {
        return Stream.of(
                Arguments.of(
                        6,
                        new int[][]{
                                {1, 2},
                                {1, 4},
                                {1, 5},
                                {2, 6},
                                {2, 3},
                                {4, 6}},
                        4
                ),
                Arguments.of(
                        3,
                        new int[][]{
                                {1, 2},
                                {2, 3},
                                {3, 1}},
                        -1
                )
        );
    }

    @ParameterizedTest
    @MethodSource("provideMagnificentSetsTestCases")
    void magnificentSets(int n, int[][] edges, int expected) {
        var actual = new DivideNodesIntoTheMaximumNumberOfGroups().magnificentSets(n, edges);

        assertEquals(expected, actual);
    }
}