package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsSubsequenceTest {

    public static Stream<Arguments> provideIsSubsequenceTestCases() {
        return Stream.of(
                Arguments.of("abc", "ahbgdc", true),
                Arguments.of("axc", "ahbgdc", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideIsSubsequenceTestCases")
    void isSubsequence(String s, String t, boolean expected) {
        IsSubsequence isSubsequence = new IsSubsequence();
        var actual = isSubsequence.isSubsequence(s, t);

        assertEquals(expected, actual);
    }
}