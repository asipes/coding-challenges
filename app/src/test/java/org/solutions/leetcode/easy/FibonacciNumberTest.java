package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciNumberTest {

    public static Stream<Arguments> provideFibonacciNumberTestCases() {
        return Stream.of(
                Arguments.of(2, 1),
                Arguments.of(3, 2),
                Arguments.of(4, 3),
                Arguments.of(5, 5),
                Arguments.of(6, 8)
        );
    }

    @ParameterizedTest
    @MethodSource("provideFibonacciNumberTestCases")
    void fib(int n , int expected) {
        var actual = new FibonacciNumber().fib(n);

        assertEquals(expected, actual);
    }
}