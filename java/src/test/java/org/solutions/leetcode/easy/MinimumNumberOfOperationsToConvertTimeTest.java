package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumNumberOfOperationsToConvertTimeTest {

    public static Stream<Arguments> provideConvertTime() {
        return Stream.of(
                Arguments.of("02:30", "04:35", 3),
                Arguments.of("11:00", "11:01", 1),
                Arguments.of("00:00", "23:59", 32)
        );
    }

    @ParameterizedTest
    @MethodSource("provideConvertTime")
    void convertTime(String current, String correct, int expected) {
        var actual = new MinimumNumberOfOperationsToConvertTime().convertTime(current, correct);
        assertEquals(expected, actual);
    }
}