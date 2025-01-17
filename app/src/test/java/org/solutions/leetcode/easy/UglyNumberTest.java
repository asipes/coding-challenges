package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UglyNumberTest {

    public static Stream<Arguments> provideIsUglyTestCases() {
        return Stream.of(
                Arguments.of(6, true),
                Arguments.of(1, true),
                Arguments.of(14, false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideIsUglyTestCases")
    void isUgly(int n, boolean expected) {
        var actual = new UglyNumber().isUgly(n);

        assertEquals(expected, actual);
    }
}