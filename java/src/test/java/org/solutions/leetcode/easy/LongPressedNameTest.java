package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongPressedNameTest {

    public static Stream<Arguments> provideIsLongPressedNameTestCases() {
        return Stream.of(
                Arguments.of("alex", "aaleex", true),
                Arguments.of("saeed", "ssaaedd", false),
                Arguments.of("alexd", "ale", false),
                Arguments.of("pyplrz", "ppyypllr", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideIsLongPressedNameTestCases")
    void isLongPressedName(String name, String typed, boolean expected) {
        var actual = new LongPressedName().isLongPressedName(name, typed);
        assertEquals(expected, actual);
    }
}