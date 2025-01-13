package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumLengthOfStringAfterOperationsTest {

    public static Stream<Arguments> provideMinimumLengthOfStringAfterOperationsTestCases() {
        return Stream.of(
                Arguments.of("abaacbcbb", 5),
                Arguments.of("aa", 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideMinimumLengthOfStringAfterOperationsTestCases")
    void minimumLength(String s, int expected) {
        var actual = new MinimumLengthOfStringAfterOperations().minimumLength(s);

        assertEquals(expected, actual);
    }
}