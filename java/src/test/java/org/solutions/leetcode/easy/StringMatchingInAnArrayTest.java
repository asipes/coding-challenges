package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class StringMatchingInAnArrayTest {

    public static Stream<Arguments> provideStringMatchingInAnArrayTestCases() {
        return Stream.of(
                Arguments.of(new String[]{"mass","as","hero","superhero"}, List.of("as","hero")),
                Arguments.of(new String[]{"leetcode","et","code"}, List.of("et","code")),
                Arguments.of(new String[]{"blue","green","bu"}, List.of()),
                Arguments.of(new String[]{"leetcoder","leetcode","od","hamlet","am"}, List.of("leetcode","od","am"))
        );
    }

    @ParameterizedTest
    @MethodSource("provideStringMatchingInAnArrayTestCases")
    void stringMatching(String[] words, List<String> expected) {
        StringMatchingInAnArray stringMatchingInAnArray = new StringMatchingInAnArray();
        var actual = stringMatchingInAnArray.stringMatching(words);

        assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }
}