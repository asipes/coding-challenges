package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpecialArrayITest {

    public static Stream<Arguments> provideIsArraySpecialTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1}, true),
                Arguments.of(new int[]{2, 1, 4}, true),
                Arguments.of(new int[]{4, 3, 1, 6}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideIsArraySpecialTestCases")
    void isArraySpecial(int[] nums, boolean expected) {
        var actual = new SpecialArrayI().isArraySpecial(nums);
        assertEquals(expected, actual);
    }
}