package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckIfNumberIsASumOfPowersOfThreeTest {

    public static Stream<Arguments> provideCheckPowersOfThreeTestCases() {
        return Stream.of(
                Arguments.of(12, true),
                Arguments.of(91, true),
                Arguments.of(21, true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideCheckPowersOfThreeTestCases")
    void checkPowersOfThree(int n, boolean expected) {
        var actual = new CheckIfNumberIsASumOfPowersOfThree().checkPowersOfThree(n);
        assertEquals(expected, actual);
    }
}