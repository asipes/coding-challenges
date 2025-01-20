package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinCostClimbingStairsTest {

    public static Stream<Arguments> provideMinCostClimbingStairsTestCases() {
        return Stream.of(
                Arguments.of(new int[]{10,15,20}, 15),
                Arguments.of(new int[]{1,100,1,1,1,100,1,1,100,1}, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("provideMinCostClimbingStairsTestCases")
    void minCostClimbingStairs(int[] cost, int expected) {
        var actual = new MinCostClimbingStairs().minCostClimbingStairs(cost);

        assertEquals(expected, actual);
    }
}