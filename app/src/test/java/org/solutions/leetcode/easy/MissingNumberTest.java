package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingNumberTest {

    @ParameterizedTest
    @MethodSource("provideMissingNumberProviderTest")
    void missingNumber(int[] arr, int expected) {
        MissingNumber missingNumber = new MissingNumber();
        var actual = missingNumber.missingNumber(arr);

        assertEquals(expected, actual);
    }

    public static Stream<Arguments> provideMissingNumberProviderTest() {
        return Stream.of(
                Arguments.of(new int[]{3, 0, 1}, 2),
                Arguments.of(new int[]{0, 1}, 2),
                Arguments.of(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}, 8)
        );
    }
}