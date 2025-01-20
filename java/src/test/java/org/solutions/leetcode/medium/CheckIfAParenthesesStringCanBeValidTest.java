package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckIfAParenthesesStringCanBeValidTest {

    public static Stream<Arguments> provideCheckIfAParenthesesStringCanBeValidTestCases() {
        return Stream.of(
                Arguments.of("))()))", "010100", true),
                Arguments.of("()()", "0000", true),
                Arguments.of(")", "0", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideCheckIfAParenthesesStringCanBeValidTestCases")
    void canBeValid(String s, String locked, boolean expected) {
        var actual = new CheckIfAParenthesesStringCanBeValid().canBeValid(s, locked);

        assertEquals(expected, actual);
    }
}