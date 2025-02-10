package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClearDigitsTest {

    public static Stream<Arguments> provideClearDigits() {
        return Stream.of(
                Arguments.of("abc", "abc"),
                Arguments.of("cb34", "")
        );
    }

    @ParameterizedTest
    @MethodSource("provideClearDigits")
    void clearDigits(String s, String expected) {
        var actual = new ClearDigits().clearDigits(s);
        assertEquals(expected, actual);
    }
}