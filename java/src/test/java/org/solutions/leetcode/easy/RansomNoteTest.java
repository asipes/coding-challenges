package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RansomNoteTest {

    public static Stream<Arguments> provideRansomNoteTestCases() {
        return Stream.of(
                Arguments.of("a", "b", false),
                Arguments.of("aa", "ab", false),
                Arguments.of("aa", "aab", true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideRansomNoteTestCases")
    void canConstruct(String ransomNote, String magazine, boolean expected) {
        var actual = new RansomNote().canConstruct(ransomNote, magazine);

        assertEquals(expected, actual);
    }
}