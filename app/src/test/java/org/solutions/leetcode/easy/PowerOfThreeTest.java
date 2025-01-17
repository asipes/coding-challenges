package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowerOfThreeTest {

    public static Stream<Arguments> provideIsPowerOfThreeTestCases() {
        return Stream.of(
                Arguments.of(27, true),
                Arguments.of(0, false),
                Arguments.of(-1, false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideIsPowerOfThreeTestCases")
    void isPowerOfThree(int n, boolean expected) {
        var actual = new PowerOfThree().isPowerOfThree(n);

        assertEquals(expected, actual);
    }
}