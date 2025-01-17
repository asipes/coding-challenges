package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseVowelsOfAStringTest {

    public static Stream<Arguments> provideReverseVowelsTestCases() {
        return Stream.of(
                Arguments.of("IceCreAm", "AceCreIm"),
                Arguments.of("leetcode", "leotcede")
        );
    }

    @ParameterizedTest
    @MethodSource("provideReverseVowelsTestCases")
    void reverseVowels(String s, String expected) {
        String actual = new ReverseVowelsOfAString().reverseVowels(s);

        assertEquals(expected, actual);
    }
}