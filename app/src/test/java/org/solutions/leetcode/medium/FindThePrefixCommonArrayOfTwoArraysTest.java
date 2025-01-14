package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FindThePrefixCommonArrayOfTwoArraysTest {

    public static Stream<Arguments> provideFindThePrefixCommonArrayOfTwoArraysTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1,3,2,4}, new int[]{3,1,2,4}, new int[]{0,2,3,4}),
                Arguments.of(new int[]{2,3,1}, new int[]{3,1,2}, new int[]{0,1,3})
        );
    }

    @ParameterizedTest
    @MethodSource("provideFindThePrefixCommonArrayOfTwoArraysTestCases")
    void findThePrefixCommonArray(int[] A, int[] B, int[] expected) {
        var actual = new FindThePrefixCommonArrayOfTwoArrays().findThePrefixCommonArray(A, B);

        assertThat(actual).containsExactlyInAnyOrder(expected);
    }
}