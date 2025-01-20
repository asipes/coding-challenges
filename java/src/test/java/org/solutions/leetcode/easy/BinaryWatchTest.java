package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryWatchTest {

    public static Stream<Arguments> provideReadBinaryWatchTestCases() {
        return Stream.of(
                Arguments.of(1, List.of("0:01", "0:02", "0:04", "0:08", "0:16", "0:32", "1:00", "2:00", "4:00", "8:00")),
                Arguments.of(9, List.of())
        );
    }

    @ParameterizedTest
    @MethodSource("provideReadBinaryWatchTestCases")
    void readBinaryWatch(int turnedOn, List<String> expected) {
        var actual = new BinaryWatch().readBinaryWatch(turnedOn);

        assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }
}