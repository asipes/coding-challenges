package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CountPrefixAndSuffixPairsITest {

    public static Stream<Arguments> provideCountPrefixAndSuffixPairsITestCases() {
        return Stream.of(
                Arguments.of(new String[]{"a","aba","ababa","aa"}, 4),
                Arguments.of(new String[]{"pa","papa","ma","mama"}, 2),
                Arguments.of(new String[]{"abab","ab"}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideCountPrefixAndSuffixPairsITestCases")
    void countPrefixSuffixPairs(String[] words, int expected) {
        CountPrefixAndSuffixPairsI countPrefixAndSuffixPairsI = new CountPrefixAndSuffixPairsI();
        var actual = countPrefixAndSuffixPairsI.countPrefixSuffixPairs(words);

        assertEquals(expected, actual);
    }
}