package org.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidAnagramTest {



    @ParameterizedTest
    @MethodSource("provideAnagramTestCases")
    void isAnagram(String s, String t, boolean expected) {
        ValidAnagram validAnagram = new ValidAnagram();
        var actual = validAnagram.isAnagram(s, t);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideAnagramTestCases() {
        return Stream.of(
                Arguments.of("anagram", "nagaram", true),
                Arguments.of("rat", "car", false)
        );
    }
}