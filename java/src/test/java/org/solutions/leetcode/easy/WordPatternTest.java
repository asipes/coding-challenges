package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordPatternTest {

    public static Stream<Arguments> provideWordPatternTestCases() {
        return Stream.of(
                Arguments.of("abba", "dog cat cat dog", true),
                Arguments.of("abba", "dog cat cat fish", false),
                Arguments.of("aaaa", "dog cat cat dog", false),
                Arguments.of("abba", "dog dog dog dog", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideWordPatternTestCases")
    void wordPattern(String pattern, String s, boolean expected) {
        var actual = new WordPattern().wordPattern(pattern, s);

        assertEquals(expected, actual);
    }
}