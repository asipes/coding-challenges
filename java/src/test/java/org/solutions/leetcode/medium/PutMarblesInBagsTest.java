package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PutMarblesInBagsTest {

    public static Stream<Arguments> providePutMarblesTestCases() {
        return Stream.of(
                Arguments.of(
                        new int[]{1,3,5,1},
                        2,
                        4
                ),
                Arguments.of(
                        new int[]{1, 3},
                        2,
                        0
                )
        );
    }

    @ParameterizedTest
    @MethodSource("providePutMarblesTestCases")
    void putMarbles(int[] weights, int k, long expected) {
        var actual = new PutMarblesInBags().putMarbles(weights, k);
        assertEquals(expected, actual);
    }
}