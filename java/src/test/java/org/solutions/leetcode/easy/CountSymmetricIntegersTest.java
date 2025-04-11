package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountSymmetricIntegersTest {

    public static Stream<Arguments> provideCountSymmetricIntegersTestCases() {
        return Stream.of(
                Arguments.of(1, 100, 9),
                Arguments.of(1200, 1230, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("provideCountSymmetricIntegersTestCases")
    void countSymmetricIntegers(int low, int high, int expected) {
        var actual = new CountSymmetricIntegers().countSymmetricIntegers(low, high);
        assertEquals(expected, actual);
    }
}