package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimizeStringLengthTest {

    public static Stream<Arguments> provideMinimizeStringLengthTestCases() {
        return Stream.of(
                Arguments.of("aaabc", 3),
                Arguments.of("cbbd", 3),
                Arguments.of("baadccab", 4)
        );
    }

    @ParameterizedTest
    @MethodSource("provideMinimizeStringLengthTestCases")
    void minimizedStringLength(String s, int expected) {
        var actual = new MinimizeStringLength().minimizedStringLength(s);

        assertEquals(expected, actual);
    }
}