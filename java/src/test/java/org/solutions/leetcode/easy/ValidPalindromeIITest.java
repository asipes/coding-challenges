package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidPalindromeIITest {

    public static Stream<Arguments> provideValidPalindrome() {
        return Stream.of(
                Arguments.of("aba", true),
                Arguments.of("abca", true),
                Arguments.of("abc", false),
                Arguments.of("eceec", true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideValidPalindrome")
    void validPalindrome(String s, boolean expected) {
        var actual = new ValidPalindromeII().validPalindrome(s);
        assertEquals(expected, actual);
    }
}