package org.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

class IntersectionOfTwoArraysTest {

    @ParameterizedTest
    @MethodSource("provideIntersectionTestCases")
    void intersection(int[] nums1, int[] nums2, Integer[] expected) {
        IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();
        var actual = intersectionOfTwoArrays.intersection(nums1, nums2);

        var boxedActual = Arrays.stream(actual).boxed().collect(Collectors.toList());

        assertThat(boxedActual, containsInAnyOrder(expected));
    }

    public static Stream<Arguments> provideIntersectionTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 2, 1}, new int[]{2, 2}, new Integer[]{2}),
                Arguments.of(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}, new Integer[]{4, 9}),
                Arguments.of(new int[]{1, 2}, new int[]{1, 1}, new Integer[]{1})
        );
    }
}