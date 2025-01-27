package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class CourseScheduleIVTest {

    public static Stream<Arguments> provideCheckIfPrerequisiteTestCases() {
        return Stream.of(
                Arguments.of(
                        2,
                        new int[][]{{1, 0}},
                        new int[][]{{0, 1}, {1, 0}},
                        List.of(false, true)
                ),
                Arguments.of(
                        2,
                        new int[][]{},
                        new int[][]{{1, 0}, {0, 1}},
                        List.of(false, false)
                ),
                Arguments.of(
                        3,
                        new int[][]{{1, 2}, {1, 0}, {2, 0}},
                        new int[][]{{1, 0}, {1, 2}},
                        List.of(true, true)
                ),
                Arguments.of(
                        5,
                        new int[][]{{0,1}, {1,2}, {2,3}, {3,4}},
                        new int[][]{{0,4}, {4,0}, {1,3}, {3,0}},
                        List.of(true,false,true,false)
                )
        );
    }

    @ParameterizedTest
    @MethodSource("provideCheckIfPrerequisiteTestCases")
    void checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries, List<Boolean> expected) {
        var actual = new CourseScheduleIV().checkIfPrerequisite(numCourses, prerequisites, queries);

        assertThat(actual).isEqualTo(expected);
    }
}