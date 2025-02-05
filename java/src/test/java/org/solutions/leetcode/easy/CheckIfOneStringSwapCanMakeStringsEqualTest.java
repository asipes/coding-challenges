package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckIfOneStringSwapCanMakeStringsEqualTest {

    public static Stream<Arguments> provideAreAlmostEqualTestCases() {
        return Stream.of(
                Arguments.of("bank", "kanb", true),
                Arguments.of("attack", "defend", false),
                Arguments.of("kelb", "kelb", true),
                Arguments.of("qgqeg", "gqgeq", false),
                Arguments.of("aa", "ac", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideAreAlmostEqualTestCases")
    void areAlmostEqual(String s1, String s2, boolean expected) {
        var actual = new CheckIfOneStringSwapCanMakeStringsEqual().areAlmostEqual(s1, s2);
        assertEquals(expected, actual);
    }
}