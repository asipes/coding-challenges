package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheTownJudgeTest {

    public static Stream<Arguments> provideFindJudgeTestCases() {
        return Stream.of(
                Arguments.of(2, new int[][]{{1, 2}}, 2),
                Arguments.of(3, new int[][]{{1, 3}, {2, 3}}, 3),
                Arguments.of(3, new int[][]{{1, 3}, {2, 3}, {3, 1}}, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideFindJudgeTestCases")
    void findJudgeV3(int n, int[][] trust, int expected) {
        var actual = new FindTheTownJudge().findJudge(n, trust);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideFindJudgeTestCases")
    void findJudgeV2(int n, int[][] trust, int expected) {
        var actual = new FindTheTownJudge().findJudgeV2(n, trust);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideFindJudgeTestCases")
    void findJudgeV1(int n, int[][] trust, int expected) {
        var actual = new FindTheTownJudge().findJudgeV1(n, trust);
        assertEquals(expected, actual);
    }
}