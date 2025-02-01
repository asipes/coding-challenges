package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestPerimeterTriangleTest {

    public static Stream<Arguments> provideLargestPerimeterTestCases() {
        return Stream.of(
                Arguments.of(new int[]{2,1,2}, 5),
                Arguments.of(new int[]{1,2,1,10}, 0),
                Arguments.of(new int[]{3,6,2,3}, 8)
        );
    }

    @ParameterizedTest
    @MethodSource("provideLargestPerimeterTestCases")
    void largestPerimeter(int[] nums, int expected) {
        var actual = new LargestPerimeterTriangle().largestPerimeter(nums);
        assertEquals(expected, actual);
    }
}