package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RepeatedSubstringPatternTest {

    public static Stream<Arguments> provideRepeatedSubstringPatternTestCases() {
        return Stream.of(
                Arguments.of("abab", true),
                Arguments.of("aba", false),
                Arguments.of("abcabcabcabc", true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideRepeatedSubstringPatternTestCases")
    void repeatedSubstringPattern(String s, boolean expected) {
        var actual = new RepeatedSubstringPattern().repeatedSubstringPattern(s);
        assertEquals(expected, actual);
    }
}