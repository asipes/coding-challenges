package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheNumberOfGoodPairsITest {

    public static Stream<Arguments> provideNumberOfPairs() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 4}, new int[]{1, 3, 4}, 1, 5),
                Arguments.of(new int[]{1, 2, 4, 12}, new int[]{2, 4}, 3, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideNumberOfPairs")
    void numberOfPairs(int[] nums1, int[] nums2, int k, int expected) {
        var actual = new FindTheNumberOfGoodPairsI().numberOfPairs(nums1, nums2, k);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideNumberOfPairs")
    void numberOfPairsV2(int[] nums1, int[] nums2, int k, int expected) {
        var actual = new FindTheNumberOfGoodPairsI().numberOfPairsV2(nums1, nums2, k);
        assertEquals(expected, actual);
    }
}