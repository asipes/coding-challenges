package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZeroesTest {

    public static Stream<Arguments> provideMoveZeroesTestCases() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0}),
                Arguments.of(new int[]{0}, new int[]{0})
        );
    }

    @ParameterizedTest
    @MethodSource("provideMoveZeroesTestCases")
    void moveZeroes(int[] nums, int[] expected) {
        new MoveZeroes().moveZeroes(nums);

        assertArrayEquals(expected, nums);
    }
}