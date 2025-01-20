package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumRepeatingSubstringTest {

    public static Stream<Arguments> provideMaximumRepeatingSubstringTestCases() {
        return Stream.of(
                Arguments.of("ababc", "ab", 2),
                Arguments.of("ababc", "ba", 1),
                Arguments.of("ababc", "ac", 0),
                Arguments.of("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "aaaba", 5)
        );
    }

    @ParameterizedTest
    @MethodSource("provideMaximumRepeatingSubstringTestCases")
    void maxRepeating(String sequence, String word, int expected) {
        var actual = new MaximumRepeatingSubstring().maxRepeating(sequence, word);

        assertEquals(expected, actual);
    }
}