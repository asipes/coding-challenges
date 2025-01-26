package org.solutions.leetcode.hard;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumEmployeesToBeInvitedToAMeetingTest {

    public static Stream<Arguments> provideMaximumInvitationsTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 1, 8, 9, 10, 11, 12, 13, 7}, 7),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 1}, 6),
                Arguments.of(new int[]{2, 2, 1, 2}, 3),
                Arguments.of(new int[]{1, 2, 0}, 3),
                Arguments.of(new int[]{3, 0, 1, 4, 1}, 4),
                Arguments.of(new int[]{3, 2, 3, 4, 5, 6, 5}, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("provideMaximumInvitationsTestCases")
    void maximumInvitations(int[] favorite, int expected) {
        var actual = new MaximumEmployeesToBeInvitedToAMeeting().maximumInvitations(favorite);

        assertEquals(expected, actual);
    }
}