package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class BestSightseeingPairTest {

    @ParameterizedTest
    @MethodSource("provideMaxScoreSightseeingPairTestCases")
    void maxScoreSightseeingPair(int[] values, int expected) {
        BestSightseeingPair bestSightseeingPair = new BestSightseeingPair();
        var actual = bestSightseeingPair.maxScoreSightseeingPair(values);

        assertThat(actual).isEqualTo(expected);
    }

    public static Stream<Arguments> provideMaxScoreSightseeingPairTestCases() {
        return Stream.of(
                Arguments.of(new int[]{8, 1, 5, 2, 6}, 11),
                Arguments.of(new int[]{1, 2}, 2)
        );
    }
}