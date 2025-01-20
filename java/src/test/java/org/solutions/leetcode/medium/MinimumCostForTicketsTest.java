package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumCostForTicketsTest {

    public static Stream<Arguments> provideMinimumCostForTicketsTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1,4,6,7,8,20}, new int[]{2,7,15}, 11),
                Arguments.of(new int[]{1,2,3,4,5,6,7,8,9,10,30,31}, new int[]{2,7,15}, 17)
        );
    }

    @ParameterizedTest
    @MethodSource("provideMinimumCostForTicketsTestCases")
    void mincostTickets(int[] days, int[] costs, int expected) {
        MinimumCostForTickets minimumCostForTickets = new MinimumCostForTickets();
        var actual = minimumCostForTickets.mincostTickets(days, costs);

        assertEquals(expected, actual);
    }
}