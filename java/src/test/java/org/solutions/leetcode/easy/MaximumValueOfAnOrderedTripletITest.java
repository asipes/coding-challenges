package org.solutions.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaximumValueOfAnOrderedTripletITest {

    public static Stream<Arguments> provideMaximumTripletValueTestCases() {
        return Stream.of(
                Arguments.of(
                        new int[]{12,6,1,2,7},
                        77
                ),
                Arguments.of(
                        new int[]{1,10,3,4,19},
                        133
                ),
                Arguments.of(
                        new int[]{1,2,3},
                        0
                )
        );
    }

    @ParameterizedTest
    @MethodSource("provideMaximumTripletValueTestCases")
    void maximumTripletValue(int[] nums, int expected) {
        var actual = new MaximumValueOfAnOrderedTripletI().maximumTripletValue(nums);
        assertEquals(expected, actual);
    }
}