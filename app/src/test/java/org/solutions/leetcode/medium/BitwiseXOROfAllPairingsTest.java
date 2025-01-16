package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BitwiseXOROfAllPairingsTest {

    public static Stream<Arguments> provideBitwiseXOROfAllPairingsTestCases() {
        return Stream.of(
                Arguments.of(new int[]{2,1,3}, new int[]{10,2,5,0}, 13),
                Arguments.of(new int[]{1,2}, new int[]{3,4}, 0),
                Arguments.of(new int[]{8,6,29,2,26,16,15,29}, new int[]{24,12,12}, 9)
        );
    }

    @ParameterizedTest
    @MethodSource("provideBitwiseXOROfAllPairingsTestCases")
    void xorAllNums(int[] nums1, int[] nums2, int expected) {
        var actual = new BitwiseXOROfAllPairings().xorAllNums(nums1, nums2);

        assertEquals(expected, actual);
    }
}