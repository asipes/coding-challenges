package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DivisorGameTest {

    public static Stream<Arguments> provideDivisorGameTestCases() {
        return Stream.of(
                Arguments.of(2, true),
                Arguments.of(3, false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideDivisorGameTestCases")
    void divisorGame(int n, boolean expected) {
        var actual = new DivisorGame().divisorGame(n);

        assertEquals(expected, actual);
    }
}