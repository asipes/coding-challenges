package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class CountVowelStringsInRangesTest {

    public static Stream<Arguments> provideCountVowelStringsInRangesTestCases() {
        return Stream.of(
                Arguments.of(new String[]{"aba", "bcb", "ece", "aa", "e"}, new int[][]{{0, 2}, {1, 4}, {1, 1}}, new int[]{2, 3, 0}),
                Arguments.of(new String[]{"a", "e", "i"}, new int[][]{{0, 2}, {0, 1}, {2, 2}}, new int[]{3, 2, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("provideCountVowelStringsInRangesTestCases")
    void vowelStrings(String[] words, int[][] queries, int[] expected) {
        CountVowelStringsInRanges countVowelStringsInRanges = new CountVowelStringsInRanges();
        var actual = countVowelStringsInRanges.vowelStrings(words, queries);

        assertThat(actual).contains(expected);
    }
}