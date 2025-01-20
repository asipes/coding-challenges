package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConstructKPalindromeStringsTest {

    public static Stream<Arguments> provideConstructKPalindromeStringsTestCases() {
        return Stream.of(
                Arguments.of("annabelle", 2, true),
                Arguments.of("leetcode", 3, false),
                Arguments.of("true", 4, true)

        );
    }

    @ParameterizedTest
    @MethodSource("provideConstructKPalindromeStringsTestCases")
    void canConstruct(String s, int k, boolean expected) {
        var actual = new ConstructKPalindromeStrings().canConstruct(s, k);

        assertEquals(expected, actual);
    }
}