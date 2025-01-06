package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumNumberOfOperationsToMoveAllBallsToEachBoxTest {

    public static Stream<Arguments> provideMinimumNumberOfOperationsToMoveAllBallsToEachBoxTestCases() {
        return Stream.of(
                Arguments.of("110", new int[]{1,1,3}),
                Arguments.of("001011", new int[]{11,8,5,4,3,4})
        );
    }

    @ParameterizedTest
    @MethodSource("provideMinimumNumberOfOperationsToMoveAllBallsToEachBoxTestCases")
    void minOperations(String boxes, int[] expected) {
        MinimumNumberOfOperationsToMoveAllBallsToEachBox minimumNumberOfOperationsToMoveAllBallsToEachBox =
                new MinimumNumberOfOperationsToMoveAllBallsToEachBox();
        var actual = minimumNumberOfOperationsToMoveAllBallsToEachBox.minOperations(boxes);

        assertThat(actual).containsExactly(expected);
    }
}