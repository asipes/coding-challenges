package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestUnequalAdjacentGroupsSubsequenceITest {

    public static Stream<Arguments> provideLongestUnequalAdjacentGroupsSubsequenceITestCases() {
        return Stream.of(
                Arguments.of(new String[]{"e", "a", "b"}, new int[]{0, 0, 1}, List.of("e", "b")),
                Arguments.of(new String[]{"a", "b", "c", "d"}, new int[]{1, 0, 1, 1}, List.of("a", "b", "c"))
        );
    }

    @ParameterizedTest
    @MethodSource("provideLongestUnequalAdjacentGroupsSubsequenceITestCases")
    void getLongestSubsequence(String[] words, int[] groups, List<String> expected) {
        var actual = new LongestUnequalAdjacentGroupsSubsequenceI().getLongestSubsequence(words, groups);

        assertEquals(expected, actual);
    }
}