package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseStringTest {

    public static Stream<Arguments> provideReverseStringTestCases() {
        return Stream.of(
                Arguments.of(new char[]{'h', 'e', 'l', 'l', 'o'}, new char[]{'o', 'l', 'l', 'e', 'h'}),
                Arguments.of(new char[]{'H', 'a', 'n', 'n', 'a', 'h'}, new char[]{'h', 'a', 'n', 'n', 'a', 'H'})
        );
    }

    @ParameterizedTest
    @MethodSource("provideReverseStringTestCases")
    void reverseString(char[] s, char[] expected) {
        new ReverseString().reverseString(s);

        assertArrayEquals(expected, s);
    }
}