package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimizeXORTest {

    public static Stream<Arguments> provideMinimizeXORTestCases() {
        return Stream.of(
                Arguments.of(3, 5, 3),
                Arguments.of(1, 12, 3),
                Arguments.of(25, 72, 24),
                Arguments.of(79, 74, 76)
        );
    }

    @ParameterizedTest
    @MethodSource("provideMinimizeXORTestCases")
    void minimizeXor(int num1, int num2, int expected) {
        var actual = new MinimizeXOR().minimizeXor(num1, num2);

        assertEquals(expected, actual);
    }
}