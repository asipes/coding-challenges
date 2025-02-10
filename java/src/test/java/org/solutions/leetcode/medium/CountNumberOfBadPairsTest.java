package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountNumberOfBadPairsTest {

    public static Stream<Arguments> provideCountBadPairs() {
        return Stream.of(
                Arguments.of(new int[]{4,1,3,3}, 5),
                Arguments.of(new int[]{1,2,3,4,5}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideCountBadPairs")
    void countBadPairs(int[] nums, long expected) {
        var actual = new CountNumberOfBadPairs().countBadPairs(nums);
        assertEquals(expected, actual);
    }
}