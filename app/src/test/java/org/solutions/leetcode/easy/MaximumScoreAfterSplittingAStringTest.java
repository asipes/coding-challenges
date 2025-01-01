package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumScoreAfterSplittingAStringTest {

    public static Stream<Arguments> provideMaximumScoreAfterSplittingAStringTestCases() {
        return Stream.of(
                Arguments.of("011101", 5),
                Arguments.of("00111", 5),
                Arguments.of("1111", 3),
                Arguments.of("010", 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideMaximumScoreAfterSplittingAStringTestCases")
    void maxScore(String s, int expected) {
        MaximumScoreAfterSplittingAString maximumScoreAfterSplittingAString = new MaximumScoreAfterSplittingAString();
        var actual = maximumScoreAfterSplittingAString.maxScore(s);

        assertEquals(expected, actual);
    }
}