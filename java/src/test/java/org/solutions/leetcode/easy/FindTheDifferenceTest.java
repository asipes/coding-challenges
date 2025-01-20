package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FindTheDifferenceTest {

    @ParameterizedTest
    @MethodSource("provideFindTheDifferenceTestCases")
    void findTheDifference(String s, String t, char expected) {
        FindTheDifference findTheDifference = new FindTheDifference();
        var actual = findTheDifference.findTheDifference(s, t);

        assertThat(actual).isEqualTo(expected);
    }

    public static Stream<Arguments> provideFindTheDifferenceTestCases() {
        return Stream.of(
                Arguments.of("abcd", "abcde", 'e'),
                Arguments.of("", "y", 'y'),
                Arguments.of("a", "aa", 'a')
        );
    }
}