package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstUniqueCharacterInAStringTest {

    public static Stream<Arguments> provideFirstUniqCharTestCases() {
        return Stream.of(
                Arguments.of("leetcode", 0),
                Arguments.of("loveleetcode", 2),
                Arguments.of("aabb", -1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideFirstUniqCharTestCases")
    void firstUniqChar(String s, int expected) {
        var actual = new FirstUniqueCharacterInAString().firstUniqCharV1(s);
        assertEquals(expected, actual);

        actual = new FirstUniqueCharacterInAString().firstUniqCharV2(s);
        assertEquals(expected, actual);
    }
}