package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountingWordsWithAGivenPrefixTest {

    public static Stream<Arguments> provideCountingWordsWithAGivenPrefixTestCases() {
        return Stream.of(
                Arguments.of(new String[]{"pay","attention","practice","attend"}, "at", 2),
                Arguments.of(new String[]{"leetcode","win","loops","success"}, "code", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideCountingWordsWithAGivenPrefixTestCases")
    void prefixCount(String[] words, String pref, int expected) {
        CountingWordsWithAGivenPrefix countingWordsWithAGivenPrefix = new CountingWordsWithAGivenPrefix();
        var actual = countingWordsWithAGivenPrefix.prefixCount(words, pref);

        assertEquals(expected, actual);
    }
}