package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddDigitsTest {

    public static Stream<Arguments> provideAddDigitsTestCases() {
        return Stream.of(
                Arguments.of(38, 2),
                Arguments.of(0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideAddDigitsTestCases")
    void addDigits(int num, int expected) {
        var actual = new AddDigits().addDigits(num);

        assertEquals(expected, actual);
    }
}