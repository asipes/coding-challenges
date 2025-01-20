package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PerfectNumberTest {

    public static Stream<Arguments> providePerfectNumberTestCases() {
        return Stream.of(
                Arguments.of(28, true),
                Arguments.of(7, false),
                Arguments.of(6, true),
                Arguments.of(1, false)
        );
    }

    @ParameterizedTest
    @MethodSource("providePerfectNumberTestCases")
    void checkPerfectNumber(int num, boolean expected) {
        var actual = new PerfectNumber().checkPerfectNumber(num);

        assertEquals(expected, actual);
    }
}