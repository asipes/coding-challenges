package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniqueNumberOfOccurrencesTest {

    public static Stream<Arguments> provideUniqueOccurrencesTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1,2,2,1,1,3}, true),
                Arguments.of(new int[]{1,2}, false),
                Arguments.of(new int[]{-3,0,1,-3,1,1,1,-3,10,0}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideUniqueOccurrencesTestCases")
    void uniqueOccurrences(int[] arr, boolean expected) {
        var actual = new UniqueNumberOfOccurrences().uniqueOccurrences(arr);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideUniqueOccurrencesTestCases")
    void uniqueOccurrencesV1(int[] arr, boolean expected) {
        var actual = new UniqueNumberOfOccurrences().uniqueOccurrencesV1(arr);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideUniqueOccurrencesTestCases")
    void uniqueOccurrencesV2(int[] arr, boolean expected) {
        var actual = new UniqueNumberOfOccurrences().uniqueOccurrencesV2(arr);
        assertEquals(expected, actual);
    }
}