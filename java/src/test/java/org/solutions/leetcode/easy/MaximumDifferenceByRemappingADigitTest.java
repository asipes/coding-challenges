package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumDifferenceByRemappingADigitTest {

    public static Stream<Arguments> provideMinMaxDifference() {
        return Stream.of(
//                Arguments.of(11891, 99009),
//                Arguments.of(90, 99),
                Arguments.of(456, 900)
        );
    }

    @ParameterizedTest
    @MethodSource("provideMinMaxDifference")
    void minMaxDifference(int num, int expected) {
        var actual = new MaximumDifferenceByRemappingADigit().minMaxDifference(num);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideMinMaxDifference")
    void minMaxDifferenceV2(int num, int expected) {
        var actual = new MaximumDifferenceByRemappingADigit().minMaxDifferenceV2(num);
        assertEquals(expected, actual);
    }
}