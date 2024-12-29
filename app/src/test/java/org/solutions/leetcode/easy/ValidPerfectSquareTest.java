package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.solutions.leetcode.easy.ValidPerfectSquare;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
class ValidPerfectSquareTest {

    @ParameterizedTest
    @MethodSource("providePerfectSquareTestCases")
    void isPerfectSquare(int num, boolean expected) {
        ValidPerfectSquare validPerfectSquare = new ValidPerfectSquare();
        boolean actual = validPerfectSquare.isPerfectSquare(num);

        assertThat(actual).isEqualTo(expected);
    }

    public static Stream<Arguments> providePerfectSquareTestCases() {
        return Stream.of(
                Arguments.of(16, true),
                Arguments.of(25, true),
                Arguments.of(13, false),
                Arguments.of(14, false),
                Arguments.of(2147483647, false)

        );
    }
}