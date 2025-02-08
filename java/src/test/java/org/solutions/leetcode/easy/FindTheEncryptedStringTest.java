package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheEncryptedStringTest {

    public static Stream<Arguments> provideGetEncryptedString() {
        return Stream.of(
                Arguments.of("dart", 3, "tdar"),
                Arguments.of("aaa", 1, "aaa")
        );
    }

    @ParameterizedTest
    @MethodSource("provideGetEncryptedString")
    void getEncryptedString(String s, int k, String expected) {
        var actual = new FindTheEncryptedString().getEncryptedString(s, k);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideGetEncryptedString")
    void getEncryptedStringV2(String s, int k, String expected) {
        var actual = new FindTheEncryptedString().getEncryptedStringV2(s, k);
        assertEquals(expected, actual);
    }
}