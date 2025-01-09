package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class CountingBitsTest {

    public static Stream<Arguments> provideCountingBitsTestCases() {
        return Stream.of(
                Arguments.of(2, new int[]{0,1,1}),
                Arguments.of(5, new int[]{0,1,1,2,1,2})
        );
    }

    @ParameterizedTest
    @MethodSource("provideCountingBitsTestCases")
    void countBits(int n, int[] expected) {
        CountingBits countingBits = new CountingBits();
        var actual = countingBits.countBits(n);

        assertThat(actual).containsExactlyInAnyOrder(expected);
    }
}