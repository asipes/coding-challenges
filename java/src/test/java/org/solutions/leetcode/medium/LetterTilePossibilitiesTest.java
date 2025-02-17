package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LetterTilePossibilitiesTest {

    public static Stream<Arguments> provideNumTilePossibilitiesTestCases() {
        return Stream.of(
                Arguments.of("AAB", 8),
                Arguments.of("AAABBC", 188),
                Arguments.of("V", 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideNumTilePossibilitiesTestCases")
    void numTilePossibilities(String tiles, int expected) {
        var actual = new LetterTilePossibilities().numTilePossibilities(tiles);
        assertEquals(expected, actual);
    }
}