package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ThirdMaximumNumberTest {

    @ParameterizedTest
    @MethodSource("provideThirdMaximumNumberTestCases")
    void thirdMax(int[] nums, int expected) {
        ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();
        var actual = thirdMaximumNumber.thirdMax(nums);

        assertThat(actual).isEqualTo(expected);
    }

    public static Stream<Arguments> provideThirdMaximumNumberTestCases() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 1}, 1),
                Arguments.of(new int[]{1, 2}, 2),
                Arguments.of(new int[]{2, 2, 3, 1}, 1),
                Arguments.of(new int[]{1, 2, -2147483648}, -2147483648)
        );
    }
}