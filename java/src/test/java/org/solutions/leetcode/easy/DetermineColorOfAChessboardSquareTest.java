package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DetermineColorOfAChessboardSquareTest {

    public static Stream<Arguments> provideSquareIsWhite() {
        return Stream.of(
                Arguments.of("a1", false),
                Arguments.of("h3", true),
                Arguments.of("c7", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideSquareIsWhite")
    void squareIsWhite(String coordinates, boolean expected) {
        var actual = new DetermineColorOfAChessboardSquare().squareIsWhite(coordinates);
        assertEquals(expected, actual);
    }
}