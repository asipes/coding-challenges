package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NimGameTest {

    public static Stream<Arguments> provideCanWinNimTestCases() {
        return Stream.of(
                Arguments.of(4, false),
                Arguments.of(3, true),
                Arguments.of(6, true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideCanWinNimTestCases")
    void canWinNim(int n, boolean expected) {
        var actual = new NimGame().canWinNim(n);

        assertEquals(expected, actual);
    }
}