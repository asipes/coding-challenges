package org.solutions.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GuessNumberHigherOrLowerTest {

    @ParameterizedTest
    @MethodSource("provideGuessNumberTestCases")
    void guessNumber(int n, int pick) {
        GuessNumberHigherOrLower guessNumberHigherOrLower = new GuessNumberHigherOrLower() {
            @Override
            public int guess(int num) {
                return Integer.compare(pick, num);
            }
        };

        int actual = guessNumberHigherOrLower.guessNumber(n);
        assertThat(actual).isEqualTo(pick);
    }

    public static Stream<Arguments> provideGuessNumberTestCases() {
        return Stream.of(
                Arguments.of(10, 6),
                Arguments.of(1, 1),
                Arguments.of(80, 57)
        );
    }
}