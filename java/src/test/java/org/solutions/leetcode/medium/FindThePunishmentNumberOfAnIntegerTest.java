package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
class FindThePunishmentNumberOfAnIntegerTest {

    public static Stream<Arguments> providePunishmentNumber() {
        return Stream.of(
                Arguments.of(10, 182),
                Arguments.of(37, 1478)
        );
    }

    @ParameterizedTest
    @MethodSource("providePunishmentNumber")
    void punishmentNumber(int n, int expected) {
        var actual = new FindThePunishmentNumberOfAnInteger().punishmentNumber(n);
        assertEquals(expected, actual);
    }
}