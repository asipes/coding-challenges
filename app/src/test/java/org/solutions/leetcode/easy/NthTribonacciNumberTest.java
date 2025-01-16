package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NthTribonacciNumberTest {

    public static Stream<Arguments> provideNthTribonacciNumberTestCases() {
        return Stream.of(
                Arguments.of(4, 4),
                Arguments.of(25, 1389537)
        );
    }

    @ParameterizedTest
    @MethodSource("provideNthTribonacciNumberTestCases")
    void tribonacci(int n, int expected) {
        var actual = new NthTribonacciNumber().tribonacci(n);

        assertEquals(expected, actual);
    }
}