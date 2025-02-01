package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountDistinctNumbersOnBoardTest {

    public static Stream<Arguments> provideDistinctIntegersTestCases() {
        return Stream.of(
                Arguments.of(5, 4),
                Arguments.of(3, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideDistinctIntegersTestCases")
    void distinctIntegers(int n, int expected) {
        var actual = new CountDistinctNumbersOnBoard().distinctIntegers(n);
        assertEquals(expected, actual);
    }
}