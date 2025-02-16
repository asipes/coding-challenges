package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ConstructTheLexicographicallyLargestValidSequenceTest {

    public static Stream<Arguments> provideConstructDistancedSequenceTestCases() {
        return Stream.of(
                Arguments.of(3, new int[]{3, 1, 2, 3, 2}),
                Arguments.of(5, new int[]{5, 3, 1, 4, 3, 5, 2, 4, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("provideConstructDistancedSequenceTestCases")
    void constructDistancedSequence(int n, int[] expected) {
        var actual = new ConstructTheLexicographicallyLargestValidSequence().constructDistancedSequence(n);
        assertArrayEquals(expected, actual);
    }
}