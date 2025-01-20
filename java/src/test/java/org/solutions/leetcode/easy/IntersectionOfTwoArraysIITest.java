package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;


class IntersectionOfTwoArraysIITest {

    @ParameterizedTest
    @MethodSource("provideIntersectionTestCases")
    void intersection(int[] nums1, int[] nums2, int[] expected) {
        IntersectionOfTwoArraysII intersectionOfTwoArrays = new IntersectionOfTwoArraysII();
        var actual = intersectionOfTwoArrays.intersect(nums1, nums2);

        assertThat(actual).containsExactlyInAnyOrder(expected);
    }

    public static Stream<Arguments> provideIntersectionTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 2, 1}, new int[]{2, 2}, new int[]{2, 2}),
                Arguments.of(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}, new int[]{4, 9}),
                Arguments.of(new int[]{1, 2}, new int[]{1, 1}, new int[]{1})
        );
    }
}