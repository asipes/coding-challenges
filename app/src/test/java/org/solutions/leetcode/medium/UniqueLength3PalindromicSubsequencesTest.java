package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniqueLength3PalindromicSubsequencesTest {

    public static Stream<Arguments> provideUniqueLength3PalindromicSubsequencesTestCases() {
        return Stream.of(
                Arguments.of("aabca", 3),
                Arguments.of("adc", 0),
                Arguments.of("bbcbaba", 4)
        );
    }

    @ParameterizedTest
    @MethodSource("provideUniqueLength3PalindromicSubsequencesTestCases")
    void countPalindromicSubsequence(String s, int expected) {
        UniqueLength3PalindromicSubsequences uniqueLength3PalindromicSubsequences = new UniqueLength3PalindromicSubsequences();
        var actual = uniqueLength3PalindromicSubsequences.countPalindromicSubsequence(s);

        assertEquals(expected, actual);
    }
}