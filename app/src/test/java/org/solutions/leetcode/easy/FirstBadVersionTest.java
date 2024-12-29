package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstBadVersionTest {

    @ParameterizedTest
    @MethodSource("provideFirstBadVersionTestCases")
    void firstBadVersion(int n, int version) {

        FirstBadVersion firstBadVersion = new FirstBadVersion() {

            @Override
            public boolean isBadVersion(int version) {
                int firstBad = 4;
                return version >= firstBad;
            }
        };

        var actual = firstBadVersion.firstBadVersion(n);

        assertEquals(version, actual);
    }

    public static Stream<Arguments> provideFirstBadVersionTestCases() {
        return Stream.of(
                Arguments.of(5, 4),
                Arguments.of(1, 1)
        );
    }
}