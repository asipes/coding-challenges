package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConstructSmallestNumberFromDIStringTest {

    public static Stream<Arguments> provideSmallestNumberTestCases() {
        return Stream.of(
                Arguments.of("IIIDIDDD", "123549876"),
                Arguments.of("DDD", "4321")
        );
    }

    @ParameterizedTest
    @MethodSource("provideSmallestNumberTestCases")
    void smallestNumber(String pattern, String expected) {
        var actual = new ConstructSmallestNumberFromDIString().smallestNumber(pattern);
        assertEquals(expected, actual);
    }
}