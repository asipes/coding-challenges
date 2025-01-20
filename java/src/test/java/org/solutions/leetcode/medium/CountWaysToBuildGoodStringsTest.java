package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountWaysToBuildGoodStringsTest {

    public static Stream<Arguments> provideCountWaysToBuildGoodStringsTestCases() {
        return Stream.of(
                Arguments.of(3, 3, 1, 1, 8),
                Arguments.of(2, 3, 1, 2, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("provideCountWaysToBuildGoodStringsTestCases")
    void countGoodStrings(int low, int high, int zero, int one, int expected) {
        CountWaysToBuildGoodStrings countWaysToBuildGoodStrings = new CountWaysToBuildGoodStrings();
        var actual = countWaysToBuildGoodStrings.countGoodStrings(low, high, zero, one);

        assertEquals(expected, actual);
    }
}