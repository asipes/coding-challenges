package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowerOfFourTest {

    public static Stream<Arguments> provideIsPowerOfFourTestCases() {
        return Stream.of(
                Arguments.of(16, true),
                Arguments.of(5, false),
                Arguments.of(1, true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideIsPowerOfFourTestCases")
    void isPowerOfFour(int n, boolean expected) {
        var actual = new PowerOfFour().isPowerOfFour(n);

        assertEquals(expected, actual);
    }
}