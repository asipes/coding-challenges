package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumTimeDifferenceTest {

    public static Stream<Arguments> provideMinimumTimeDifferenceTestCases() {
        return Stream.of(
                Arguments.of(List.of("23:59","00:00"), 1),
                Arguments.of(List.of("00:00","23:59","00:00"), 0),
                Arguments.of(List.of("01:01","02:01","03:00"), 59)
        );
    }

    @ParameterizedTest
    @MethodSource("provideMinimumTimeDifferenceTestCases")
    void findMinDifference(List<String> timePoints, int expected) {
        var actual = new MinimumTimeDifference().findMinDifference(timePoints);

        assertEquals(expected, actual);
    }
}