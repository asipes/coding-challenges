package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumRecolorsToGetKConsecutiveBlackBlocksTest {

    public static Stream<Arguments> provideMinimumRecolorsTestCases() {
        return Stream.of(
                Arguments.of("WBBWWBBWBW", 7, 3),
                Arguments.of("WBWBBBW", 2, 0),
                Arguments.of("BWWWBB", 6, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideMinimumRecolorsTestCases")
    void minimumRecolors(String blocks, int k, int expected) {
        var actual = new MinimumRecolorsToGetKConsecutiveBlackBlocks().minimumRecolors(blocks, k);
        assertEquals(expected, actual);
    }
}