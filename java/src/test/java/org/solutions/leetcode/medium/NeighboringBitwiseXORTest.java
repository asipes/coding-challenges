package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NeighboringBitwiseXORTest {

    public static Stream<Arguments> provideNeighboringBitwiseXORTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 0}, true),
                Arguments.of(new int[]{1, 1}, true),
                Arguments.of(new int[]{1, 0}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideNeighboringBitwiseXORTestCases")
    void doesValidArrayExist(int[] derived, boolean expected) {
        var actual = new NeighboringBitwiseXOR().doesValidArrayExist(derived);

        assertEquals(expected, actual);
    }
}