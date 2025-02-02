package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckIfArrayIsSortedAndRotatedTest {

    public static Stream<Arguments> provideCheckV1TestCases() {
        return Stream.of(
                Arguments.of(new int[]{3, 4, 5, 1, 2}, true),
                Arguments.of(new int[]{2, 1, 3, 4}, false),
                Arguments.of(new int[]{1, 2, 3}, true),
                Arguments.of(new int[]{3, 1, 2, 2, 4}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideCheckV1TestCases")
    void checkV1(int[] nums, boolean expected) {
        var actual = new CheckIfArrayIsSortedAndRotated().checkV1(nums);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideCheckV1TestCases")
    void checkV2(int[] nums, boolean expected) {
        var actual = new CheckIfArrayIsSortedAndRotated().check(nums);
        assertEquals(expected, actual);
    }
}