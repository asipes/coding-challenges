package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveAllOccurrencesOfASubstringTest {

    public static Stream<Arguments> provideRemoveOccurrencesTestCases() {
        return Stream.of(
                Arguments.of("daabcbaabcbc", "abc", "dab"),
                Arguments.of("axxxxyyyyb", "xy", "ab")
        );
    }

    @ParameterizedTest
    @MethodSource("provideRemoveOccurrencesTestCases")
    void removeOccurrences(String s, String part, String expected) {
        var actual = new RemoveAllOccurrencesOfASubstring().removeOccurrences(s, part);
        assertEquals(expected, actual);
    }
}