package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShiftingLettersIITest {

    public static Stream<Arguments> provideShiftingLettersIITestCases() {
        return Stream.of(
                Arguments.of("abc", new int[][]{{0,1,0}, {1,2,1}, {0,2,1}}, "ace"),
                Arguments.of("dztz", new int[][]{{0,0,0}, {1,1,1}}, "catz")
        );
    }

    @ParameterizedTest
    @MethodSource("provideShiftingLettersIITestCases")
    void shiftingLetters(String s, int[][] shifts, String expected) {
        ShiftingLettersII shiftingLettersII = new ShiftingLettersII();
        var actual = shiftingLettersII.shiftingLetters(s, shifts);

        assertEquals(expected, actual);
    }
}