package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class WordSubsetsTest {

    public static Stream<Arguments> provideWordSubsetsTestCases() {
        return Stream.of(
                Arguments.of(new String[]{"amazon", "apple", "facebook", "google", "leetcode"}, new String[]{"e", "o"}, List.of("facebook", "google", "leetcode")),
                Arguments.of(new String[]{"amazon", "apple", "facebook", "google", "leetcode"}, new String[]{"l", "e"}, List.of("apple", "google", "leetcode")),
                Arguments.of(new String[]{"amazon", "apple", "facebook", "google", "leetcode"}, new String[]{"lo", "eo"}, List.of("google", "leetcode"))
        );
    }

    @ParameterizedTest
    @MethodSource("provideWordSubsetsTestCases")
    void wordSubsets(String[] words1, String[] words2, List<String> expected) {
        var actual = new WordSubsets().wordSubsets(words1, words2);

        assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }
}